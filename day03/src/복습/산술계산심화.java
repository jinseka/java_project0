package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		System.out.println("두 수의 합은 "+ (x + y));
		System.out.println("두 수의 나눗셈은 "+ (x / y));
		
		
		//int sum = 333;
		int sum = x + y;
		//int sum 이 먼저 변수를 만들고  그다음 x+y 계산을 하고 = 를한다. 
		int avg1 = sum / 2;
		System.out.println("평균은 "+ avg1);

		//자바에서는 정수와 정수의 계산은 정수 ! !
		//자바에서는 하나라도 실수면 무조건 실수의 결과 ! ! 
		
		double avg2 = sum / 2.0;
		System.out.println("평균은 "+ avg2);
		
		
		int count = 2;
		avg2 =sum / (double)count ;
		System.out.println("평균은 "+ avg2);
		// 캐스팅 : cpu가 원래 데이터의 타입을 다른 타입으로 강제로 변환하는것을 의미한다.
		//강제로 타입 변환, 강제형변환
		//강제로 바꾸고 싶은 타입 앞에 ()을 붙혀 타입을 바꾼다.
		
//		int x2 = 22.0; 사용못함.
//		double y2 = 22;
//	  	double 안에 int가 있다고 생각하면 된다.


	
	
	
	}

}
