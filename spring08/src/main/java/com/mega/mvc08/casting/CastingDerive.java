package com.mega.mvc08.casting;

import com.mega.mvc08.box.BallPen;
import com.mega.mvc08.box.Product;

public class CastingDerive {

	public static void main(String[] args) {
		//파생된 데이터  , 참조형 변수 
		//형변환 (casting , 캐스팅 )
		//참조형 형변환은 "상속관계에 있는 클래스만" 가능 ! 
		Product p = new Product(); //super class , 부모 , 크다 
		BallPen b = new BallPen(); //sub class , 자식 , 작다
		//클래스간의 크기를 개념을 가지고 큰지 작은지를 판별한다.
		
		
		p =  b; // 큰 <------- 작  << 자동형변환
		//상속관계에 있어서 부모가 항상 더 크다 .
		b = (BallPen)p ; // 작 <-------  큰  <<강제형변환
		
		
		
		
	}

}
