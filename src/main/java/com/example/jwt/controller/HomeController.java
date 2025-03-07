package com.example.jwt.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	  public String Home(HttpServletRequest request) {
        return "Home sweet home" +request.getSession().getId();
//        System.out.println("home");
	}
}
