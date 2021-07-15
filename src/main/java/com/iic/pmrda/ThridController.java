package com.iic.pmrda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iic.pmrda.service.DashBoardResponseData;
import com.iic.pmrda.service.ThirdService;

import io.swagger.v3.oas.annotations.Hidden;


@Hidden
@Controller
public class ThridController {

	@Autowired
	private ThirdService thirdService;
	
	
	  @RequestMapping(value = "/dashboard")
	   public String   getData(){
	    	
	    	
	        return "hodDashBoard.html";
	    }
	  
	  @RequestMapping(value = "dashboard/{taluka}/{village}")
	    @ResponseBody
	    public DashBoardResponseData dashBoard(@PathVariable("taluka") String taluka, @PathVariable("village") String village){
	    DashBoardResponseData data = thirdService.getData(taluka, village);
	    
	        return data;
	    }
	  
	
}

