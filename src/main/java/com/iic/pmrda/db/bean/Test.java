package com.iic.pmrda.db.bean;

import javax.validation.constraints.NotNull;

public class Test {

	private String layer;
	private String landuse_type;
	private String landuse_su;
	private String labels;
	private String name;
	//need to remove when integartion 
	@NotNull
	private String gisid;
	private String gutno;
	private String village_na;
	private String est_year;
	private String site_owner;
	private String site_apprv;
	private String site_l_use;;
	private String site_l_sta;
	private String site_app_l;
	private String site_built;
	private String site_parki;
	private String e_type;
	private String h_ownershi;
	private String h_serf_amb;
	private String i_villagew;
	private String i_gestaion;
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public String getLanduse_type() {
		return landuse_type;
	}
	public void setLanduse_type(String landuse_type) {
		this.landuse_type = landuse_type;
	}
	public String getLanduse_su() {
		return landuse_su;
	}
	public void setLanduse_su(String landuse_su) {
		this.landuse_su = landuse_su;
	}
	public String getLabels() {
		return labels;
	}
	public void setLabels(String labels) {
		this.labels = labels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGisid() {
		return gisid;
	}
	public void setGisid(String gisid) {
		this.gisid = gisid;
	}
	public String getGutno() {
		return gutno;
	}
	public void setGutno(String gutno) {
		this.gutno = gutno;
	}
	public String getVillage_na() {
		return village_na;
	}
	public void setVillage_na(String village_na) {
		this.village_na = village_na;
	}
	public String getEst_year() {
		return est_year;
	}
	public void setEst_year(String est_year) {
		this.est_year = est_year;
	}
	public String getSite_owner() {
		return site_owner;
	}
	public void setSite_owner(String site_owner) {
		this.site_owner = site_owner;
	}
	public String getSite_apprv() {
		return site_apprv;
	}
	public void setSite_apprv(String site_apprv) {
		this.site_apprv = site_apprv;
	}
	public String getSite_l_use() {
		return site_l_use;
	}
	public void setSite_l_use(String site_l_use) {
		this.site_l_use = site_l_use;
	}
	public String getSite_l_sta() {
		return site_l_sta;
	}
	public void setSite_l_sta(String site_l_sta) {
		this.site_l_sta = site_l_sta;
	}
	public String getSite_app_l() {
		return site_app_l;
	}
	public void setSite_app_l(String site_app_l) {
		this.site_app_l = site_app_l;
	}
	public String getSite_built() {
		return site_built;
	}
	public void setSite_built(String site_built) {
		this.site_built = site_built;
	}
	public String getSite_parki() {
		return site_parki;
	}
	public void setSite_parki(String site_parki) {
		this.site_parki = site_parki;
	}
	public String getE_type() {
		return e_type;
	}
	public void setE_type(String e_type) {
		this.e_type = e_type;
	}
	public String getH_ownershi() {
		return h_ownershi;
	}
	public void setH_ownershi(String h_ownershi) {
		this.h_ownershi = h_ownershi;
	}
	public String getH_serf_amb() {
		return h_serf_amb;
	}
	public void setH_serf_amb(String h_serf_amb) {
		this.h_serf_amb = h_serf_amb;
	}
	public String getI_villagew() {
		return i_villagew;
	}
	public void setI_villagew(String i_villagew) {
		this.i_villagew = i_villagew;
	}
	public String getI_gestaion() {
		return i_gestaion;
	}
	public void setI_gestaion(String i_gestaion) {
		this.i_gestaion = i_gestaion;
	}
	@Override
	public String toString() {
		return "Test [layer=" + layer + ", landuse_type=" + landuse_type + ", landuse_su=" + landuse_su + ", labels="
				+ labels + ", name=" + name + ", gisid=" + gisid + ", gutno=" + gutno + ", village_na=" + village_na
				+ ", est_year=" + est_year + ", site_owner=" + site_owner + ", site_apprv=" + site_apprv
				+ ", site_l_use=" + site_l_use + ", site_l_sta=" + site_l_sta + ", site_app_l=" + site_app_l
				+ ", site_built=" + site_built + ", site_parki=" + site_parki + ", e_type=" + e_type + ", h_ownershi="
				+ h_ownershi + ", h_serf_amb=" + h_serf_amb + ", i_villagew=" + i_villagew + ", i_gestaion="
				+ i_gestaion + "]";
	}
	
	

	
	
}
