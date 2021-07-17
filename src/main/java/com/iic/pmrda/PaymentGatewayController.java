package com.iic.pmrda;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaymentGatewayController {
	
	@RequestMapping("/paymentgateway")
	public String loadHtml() {
		
		return "paymentJs.html";
	}
	
	@RequestMapping("/paymentgatewayLive")
	public String loadHtmlLive() {
		
		return "paymentJsLive.html";
	}
	
	@RequestMapping(value="/paymentgatewayCallback",method=RequestMethod.POST)
	public String loadHtml(HttpServletRequest request) {
		String parameter = request.getParameter("razorpay_payment_id");
		
			
		return "redirect:/paymentgatewayCallbackView";
	}
	
	@RequestMapping(value="/paymentgatewayCallback")
	public String loadHtml2(HttpServletRequest request) {
		
		System.out.println("hiiiii");	
		return "paymentJs.html";
	}
	

}
