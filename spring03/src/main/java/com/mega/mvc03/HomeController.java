package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // << 상속의 역활 
public class HomeController  {
	
		@RequestMapping("insert")
		public void insert(MemberDTO dto) {
			System.out.println("컨트롤러 메서드 호출됨 ....");
			System.out.println("컨트롤러 받은 id "+ dto.getId());
			System.out.println("컨트롤러 받은 pw "+ dto.getPw());
			System.out.println("컨트롤러 받은 name "+ dto.getName());
			System.out.println("컨트롤러 받은 tel "+ dto.getTel());
		}
		@RequestMapping("getL")
		public void getList() {
			System.out.println("컨트롤러 메서드 호출됨 ....");
			
		}
		
		@RequestMapping("check")
		public void getList(MemberDTO dto) {
			System.out.println("컨트롤러 메서드 호출됨 ....");
			System.out.println("컨트롤러 받은 id "+ dto.getId());
			System.out.println("컨트롤러 받은 pw "+ dto.getPw());
			//컨트롤러에서 처리를 한후 , 클라이언트에게 결과를 알려주어야 한다.
			//알려주는 페이지는 반드시 html페이지를 만들어 주어야 한다.
			//view 아래에 check.jsp 로 만든다.
			
		}
		
}
