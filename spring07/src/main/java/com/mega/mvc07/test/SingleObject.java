package com.mega.mvc07.test;

public class SingleObject {
		static int count;
		//누적시킬 변수는 스테틱으로 만들어라
	  public SingleObject() {
		System.out.println("SingleObject 객체 생성됨");
		count++;
	}
}
