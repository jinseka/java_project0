package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//어노테이션 달아놓은 클래스들ㅇ느 스피링 프로젝트에서 모두다 싱글톤이다 ! ! !

@Controller //어노테이션  Annotation
public class BbsController {

	// 요청되는 가상 주소는 중복되면 절대 안된다.
	@RequestMapping("bbs")
		public void bbs(BbsDTO bbsDTO, String date) {
			//컨트롤러의 입력값으로 넣은 변수는 프로토타입 변수.
			System.out.println("컨트롤러 메서드 호출됨 ....");
			System.out.println("번호 "+ bbsDTO.getbNo());
			System.out.println("제목 "+ bbsDTO.getContent());
			System.out.println("내용 "+ bbsDTO.getTitle());
			System.out.println("제목 "+ bbsDTO.getWriter());
		//컨트롤러에서 받은거 확인 출력
			System.out.println(bbsDTO);
			System.out.println(date);
		//view아래에 결과 화면 만들어서 넣어주세요
		
	}
}
