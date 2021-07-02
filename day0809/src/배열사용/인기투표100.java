package 배열사용;

import java.util.Scanner;

public class 인기투표100 {
	// teminated 끝났다.종결
	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "방탄" };
		int[] tv = new int[3]; // 투표수 {0,0,0}
//		System.out.println(name[0]+" : "+tv[0]);
		// 변수에 들어가는 유형 , 기본형 int = 100;
		// 다른건 다 주소(8바이트)가 들어간다.
		// 다 heap영역에 들어간다.
		// 기본형을 제외한 모든것은 참조용 변수 (파생된 변수)
		Scanner sc = new Scanner(System.in); // 램에 스캐너를 가져다놓았다. system.in은 입력받을 장치를 표시
		// ctrl +shift+z

		while (true) {
			// 사용자가 사용할수 있도록 화면을 만들어보자.
			System.out.println("인기투표 0)아이유, 1)유재석, 2)BTS, 3)종료");
			System.out.print("선택번호>>");
			int num = sc.nextInt();

			if (num == 3) {

				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + " : " + tv[i] + "표");

				}
				System.exit(0);
				// System.out.println(name[0]+" : " + tv[0]+ "표");
				// System.out.println(name[1]+" : " + tv[1]+ "표");
				// System.out.println(name[2]+" : " + tv[2]+ "표");
				// 투표실행 >> 종료 x
				// 종료 >>투표실행 O

			}

			// 해당 인덱스에 있는 배열의 값을 1증가
			//{0,0,0} -> 0, 1, 2
			tv[num]++;
			System.out.println(name[num] + " 득표");

		}

		// 누적되는건 반복문에 넣지 말아라.

	}// main

}// class
