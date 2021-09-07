package com.mega.mvc08.casting;

public class MathTest {

	public static void main(String[] args) {
		double date =3.14159265358979323846264338327950288;
		System.out.println(Math.abs(date)); 
		System.out.println(Math.ceil(date)); //올림
		System.out.println(Math.floor(date)); //내림
		System.out.println(Math.round(date)); //반올림
		
		System.out.println(Math.random()); // 0~ <1미만의 값만 나온다 
		System.out.println(Math.random()+10); // 0~ <1미만의 값만 나온다 
		 
	}

}
