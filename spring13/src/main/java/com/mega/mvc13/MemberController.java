package com.mega.mvc13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//싱글톤 객체 생성, 스프링의 컨트롤러 등록 
@Controller
public class MemberController {
	
	@Autowired 
	MemberDAO dao; // 스프링이 만들어 놓은 싱클톤 객체의 주소를 넣어준다.
	
	
	
	@RequestMapping("one.do")
	public void one(MemberDTO memberDTO,  Model model) {
		System.out.println(memberDTO.getId());
		MemberDTO dto = dao.read(memberDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model속성을 이용하면 views 아래까지 데이터를 보내고 , 사라진다.
		model.addAttribute("dto",dto);
		//컨트롤러에서만 모델을 사용가능하다. 다른곳에서 사용 불가능
	}
	
//순서 : index.jsp --> MemberController check method --> view/super.jsp
	@RequestMapping("check")
	public String check(String nick) {
		System.out.println(nick);
		if (nick.equals("superman")) {
			return "super"; 
		} else {
			return "common";
		}
	}
	// 기능하나당 메서드 하나 , 요청 하나당 메서드 하나 , 주소 하나당 메서드 하나 ,
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		//컨트롤러의 메서드내에 선언된 파라메터는 무조건 프로토 타입으로 만들어진다.
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 :  " + dao);
	//	dao.login(); //주소가있으면 메소드 호출이 가는하다.
		boolean result =dao.login(memberDTO);
		if (result) {
			return "ok"; //views/ok.jsp
		} else {
			return "no"; //views/no.jsp
		}
	}
	@RequestMapping("password")
	public String pass(String pass) {
		System.out.println(pass);
		if (pass.equals("1234")) {
			return "pass";  //views/pass.jsp
		} else {
			return "redirect:index.jsp";
//			return "redirect:index.jsp"; == response.sendRedirect("index.jsp")
		}
		
	}
	@RequestMapping("create")
	public void create(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		dao.create(memberDTO);
	}
}
	
	


