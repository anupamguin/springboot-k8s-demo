package com.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/k8s")
	public String displayMessage() {
		return "Congratulation you Successfully deployed your application to kubernetes !";
	}
}
