package com.mega.mvc08.casting;

public class CastingPrimitive {

	public static void main(String[] args) {
		//기본형 형변환 (정수,실수,문자,논리)
		// 형변환 (데이터  type 변환)
		byte b1 =100; //-128 ~ 127 
		int i1 =200; 
		
		
		
		i1 =b1; // 가능 int(큰) <----byte (작)
		//자동으로 byte에 들어있던 100 데이터가 인트로 변환되어 저장 됨. 
		//자동 데이터 변환 (자동형변환)
		//연산자는 다 cpu가 처리한다.
		
		b1 = (byte)i1; // 가능 int(큰) ----> byte (작)
		//강제로 int에 들어있던 100데이터가 byte 로 변환되어 저장됨 .
		//큰것을 작은거로 넣기 위해 강제로 변환 시켜준다.
		//강제 데이터 변환 (강제형변환)
		
		//기본형 형변환이 불가능한 경우
		
		int i2 =3000;
		byte b2 =(byte)i2;
		System.out.println(b2);
		//강제형변환이 가능한 경우는 범위의 값만 가능 ! 
		
		
	}

}
