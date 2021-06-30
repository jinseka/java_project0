package 누적연습;

import java.util.Scanner;

public class 연습문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("안전성 점수는 ?");
		Double aa = sc.nextDouble();
		double aa1 = aa * 0.3;

		System.out.println("속도 점수는 ?");
		Double bb = sc.nextDouble();
		double bb1 = bb * 0.5;

		System.out.println("연비 점수는 ?");
		Double cc = sc.nextDouble();
		double cc1 = cc * 0.2;

		System.out.println(aa1 + bb1 + cc1);

		double total = (aa1 + bb1 + cc1);
		System.out.println(total);

		if (total >= 90) {

			System.out.println("최우수");
		} else if (total >= 80) {

			System.out.println("우수");
		} else if (total >= 70) {

			System.out.println("보통");
		} else {
			System.out.println("미달 ");
		}

	}

}
