package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.dao.EproductDao;
import com.simplilearn.entity.Eproduct;
 

@Controller
public class MainController {
	
	 
	@Autowired
	EproductDao  dao;
	
	@GetMapping("/listproducts")
	public String getAllProducts(ModelMap map) {
		
		List<Eproduct>list=dao.getAllProducts();
		
		map.addAttribute("list",list);
		return  "products";
	}
	

}
