package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		int sum1 = 0; // 기본값
		for (int i = 1; i <= 10; i++) { // 1~10까지 1은 순차적으로1씩올라간다.
			// 배수나 짝수 홀수는 나머지 연산자를 사용한다.

			if (i % 3 == 0) { // i를 3으로 나눴을때 나머지가 0이나오는 수
				sum1 = sum1 + i; // 변수 = 변수+(3으로 나눠지는 수)
			} // 1~10까지 3으로 나누어 지는 수를 구함 3.6.9

		}

		System.out.println(sum1); // 3+6+9 =18

		System.out.println("==================");
		// 변수는 끈어서 가는게 좋다 . 변수를 같이 쓰게 되면 코드가 꼬이게 된다.
		// 입력 처리 결과 변수를 따로 사용하라.

		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue; // 반복은 하지만 밑에 있는코드는 x
				// 반복문을 계속 하라는 의미
				// 조건에 맞는 경우 아래에 있는 코드는 더이상 실행 x
				// 제외의 의미이다.
			}
			if (sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop!");
				break;
			}
			sum2 = sum2 + i;
		}

		System.out.println(sum2);

	}

}
