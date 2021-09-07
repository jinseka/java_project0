package com.mega.mvc12;
//

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//dao는 무조건 싱글톤으로 만들어 주어야한다.
//@이 있으면 다 싱글톤으로 만들어진 것이다 .싱글톤으로 만들어 준다.

@Repository // 싱글톤으로 만들어줄 객체가 아니면 어노테이션을 달지 않는다.
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis; // mybatis클래스 
	
	
	public boolean login(MemberDTO dto) {
		String dbId ="root";
		String dbPw ="1234";
		boolean result =false; //컨트롤러에 결과를 알려주기 위한 변수 
		if (dto.getId().equals(dbId) &&dto.getPw().equals(dbPw)) {
			result=true;
		
		}
		return result;
	}
	
	public void create() {
		mybatis.insert("insert into member");
	
	}
	public void read() {
		
	}

	public void update() {
		
	}
	public void delete() {
		
	}




}
