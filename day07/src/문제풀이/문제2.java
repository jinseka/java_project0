package 문제풀이;

public class 문제2 {

	public static void main(String[] args) {

//		33~222 모두 더해주세요.
		int sum1 = 0; // 변수의 초기값 int같은 경우 0으로 초기값을 설정을 많이 한다. etc:최고값을 찾을 때
		for (int i = 33; i <= 222; i++) {
			// 1 +2+3+...
			// for 문안에반복시키는것을 넣지 않는다. 초기화 된다.
			sum1 = sum1 + i; // 1 = 0 + 1 누적된 변수
								// 3 = 1 + 2
								// 6 = 3 + 3
			System.out.println(i + ":" + sum1); // 개발자 확인용 으로 syso을 사용한다. 자바 프로그램이나 네트워크 서버용으로만 쓰임 휴대폰은 로그라는 클래스를 가지고
												// 터미널에 찍는다.
		} // <<< 안에 넣을경우 모든 값이 나오게 된다.
		System.out.println(sum1);

//		55~4500, 2씩 점프하면서 더해주세요.
		// i++ => i에다가 누적을 시켜라 i=i+1;
		
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
			System.out.println(sum2);
		}
//		0~6000, 5씩 점프하면서 더해주세요.
		int sum3 =0;
		for (int i = 0; i <= 6000; i=i+5) {
			sum3 =sum3+i;
			System.out.println(sum3);
		}
//		33~222 모두 더해주세요.
//		55~4500, 2씩 점프하면서 더해주세요.
//		0~6000, 5씩 점프하면서 더해주세요.

	}

}
