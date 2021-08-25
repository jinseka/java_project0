package com.mega.mvc05.static1;

public class DayUse {

	public static void main(String[] args) {
		//Day day1 =new Day(); // 에러가 나오는 이유는 기본생성자가 없어서 없는 매서드를 호출할 수 없어서 
		Day day1 = new Day("자바공부",10,"강남");
		Day day2 = new Day("여행",15,"강원도");
		Day day3 = new Day("운동",11,"피트니스");
		System.out.println(Day.count);
		System.out.println(Day.count);
		System.out.println(Day.count);
		System.out.println("누적"+Day.sum+"시간 ");
		System.out.println(Day.sum/Day.count+"시간");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.getAvg());
		
		
	}
	
}
