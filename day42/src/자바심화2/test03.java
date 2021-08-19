package 자바심화2;

import java.util.ArrayList;
import java.util.Scanner;
//못풀겠다 .
//수강신청을 진행 
//과목 코드 입력시  count++하여 추가  >> 신청가능합니다 신청완료되었습니다, 문구출력
//다시 while으로 반복
//0 누르면 종료 

public class test03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("수강 신청을 진행합니다.");
			System.out.println("원하는 과목을 신청해주세요.");
			System.out.println("--------------------");
			System.out.println("1)자바 2)스프링 3)안드로이드 4)파이썬 5)제이쿼리");
			System.out.println("--------------------");
			System.out.println(list.toString());
			System.out.println("--------------------");
			System.out.println("원하는 과목코드를 입력해 주세요 . (종료 0) == >");
			int sel =sc.nextInt();
			if (sel == 0 ) {
				System.out.println("신청을 종료합니다.");
				break;
			} else if (sel== 1) {
					int r1 =sc.nextInt();
					int size1 =list.size();
					list.add("1");
					int size2 =list.size();
					if (size1 < size2) {
						System.out.println("추가되었습니다.");
					}

			}{

			}
		
		}
		sc.close();
	}// main
}// class
