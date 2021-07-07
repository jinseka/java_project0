package 복습;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
//		1.정수 5개의 크기의 배열을 만들어서
//		10,20,30,40,50을 순서대로 넣는다
//		첫번째 값과 세번째 값을 더해서 프린트
//
//		int[] a = { 10, 20, 30, 40, 50 };
//		for (int i = 0; i < a.length; i++) {
//               a.length-4; ->1개만 출력
//			System.out.println(a[0] + a[2]);
//		}
//		for (int x : a) {
//			System.out.println(x);
//
//		}

		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력>> ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		sc.close(); //스캐너 스트림 연결통로 닫음
//		2.스트링 3개 크기의 배열을 만들어서
//		자바,스프링,jsp를 순서대로 넣는다
//		=>'자바 보다는 스프링' 로 출력

		String[] name = { "자바", "스프링", "jsp" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[0] + "보다는" + name[1]);
       System.exit(0);  
		}
        
//		int[] num = new int[3];
//		=>int만 넣겠다는 얘기, 같은 타입만 넣을 수 있다
//		=>고정된 크기를 가진다.
//		(크기가 변경 불가능)
		
	}

}
