package com.iic.pmrda.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iic.pmrda.db.bean.Test;
import com.iic.pmrda.db.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService service;
	@PostMapping("/update")
	public int main(@RequestBody Test test) {
		System.out.println(test);
		return  service.update(test);
	}
	
	@GetMapping("/")
	public List<Test> main() {
		
		return  service.findAll();
	}
	
	@GetMapping("/{id}")
	public Test main(@PathVariable String id) {
		
		return  service.findById(id);
	}

}
