package com.iic.pmrda;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iic.pmrda.metaData.MetaDataInfo;
import com.iic.pmrda.service.SecondService;
import com.iic.pmrda.service.ResponseData;

@Controller
public class SecondController {

	@Autowired
	private SecondService secondService;
	
	
	  @RequestMapping(value = "/pie")
	   public String   getData(){
	    	
	    	
	        return "pie.html";
	    }
	  
	  @RequestMapping(value = "pieData/{taluka}/{village}")
	    @ResponseBody
	    public ResponseData illegarCon(@PathVariable("taluka") String taluka, @PathVariable("village") String village){
	    	List<MetaDataInfo> illegarCon = secondService.getpIEData(taluka, village);
	    	ResponseData maindata =new ResponseData();
			maindata.setData(illegarCon);
	        return maindata;
	    }
}
