package com.mega.mvc09;

import org.springframework.stereotype.Repository;

@Repository // 싱글톤으로 만들어줄 객체가 아니면 어노테이션을 달지 않는다.
public class MovieDAO {
	
	public void price() {
		System.out.println("결제하기");
	}
	
}
