package com.tmac.mx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController {

	@RequestMapping("goHi")
	public ModelAndView redirect(){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "comes from controller");
		mv.setViewName("hi");

		//another way to solve the request
		//ModelAndView mv = new ModelAndView("hi","message","other way");

		return mv;
	}
}
