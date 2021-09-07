package com.mega.mvc07.test;

public class Main2 {

	public static void main(String[] args) {
		// Controller에 있는 add() 메서드를 호출하고 싶다.
		Controller contr2 = new Controller(); 
		//필요할 때 클래스의 인스턴스인 객체를 만들어서 사용하는 방법
		//프로토타입 방법
		//실제 업무에서는 서버에 부담이 되기 떄문에 사용하지 않는다 .
		
		//add메서드를 사용하려면 변수가 있으면되는데 객체 생성한 참조형 주소만 있으면 사용가능하다 .
		
		//프로토 타입 방법은 서버 프로그램시 계속 사용해도 될가 ? 
		//아니면 어떻게 해야할까  ? 
		
		
		contr2.add();
	}

}
