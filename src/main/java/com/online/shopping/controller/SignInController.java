package com.online.shopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.online.shopping.model.Login;
import com.online.shopping.model.User;
import com.online.shopping.services.UserService;

@Controller
public class SignInController {
	@Autowired
	  UserService userService;
	@RequestMapping(value = "/SignInProcess", method = RequestMethod.POST)
	  public ModelAndView signInProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login) {
	    	ModelAndView mav = null;

	    User user = userService.validateUser(login);

	    if (null != user) {
	      mav = new ModelAndView("welcome");
	      mav.addObject("firstname", user.getFirstname());
	    } else {
	      mav = new ModelAndView("signin");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }
	
}
