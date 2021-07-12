package com.iic.pmrda.service;

import java.util.ArrayList;
import java.util.List;

import com.iic.pmrda.metaData.MetaDataInfo;

public class ResponseData {
	
	public List<MetaDataInfo> getData() {
		return data;
	}

	public void setData(List<MetaDataInfo> data) {
		this.data = data;
	}

	private List<MetaDataInfo> data= new ArrayList<MetaDataInfo>();;
	

}
