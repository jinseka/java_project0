package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class Casting1 {


	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		MemberDTO dto = new MemberDTO();
		
		dto.setId("hong");
		list.add(dto); //object (큰) <---- 자동형변환 <---- MemberDTO (작)
		list.add("hong"); // obhect에 들어가는 자리 (큰)< ------- 자동형변화  < ------- string (작)
		list.add(new Date()); // obhect에 들어가는 자리 (큰)< ------- 자동형변화  < ------- Date (작)
		list.add(new Random()); // obhect에 들어가는 자리 (큰)< ------- 자동형변화  < ------- Random (작)
		list.add(100);  // obhect에 들어가는 자리 (큰)< ------- 자동형변화  < ------- integer (작)  <----  auto boxing  <----   int (기본형)
		list.add(11.11);
		// obhect에 들어가는 자리 (큰)< ------- 자동형변화  < ------- Bouble (작)  <----  auto boxing  <----   bouble (기본형)
		
		//cpu가 바뻐지기 때문에 안좋은 방식이다. 어쩔 수 없을떄만 사용 
		
		//업캐스팅 ,  다운캐스팅
		System.out.println(list);
		
		
		Object dto2 =list.get(0);
		//System.out.println(dto2.getId());
		//업캐스팅 되어 object로 들어간 객체는 원래 클래스가  가지고 있
		//자식에서 추가된 메서드를 쓸 수 없게 된다.
		//부모 클래스로 업케스팅 하는 경우는 자식에서 추가된 메서드를 인식을 못한다.
		
		
		MemberDTO dto3 = (MemberDTO)list.get(0); //MemberDTO(작) <---- Object(큰애) 강제형변환 시켜야한다. 다운캐스팅 시켜야 한다.
		
		System.out.println(dto3.getId());
		
		
		
		Object name = list.get(0); //object
		System.out.println(name.equals("kim"));
		System.out.println(name.equals("hong"));
		
		//100을 꺼내서 연산 하고 싶음 . 꺼내서 1을 더하려고한다.
		//11.11을 거내서 100을 더해보세요.
		
		int age = (Integer)list.get(4);
		System.out.println(age+1);
		//int <---- 오토언박싱 <---- Integer <---- 업캐스팅 <----Object 
		double temp =(double)list.get(5);
		System.out.println(temp+100);
		//double <---- 오토언박싱 <---- Double <---- 다운캐스팅 <----Object		
		
		
	} //main

}//clss
