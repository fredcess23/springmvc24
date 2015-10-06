package com.tmac.mx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tmac.model.Person;

@Controller
public class RegisterController {

	@RequestMapping("/goForm")
	public ModelAndView goForm(){
		
		return new ModelAndView("form","command",new Person()); //by defect is command (2do param)
		//	if we want to personalize the 2do parameter name, we need to put a parameter name
		//  "commandName" in the form into the jsp.
	}
	
	@RequestMapping(value="/add", method={RequestMethod.GET, RequestMethod.POST})
	public String add(Person p, ModelMap model){
		//the attributes should be the same
		model.addAttribute("nameModel",p.getName());
		model.addAttribute("lastNameModel",p.getLastName());
		return "success"; //page name: success 
	}
	
}
