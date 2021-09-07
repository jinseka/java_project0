package com.mega.mvc07.test;

public class BoyMain2 {

	public static void main(String[] args) {
		Boy2 boy1 = Boy2.getInstance();
		Boy2 boy2 = Boy2.getInstance();
		
		System.out.println(boy1);
		System.out.println(boy2);
		System.out.println(Boy2.count);
		//21.프로토타입과 싱글톤으로 객체 생성시 각각 생성된 객체수를 프린트해보세요.
		
		//22.서버프로그래밍시 프로토타입으로 객체를 계속 생성하면 어떤 일이 발생할 것 같은가요?
		//    위의 예를 들어서 설명해주세요.
		//		프로토 타입으로 객체를 생성하면 메모리가 쌓여 서버에 무리가 간다
		//
		//23.서버프로그래밍시 DAO, Controller등과 같은 것은 싱글톤으로 객체를 계속 생성하고
		//     DTO는 프로토타입으로 객체를 생성한다. 이 둘의 차이점이 무엇일까요?
		//     dto의 값이 항상 바뀌기 때문에 프로토 타입으로 만든다 
	}

}

