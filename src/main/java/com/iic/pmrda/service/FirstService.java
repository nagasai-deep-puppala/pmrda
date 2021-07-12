package com.iic.pmrda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iic.pmrda.metaData.MetaDataInfo;
import com.iic.pmrda.metaData.MetaDataInfoFactory;

@Service
public class FirstService {

	
	public Set<String> getData() {
		ArrayList<MetaDataInfo> data = MetaDataInfoFactory.getData();
		 Set<String> collect = data.stream().map(e -> e.getTaluka()).collect(Collectors.toSet());
				  
		return collect;
	}
	
	public List<MetaDataInfo> getIllegarCon(String taluka,String village) {
		ArrayList<MetaDataInfo> data = MetaDataInfoFactory.getData();
		List<MetaDataInfo> collect = data.stream().filter(e -> e.getTaluka().equals(taluka)&&e.getVillage().equals(village)).collect(Collectors.toList());
	return collect;
	}
	
	public Set<String> getvillages(String taluka) {
		ArrayList<MetaDataInfo> data = MetaDataInfoFactory.getData();
	
	 Set<String> collect = data.stream().filter(e -> e.getTaluka().equals(taluka)).map(e -> e.getVillage()).collect(Collectors.toSet());
	return collect;
	}
}
