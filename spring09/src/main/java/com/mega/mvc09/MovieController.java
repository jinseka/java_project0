package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MovieController {
	
	@Autowired 
	MovieDAO dao; // 스프링이 만들어 놓은 싱클톤 객체의 주소를 넣어준다.
	
	
	@RequestMapping("movie.do")
	public String pay(String title ,int price) {
		System.out.println(title);
		System.out.println(price);
		if (price >=10000) {
			return "price";  //views/pass.jsp
		} else {
			return  "redirect:movie.jsp";
		}
		
	}
		
		@RequestMapping("price.do")
		public void name() {
			dao.price();
		
		}
		
	}


