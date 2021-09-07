package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션  Annotation
public class ProductController {
	// 요청되는 가상 주소는 중복되면 절대 안된다.
	@RequestMapping("product")
		public void product(ProductDTO productDTO) {
			System.out.println("컨트롤러 메서드 호출됨 ....");
			System.out.println("제품번호 "+ productDTO.getpNo());
			System.out.println("제품이름 "+ productDTO.getName());
			System.out.println("제품내용 "+ productDTO.getContent());
			System.out.println("제품날짜 "+ productDTO.getDate());
		//컨트롤러에서 받은거 확인 출력
		//view아래에 결과 화면 만들어서 넣어주세요
		
	}
}
