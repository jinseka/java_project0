package com.maga.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping("create")
	public void create(BbsDTO dto) {
		System.out.println("컨트롤러 호출 ");
		System.out.println("no "+ dto.getNo());
		System.out.println("title "+dto.getTitle());
		System.out.println("content "+dto.getTitle());
		System.out.println("writer "+dto.getWriter());
	}
	
	
}
