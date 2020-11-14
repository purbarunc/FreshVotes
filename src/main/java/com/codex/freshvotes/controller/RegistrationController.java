package com.codex.freshvotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codex.freshvotes.model.User;
import com.codex.freshvotes.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String register(ModelMap model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String register(User user) {
		userService.save(user);
		return "redirect:/login";
	}
}
