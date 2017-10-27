package com.lxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;




	@Controller
	@RequestMapping(value="/lxl")
	public class Hello {  
	@Autowired
	private NameService nameservice;
    @RequestMapping(value="/name",method=RequestMethod.GET)
    @ApiOperation(value="获取人名7")
    public String HelloWorld(Model model){  
        model.addAttribute("message",nameservice.getname());  
        return "HelloWorld";  
    }  

}