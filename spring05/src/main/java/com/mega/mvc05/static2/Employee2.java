package com.mega.mvc05.static2;

public class Employee2 {

	public static void main(String[] args) {
		Employee em1= new Employee("홍길동", "남", 25);
		Employee em2= new Employee("김길동", "여", 26);
		Employee em3= new Employee("송길동", "남", 27);
		
		//모든 직원의 정보
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		
		//직원의 수
		System.out.println("모든 직원의 수 "+Employee.count + "명");
		
		//나이 평균
		System.out.println("직원 나이 편균은 "+ (Employee.sum/Employee.count));
	
	
	}
}
