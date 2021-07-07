package 배열응용;

import java.util.Scanner;

public class 문제3과일 {

	public static void main(String[] args) {
//		        ===================
//				좋아하는 과일은? 
//				1)사과 2)바나나 3)포도 4)키위 0)종료 >>1
//				===================
//				사과가 선택되었습니다
//
//				===================
//				좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>>2
//				===================
//				바나나가 선택되었습니다
//
//				===================
//				좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>>0
//				===================
//				시스템이 종료됩니다.
//				사과:3개
//				바나나:2개
//				포도:1개
//				키위:2개
//				구매하려면 전체 금액은 ________원입니다.

		String[] fruit = { "사과", "바나나", "포도", "키위" };
		int[] fruits = new int[4]; //{0,0,0,0}
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int total = 0;
		final int a = 1000; // 사과
		final int b = 1200; // 바나나
		final int c = 500; // 포도
		final int d = 300; // 키위
		

		System.out.println("=======================");
		while (true) {
			System.out.println("좋아하는 과일은?1)사과, 2)바나나, 3)포도, 4)키위 0)종료>> ");
			System.out.println("=======================");
			int f = sc.nextInt();
//			if (f == 0) {
//				System.out.println("시스템이 종료됩니다.");
//				System.out.println("총 금액은" + total + "원 입니다.");
//				
//				for (int i = 0; i < fruit.length; i++) {
//					System.out.println(fruit[i] + ":" + fruits[f] + "개");
//				}
//				break;
//			} else if (f == 1) {
//				System.out.println("사과가 선택되었습니다.");
//				fruits[0]++;
//			} else if (f == 2) {
//				System.out.println("바나나가 선택되었습니다.");
//				fruits[1]++;
//			} else if (f == 3) {
//				System.out.println("포도가 선택되었습니다.");
//				fruits[2]++;
//			} else if (f == 4) {
//				System.out.println("키위가 선택되었습니다.");
//				fruits[3]++;
//			} else {
//				System.out.println("없는 번호입니다. 다시선택해주세요");
//			}
			
			if (f == 0) {
				System.out.println("시스템이 종료됩니다.");
				total = fruits[0] * a + fruits[1] * b + fruits[2] * c + fruits[3] * d;
				System.out.println("총 금액은" + total + "원 입니다.");
				
				for (int i = 0; i < fruit.length; i++) {
					System.out.println(fruit[i] + ":" + fruits[f] + "개");
				}
				break;
			}else {
				fruits[f-1]++; //1번인 경우 사과를 선택했고, fruits[0]++;
				System.out.println(fruit[f-1] + "가 선택되었습니다."); //fruit[0]가 선택되었습니다.
			}
			System.out.println("=======================");

			// System.out.println("총 선택 수는" + sum +"개");
			for (int i = 1; i < fruits.length; i++) {
			
			}
		}
		sc.close();

	}// main

}
