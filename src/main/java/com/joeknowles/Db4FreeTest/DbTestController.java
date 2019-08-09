package com.joeknowles.Db4FreeTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DbTestController {
	UserRepository repo;
	
	public DbTestController() { repo = new UserRepository(); }
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp"; 
	}
	
	@RequestMapping("/all")
	public String allUsers(Model model) {
		model.addAttribute("users", repo.getAllUsers());
		return "all.jsp";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model,
			@RequestParam(value = "username") String name,
			@RequestParam(value = "password") String pass,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "gender") String gender,
			@RequestParam(value = "org") String org,
			@RequestParam(value = "language") String lang,
			@RequestParam(value = "comments") String comm) {
		final User u = new User(name, pass, email, gender, org, lang, comm);
		repo.insert(u);
		model.addAttribute("user", u);
		
	   return "register.jsp";
	}
}