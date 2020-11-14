package com.codex.freshvotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	@GetMapping("/")
	public String showPage() {
		return "index";
	}
	@GetMapping("/dashboard")
	public String showDashboard() {
		return "dashboard";
	}
}
