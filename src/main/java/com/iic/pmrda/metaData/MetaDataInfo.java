package com.iic.pmrda.metaData;

public class MetaDataInfo {
	
	private String taluka;
	private String village;
	private String area;
	private int illegalBuildingCoungt;
	private int RegularisedBuildingCount;
	private int demolishedBuildingCount;
	private int pendingBuildingCount;
	private double illegalBuildingPer;
	private double legalBuildingPer;
	
	
	
	public double getIllegalBuildingPer() {
		return illegalBuildingPer;
	}
	public void setIllegalBuildingPer(double illegalBuildingPer) {
		this.illegalBuildingPer = illegalBuildingPer;
	}
	public double getLegalBuildingPer() {
		return legalBuildingPer;
	}
	public void setLegalBuildingPer(double legalBuildingPer) {
		this.legalBuildingPer = legalBuildingPer;
	}
	public MetaDataInfo(String taluka, String village, String area, int illegalBuildingCoungt,
			int regularisedBuildingCount, int demolishedBuildingCount, int pendingBuildingCount) {
		super();
		this.taluka = taluka;
		this.village = village;
		this.area = area;
		this.illegalBuildingCoungt = illegalBuildingCoungt;
		RegularisedBuildingCount = regularisedBuildingCount;
		this.demolishedBuildingCount = demolishedBuildingCount;
		this.pendingBuildingCount = pendingBuildingCount;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public MetaDataInfo(String taluka, String village, double illegalBuildingPer, double legalBuildingPer) {
		super();
		this.taluka = taluka;
		this.village = village;
		this.illegalBuildingPer = illegalBuildingPer;
		this.legalBuildingPer = legalBuildingPer;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getIllegalBuildingCoungt() {
		return illegalBuildingCoungt;
	}
	public void setIllegalBuildingCoungt(int illegalBuildingCoungt) {
		this.illegalBuildingCoungt = illegalBuildingCoungt;
	}
	public int getRegularisedBuildingCount() {
		return RegularisedBuildingCount;
	}
	public void setRegularisedBuildingCount(int regularisedBuildingCount) {
		RegularisedBuildingCount = regularisedBuildingCount;
	}
	public int getDemolishedBuildingCount() {
		return demolishedBuildingCount;
	}
	public void setDemolishedBuildingCount(int demolishedBuildingCount) {
		this.demolishedBuildingCount = demolishedBuildingCount;
	}
	public int getPendingBuildingCount() {
		return pendingBuildingCount;
	}
	public void setPendingBuildingCount(int pendingBuildingCount) {
		this.pendingBuildingCount = pendingBuildingCount;
	}
	
	
	

}
