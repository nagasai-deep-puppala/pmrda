package com.iic.pmrda.metaData;

public class MetaDataDashBoardBean {
	private String taluka;
	private String village;
	private long illegalBuildingsCount; 
	private double areaUnderIllegalORConstructionCount; 
	private long verifiedIllegalBuildingsCount;
	private long unverifiedIllegalBuildingsCount;
	private long regularizedFromVerifiedIllegalBuildingsCount;
	private long demolishedFromVerifiedIllegalBuildings;
	private long pendingActionsAgainstVerifiedCount;
	
	
	
	public MetaDataDashBoardBean(String taluka, String village, long illegalBuildingsCount,
			double areaUnderIllegalORConstructionCount, long verifiedIllegalBuildingsCount,
			long unverifiedIllegalBuildingsCount, long regularizedFromVerifiedIllegalBuildingsCount,
			long demolishedFromVerifiedIllegalBuildings, long pendingActionsAgainstVerifiedCount) {
		super();
		this.taluka = taluka;
		this.village = village;
		this.illegalBuildingsCount = illegalBuildingsCount;
		this.areaUnderIllegalORConstructionCount = areaUnderIllegalORConstructionCount;
		this.verifiedIllegalBuildingsCount = verifiedIllegalBuildingsCount;
		this.unverifiedIllegalBuildingsCount = unverifiedIllegalBuildingsCount;
		this.regularizedFromVerifiedIllegalBuildingsCount = regularizedFromVerifiedIllegalBuildingsCount;
		this.demolishedFromVerifiedIllegalBuildings = demolishedFromVerifiedIllegalBuildings;
		this.pendingActionsAgainstVerifiedCount = pendingActionsAgainstVerifiedCount;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public long getIllegalBuildingsCount() {
		return illegalBuildingsCount;
	}
	public void setIllegalBuildingsCount(long illegalBuildingsCount) {
		this.illegalBuildingsCount = illegalBuildingsCount;
	}
	public double getAreaUnderIllegalORConstructionCount() {
		return areaUnderIllegalORConstructionCount;
	}
	public void setAreaUnderIllegalORConstructionCount(double areaUnderIllegalORConstructionCount) {
		this.areaUnderIllegalORConstructionCount = areaUnderIllegalORConstructionCount;
	}
	public long getVerifiedIllegalBuildingsCount() {
		return verifiedIllegalBuildingsCount;
	}
	public void setVerifiedIllegalBuildingsCount(long verifiedIllegalBuildingsCount) {
		this.verifiedIllegalBuildingsCount = verifiedIllegalBuildingsCount;
	}
	public long getUnverifiedIllegalBuildingsCount() {
		return unverifiedIllegalBuildingsCount;
	}
	public void setUnverifiedIllegalBuildingsCount(long unverifiedIllegalBuildingsCount) {
		this.unverifiedIllegalBuildingsCount = unverifiedIllegalBuildingsCount;
	}
	public long getRegularizedFromVerifiedIllegalBuildingsCount() {
		return regularizedFromVerifiedIllegalBuildingsCount;
	}
	public void setRegularizedFromVerifiedIllegalBuildingsCount(long regularizedFromVerifiedIllegalBuildingsCount) {
		this.regularizedFromVerifiedIllegalBuildingsCount = regularizedFromVerifiedIllegalBuildingsCount;
	}
	public long getDemolishedFromVerifiedIllegalBuildings() {
		return this.demolishedFromVerifiedIllegalBuildings;
	}
	public void setDemolishedFromVerifiedIllegalBuildings(long demolishedFromVerifiedIllegalBuildings) {
		this.demolishedFromVerifiedIllegalBuildings = demolishedFromVerifiedIllegalBuildings;
	}
	public long getPendingActionsAgainstVerifiedCount() {
		return this.pendingActionsAgainstVerifiedCount;
	}
	public void setPendingActionsAgainstVerifiedCount(long pendingActionsAgainstVerifiedCount) {
		this.pendingActionsAgainstVerifiedCount = pendingActionsAgainstVerifiedCount;
	}

	
	

}
