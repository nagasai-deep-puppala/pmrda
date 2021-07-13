package com.iic.pmrda.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iic.pmrda.metaData.MetaDataInfo;
import com.iic.pmrda.metaData.MetaDataInfoFactory;

@Service
public class SecondService {

	
	public List<MetaDataInfo> getpIEData(String taluka,String village) {
		ArrayList<MetaDataInfo> data = MetaDataInfoFactory.getPieData();
		List<MetaDataInfo> collect = data.stream().filter(e -> e.getTaluka().equals(taluka)&&e.getVillage().equals(village)).collect(Collectors.toList());
	return collect;
	}
}
