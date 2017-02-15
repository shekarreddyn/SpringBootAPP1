package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	
	

		@RequestMapping("/welcome")
		public String welcome(){
			
			return "i see something on the browser, this is the beauty of springboot";
		}
	}
	
