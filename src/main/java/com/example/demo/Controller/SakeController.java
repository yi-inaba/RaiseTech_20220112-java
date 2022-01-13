package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SakeController {
	
	@GetMapping
	public String index() {
		return "index";
	}
//テスト
//ブランチtest1作成後
//ブランチtest2作成後
}
