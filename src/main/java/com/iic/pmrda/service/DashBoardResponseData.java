package com.iic.pmrda.service;

import com.iic.pmrda.metaData.MetaDataDashBoardBean;

public class DashBoardResponseData {
	
	private MetaDataDashBoardBean villageData;
	private MetaDataDashBoardBean  talukaData;
	
	
	public MetaDataDashBoardBean getVillageData() {
		return villageData;
	}
	public void setVillageData(MetaDataDashBoardBean villageData) {
		this.villageData = villageData;
	}
	public MetaDataDashBoardBean getTalukaData() {
		return talukaData;
	}
	public void setTalukaData(MetaDataDashBoardBean talukaData) {
		this.talukaData = talukaData;
	}
	
	

}
