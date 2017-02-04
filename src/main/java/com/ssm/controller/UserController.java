package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	    @RequestMapping("/showUser")
	    public String toIndex(HttpServletRequest request, Model model) {
	        int userId = Integer.parseInt(request.getParameter("id"));
	        User user = this.userService.getUserById(userId);
	        model.addAttribute("user", user);
			//docPath
			model.addAttribute("docPath","C:\\Users\\Administrator\\Desktop\\Docker Cookbook.pdf");

	        return "User";
	    }
	    
		@Resource(name="userService")
	    private IUserService userService;

}
