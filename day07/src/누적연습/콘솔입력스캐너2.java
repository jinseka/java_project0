package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
//		숫자1 입력 >>200
//		숫자2 입렵 >>100
//		앞 숫자가 크다.
//		n1: 200
//		n2: 100
//		당신이 좋아하는 과목은 >>java
//		jsp로 점프

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1 입력 >>>");
		int n1 = sc.nextInt(); // String >>>> int
		System.out.print("숫자 2 입력 >>>");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("앞 숫자가 더 크다");
		} else {
			System.out.println("뒤에 입력한 숫자가 더 큽니다.");
		}

		System.out.print("당신이 좋아하는 과목은?");
		String a1 = sc.next();
		switch (a1) {
		case "java":
			System.out.println("jsp로 점프!");
			break;

		default:
			System.out.println("재밌는 자바^^");
			break;
		}
		
		
		
		
		// 나이입력 >>100 nextlnt()
		// 내년 나이는 101세
		// 키를 입력 >> 88.8 nextDouble()
		// 내년키는 98.8
		// 저녁을 먹었는지 입력(thru/false)>>true nextbllolean()
		// 배가 부르시겠군요!
		// 올해의 목표는 >> 열심히 살자 nextline() <<은 엔터를 인식한다.
		// 올해의 목표는 열심히 살자!!!!
		
		
		

//		System.out.println("숫자1 입력>>>");
//		System.out.println("숫자2 입력>>>");
//		int num1 = 200;
//		

		System.out.println("당신이 좋아하는 과목은(자바, c++ ,python)>>");
		String data = sc.next();
		if (data.equals("자바")) {
			System.out.println("JSP로 점프"); // 네이버 같은 복잡한 구조로 만들때는 jsp,asp로 사용
		} else if (data.equals("c++")) {
			System.out.println("ASP로 점프");

		} else {
			System.out.println("phthon로 점프"); // 간단한 구조로 만들때는 파이썬으로 인스타,페이스북
		}
		String data1 = sc.next();
		switch (data1) {
		case "자바1":
			System.out.println("JSP로 점프");
			break;
		case "c++1":
			System.out.println("ASP로 점프");
			break;

		default:
			System.out.println("phthon으로 점프");

			break;
		}
		// 복기 수업듣고 복기 하고 혼자 문제를 풀어보고 45단계에서 혼자 더늘려나가라

		System.out.print("나이입력>>>");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");
		System.out.print("키 입력>>");

		double height = sc.nextDouble();
		System.out.println("내년 키는" + (height + 10));
		System.out.print("저녁 먹었는지 입력(true/false)>>");
		boolean food = sc.nextBoolean();
		if (food == true) {
			System.out.println("배가 부르시겠군요.!");
		} else {
			System.out.println("배가 고프시겠군요.!");

		}
		sc.nextLine(); // nextline 쓸때는 한번더 쓴다.
		System.out.println("올해의 목표는>>>");
		String life = sc.nextLine();
		System.out.println("올해의 목표는 " + life + "!!!!");

	}

}
