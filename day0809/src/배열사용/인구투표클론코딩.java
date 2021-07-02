package 배열사용;

import java.util.Scanner;

public class 인구투표클론코딩 {

	public static void main(String[] args) {

		String[] name = { "아이유", "유재석", "방탄","태연" };
		int[] tv = new int[4];

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)방탄 4)태연 5)종료");
			System.out.println("선택투표 >>> ");
			int num = sc.nextInt();
			if (num == 5) {
				System.out.println("종료하겠습니다.");

				for (int i =0; i < tv.length; i++) {
					System.out.println(name[i] + " : " + tv[i] + "표");

				}

				System.exit(0);
			}
			tv[num-1]++;
			System.out.println(name[num-1] + " 득표");
		}

	}// MAIN

}// CLASS
//
//
//
// 주말에여기까지 복습 0102까지 ppt 한번 보고 궁금한건 선생님께 
// 
//