package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10]; // 부품 만드는건 반복문에 포함 시키지 말아라
		// {0,0,0,0,0,0,0, ... }
		Scanner sc = new Scanner(System.in); //

		int count = 0;
		final int MONEY = 10000; // 항상 똑같은 수가 들어가는 변수 (상수)
		// final은 상수를 나타내는 상수, 변경 불가능 하다. 변수명을 모두 대문자로 사용한다.
		//
		// 1.누적변수 자리를 만들고 2.누적시켜야한다. 3.출력
		while (true) {
			System.out.println("-------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");

			}
			System.out.println();
			System.out.println("-------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");

			}
			System.out.println();
			System.out.println("원하는 자리 번호 입력 (종료 -1)>>");
			int no = sc.nextInt(); // 0번입력
			if (no == -1) {
				System.out.println("예약 시스템 종료합니다.");
				int total = count * MONEY;
				System.out.println("당신이 지불 금액은 " + total + " 원");
				break;

			}

			if (seat[no] != 1) {
				seat[no] = 1;
				System.out.println(no + "번 예약 완료. ");
				count++;
				System.out.println(count + " 자리 예약되었습니다. ");

				System.out.println("총" + count + "자리 예약이 되었습니다.");

			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요");

			}
			System.out.println();
			// 예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인! 해야함.
			// 확인 방법 정해보자 ! 둘중하나 !
			//
			// 0번을 입력했으면 배열의 인덱스 0번 자리를 1로 변경해서 예약되었다는 것을 저장해두자.
			// 예약이 되어있는지 안되어있는지 확인을 하고 되어있으면 되어 있다고 확인해줘야 한다.

		}
		sc.close();

		// 예약된 자리에 배열이 1ㅣ 들어간 개수를 세어도 구할 수 있음.
		// 1.지금 까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요. !
		// 배열안에 들어간 값이 1이면
//		{1,1,1,0.0.0.0.0....}
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;

			}
		}

		System.out.println(count2 + "자리 예약됨.");

		// 2. 1로 예약된 자리가 어디인지 프린트
		String sum = "";

		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
//				System.out.println(i + " 번 자리");
				sum = sum + i + " 번";
			}
		}
		System.out.println("예약된 자리 목록" + sum);

	}// main

}// class
