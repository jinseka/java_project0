package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내답 999개 공간
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];

		Random r = new Random(11);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3(1~4)
			내답[i] = r.nextInt(4) + 1; // 0~3(1~4)

		}
		System.out.println("번호:     답안       내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "  :    " + 답안[i] + "    <=>    " + 내답[i]);
			// 점수를 채점하기 위해서 1당 1점을 부여
		}
			int jumsu = 0;
			// 답안과 내답이 동일해야함.
			for (int i = 0; i < 내답.length; i++) {
				// 답안과 내답의 같은 인덱스에 들어있는 값이 동일 하면 점수1점 획득
				if (답안[i] == 내답[i]) {
					jumsu++;

				}
			}
			System.out.println("당신의 토익점수는 " + jumsu);

			// 답안보다 내답이 정답이 더 큰 경우 몇 문제 카운트
			int high =0;
			for (int i = 0; i < 내답.length; i++) {
			if (답안[i]<내답[i]) {
				high++;
				
			}
		}	
		

	}// main

}// class
