package com.tjoeun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//		@RequestMapping(value:"/", method=RequestMethod.GET)
//		@RequestMapping(value:"/", method=RequestMethod.POST)
//		@GetMapping("/")
//		@PostMapping("/")
		@GetMapping("/")
		public String home() {
			System.out.println("home");
			return "/WEB-INF/views/index.jsp";
		}
}

