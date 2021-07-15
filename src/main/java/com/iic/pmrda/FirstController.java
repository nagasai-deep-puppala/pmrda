package com.iic.pmrda;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iic.pmrda.metaData.MetaDataInfo;
import com.iic.pmrda.service.FirstService;
import com.iic.pmrda.service.ResponseData;

import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Controller
public class FirstController { 
	
	@Autowired
	private FirstService firstservice;
	
    
    @RequestMapping(value = "IllegarCon/{taluka}/{village}")
    @ResponseBody
    public ResponseData illegarCon(@PathVariable("taluka") String taluka, @PathVariable("village") String village){
    	List<MetaDataInfo> illegarCon = firstservice.getIllegarCon(taluka, village);
    	ResponseData maindata =new ResponseData();
		maindata.setData(illegarCon);
        return maindata;
    }
    
    @RequestMapping(value = "/getData")
    @ResponseBody
    public Set<String> getData(){
    	 Set<String> data = firstservice.getData();
    	
        return data;
    }
    
    
    
    @RequestMapping(value = "/getVillages/{taluka}")
    @ResponseBody
    public Set<String> getVillages(@PathVariable("taluka")String taluka){
    	 Set<String> getvillages = firstservice.getvillages(taluka);
    	
        return getvillages;
    }
}
