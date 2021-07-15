package com.iic.pmrda.db.dao;

import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.iic.pmrda.db.bean.Test;

@Repository
public class TestRepo {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate template;
	
	public int updateDate(Test test) {
		
		
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	    String sql = "Update Test "
	    		+ "Set Layer=COALESCE(:layer,Layer),"
	    		+ "landuse_type=COALESCE(:landuse_type,landuse_type),"
	    		+ "landUse_Su=COALESCE(:landuse_su,landUse_Su),"
	    		+ "Labels=COALESCE(:labels,Labels),"
	    		+ "NAME=COALESCE(:name,NAME),"
	    		+ "GUTNO=COALESCE(:gutno,GUTNO),"
	    		+ "VILLAGE_NA=COALESCE(:village_na,VILLAGE_NA),"
	    		+ "EST_YEAR=COALESCE(:est_year,EST_YEAR),"
	    		+ "SITE_OWNER=COALESCE(:site_owner,SITE_OWNER),"
	    		+ "SITE_APPRV=COALESCE(:site_apprv,SITE_APPRV),"
	    		+ "SITE_L_USE=COALESCE(:site_l_use,SITE_L_USE),"
	    		+ "SITE_L_STA=COALESCE(:site_l_sta,SITE_L_STA),"
	    		+ "SITE_APP_L=COALESCE(:site_app_l,SITE_APP_L),"
	    		+ "SITE_BUILT=COALESCE(:site_built,SITE_BUILT),"
	    		+ "SITE_PARKI=COALESCE(:site_parki,SITE_PARKI),"
	    		+ "E_TYPE=COALESCE(:e_type,E_TYPE),"
	    		+ "H_OWNERSHI=COALESCE(:h_ownershi,H_OWNERSHI),"
	    		+ "H_SERF_AMB=COALESCE(:h_serf_amb,H_SERF_AMB),"
	    		+ "I_VILLAGEW=COALESCE(:i_villagew,I_VILLAGEW),"
	    		+ "I_GESTAION=COALESCE(:i_gestaion,I_GESTAION)"
	    		+ " where GISID=:gisid";
	    System.out.println(sql);
	    BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(test);
	    System.out.println(paramMap);
	    return jdbcTemplate.update(sql, paramMap);
	}
	
	 public Test findById(String id) {

	        String sql = "SELECT * FROM Test WHERE gisid = ?";

	        return (Test) template.queryForObject(
	            sql, 
	            new Object[]{id}, 
	            new BeanPropertyRowMapper<Test>(Test.class));

	    }
	 
	 public List<Test> findAll() {

	        String sql = "SELECT * FROM Test";

	        List<Test> customers = template.query(
	                sql,
	                new BeanPropertyRowMapper<Test>(Test.class));

	        return customers;
	    }

}
