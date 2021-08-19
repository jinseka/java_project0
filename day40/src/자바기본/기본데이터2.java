package 자바기본;

public class 기본데이터2 {

	public static void main(String[] args) {
		byte b =100;
		int i =b ; //  int 가 큰 <------작, 자동으로 인트로 타입 바뀌어서 들어간다. 자동형변환 !
		
		
		int i2 =100;
		byte b2 = (byte)i2; // 작 <----- 큰, 강제타입변환 (강제형변환) ! 
		
		//형변환 : cpu 가 타입을 변환 , 캐스팅 (casting)
		//RAM 에 선언된 타입 변경 불가, 선언할 때 타입이 결정되기 때문에 재선언 불가 ! 
		// casting의 종류 
		//1. 자동캐스팅
		//2. 강제캐스팅
		
		//강제캐스팅인 경우, 값의 범위가 해당되는 경우만 가능 ! ! !
		int i3 =1000;
		byte b3 = (byte)i3; // byte 범위에 1000이 포함되지 않아서 캐스팅을 하면 안된다.
		System.out.println(b3);
		
	}

}
