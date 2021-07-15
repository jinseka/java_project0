package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //
		int count = 0;
		while (true) {
			System.out.println("숫자 크기 판별");
			System.out.println("-------------------");
			System.out.print("숫자입력>>");
			int num = sc.nextInt();
			System.out.print("숫자입력>>");
			int num2 = sc.nextInt();
			if (num > num2) {
				System.out.println("판결은 앞숫자가 크다.");

			}

			System.out.println("계속 하시겠습니까(계속:o,중단: x)");
			String ox = sc.next();
			if (ox == "o") {
				System.out.println("프로그램을 종료합니다.");
			}
			
			break;

		}
		sc.close();
		count++;


	
		

	}// main

}// class
