package com.mega.mvc05.static1;

public class Day {
	
	
	//멤버변수, 전역변수, 자동초기화 
	String doing; //null
	int time; //0
	String location; //null
	static int count; // 0
	static int sum; //0
	
	//객체 생성시 꼭 있어야하는거  << 생성자 메서드 
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++; 
		sum+=time;
	}
	//this는 class (Day)를 의미한다. 

	//static 매서드는 객체생성하지 않아도 아무때나 클래스 이름으로 호출 접근해서 그 기능을 처리할수 있다.
	//자주사용하는 기능은 static  매서드로 만들어 놓으면 아무때나 쓸 수 있어서 편하다.
	//sum과 count 둘다 static이다 .
	
	public static int getAvg() {
		return sum/count;
	}
//	
//	public static getAVG1() {
//		//static매서드 안에서 스태틱 변수만 사용가능  ! ! !  instance변수 사용 불가능 ! ! 
//		//instance변수는 객체 생성후 접근 가능하기 떄문 
//		//static매서드는 객체 생성하지 않아도 접근해서 처리를 해야함
//		return doing;
//	}
	
	@Override
	public String toString() {
		return "day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	//전송용이 아니라서 getter setter을 안쓴다. 
	
}
