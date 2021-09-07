package com.mega.mvc07.test;

public class MyGirlMain {

	public static void main(String[] args) {
		Girl girl1 = new Girl("길순", 13);
		Girl girl2 = new Girl("길숙", 10);
		
		System.out.println(girl1);
		System.out.println(girl2);
		
		System.out.println( "전체소녀의 나이수 "+Girl.sum);
		System.out.println("평균 "+(float)Girl.sum/Girl.count);
		
	}

}

//11.전체소녀들의 정보를 프린트
//12.소녀객체가 만들어 졌을 때 나이를 누적할 수있는 static 변수를 만들어서 누적처리를 하세요.
//13.소녀객체가 만들어 졌을 때 인원를 누적할 수있는 static 변수를 만들어서 누적처리를 하세요.
//14.전체 소녀수와 나이의 평균을 구하세요