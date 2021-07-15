package com.iic.pmrda.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.iic.pmrda.db.bean.Test;
import com.iic.pmrda.db.dao.TestRepo;

@Service
public class TestService {

	@Autowired
	TestRepo repo;
	
	public int update(Test test) {
		
		int updateDate = repo.updateDate(test);
		return updateDate;
		
	}
	
	 public List<Test> findAll() {

	        String sql = "SELECT * FROM Test";

	        List<Test> customers = repo.findAll();
	        return customers;
	    }
	 
	 public Test findById(String id) {
		 return repo.findById(id);
	 }
}
