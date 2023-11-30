package com.p1.trail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.p1.trail.dao.DAO;

import com.p1.trail.model.*;

@Controller
public class SpringController {

	@Autowired
	DAO dao;
	
	
	@GetMapping("/")
	public String fun1(Model m)
	{
		Work w =new Work();
		m.addAttribute("command",w);
		return "work.html";
	}
	 @PostMapping("/save")
	  public String fun2(@ModelAttribute("w") Work w) {
	      dao.insert(w);
	      System.out.println("Inserted Successfully");
	      return "redirect:/show";
	  }
	 @GetMapping("/show")
	  public String fun4(Model m) {
	    List<Work> wk = dao.getAll();
	    m.addAttribute("wk", wk);
	    return "show.jsp";
	  }
	
	
}
