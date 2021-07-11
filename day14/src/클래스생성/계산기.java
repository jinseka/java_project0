package 클래스생성;

public class 계산기 {
	// 사칙연산 계산기

	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");

	}

	public void 더하기(int a1, int a2) {
		System.out.println("더하기 기능 처리 내용 구현 ");
		int plus = a1 + a2;
		System.out.println("더한값은 " + plus + "입니다");

	}

	public void 빼기() {
		System.out.println("빼기 기능 처리 내용 구현 ");

	}

	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리 내용 구현 ");
		int result = price * count;
		System.out.println("두 수의 곱의 결관느 " + result);
	}

	public void 나누기(double b1, double b2) {
		System.out.println("나누기 기능 처리 내용 구현 ");
		double sl = b1 / b2;
		System.out.println(" 두 수의 나눔값은 " + sl + " 입니다.");
	}
}
