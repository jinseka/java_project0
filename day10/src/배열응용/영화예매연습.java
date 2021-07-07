package 배열응용;

import java.util.Scanner;

public class 영화예매연습 {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		final int MONEY = 10000;
		while (true) {
			System.out.println("-----------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("-----------------------");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			System.out.println("원하는 예약 좌석 입력(종료-1)>> ");
			int no = sc.nextInt();
			if (no == -1) {
				System.out.println("예약이 완료되었습니다");
				int sum2 = MONEY * sum;
				System.out.println("총 요금은 " + sum2 + "원 입니다.");

				// System.exit(0);
				break;
			}
			if (a[no] != 1) {
				a[no] = 1;
				System.out.println(no + "번 예약 완료");
				sum++;
				System.out.println(sum +"자리가 예약된 상태입니다");
			} else {
				System.out.println("이미 예약된 좌석입니다");
				System.out.println("다른 자리를 선택해 주세요");
			}
		}
		sc.close();

	}

}
