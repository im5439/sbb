package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
	public String hello() {
		return "안녕하세요 sbb 입니다.";
	}
}
