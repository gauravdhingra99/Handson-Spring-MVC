package com.gaurav;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int t1 ,@RequestParam("t2") int t2, HttpServletResponse response) 
	{
		System.out.println("I m in add controller");
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		AddService as = new AddService();
		int k=as.add(i,j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject(k);
		return mv;
	}

}
