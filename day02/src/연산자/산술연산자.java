package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자: 사칙연산자(+,-,*(아스테르크),/,%(나머지 연산자)
		int x = 100;
		int y = 200;
		
		System.out.println("두 수 의 합은" + (x + y));
		// 첫번째 + 는 결합의 의미 
		System.out.println("두 수 의 차은" + (x - y));
		System.out.println("두 수 의 곱은" + (x * y));
		System.out.println("두 수 의 나눗셈은" + (x / y));
		System.out.println("두 수 의 나머지는" + (x % y));
		
	}

}
