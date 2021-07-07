package 복습;

import java.util.Scanner;

public class 스트링3개입력 {

	public static void main(String[] args) {
//		2.스트링 3개 크기의 배열을 만들어서
//		자바,스프링,jsp를 순서대로 넣는다
//		=>'자바 보다는 스프링' 로 출력

		String[] s = new String[3];
		//배열은 자동 초기화{null,null,null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("과목 입력>> ");
			s[i] = sc.next();
		}

		System.out.println(s[0] + "보다는" +s[1]);
		sc.close();
	
//		String[] s2 = {"자바", "스프링", "jsp"};
//		배열은 자동 초기화{null, null, null}
//		s2[0]=주소!
//		String 변수는 원래 주소가 들어가있지만
//		내부적으로 그 주소가 가르키는 char들을 프린트되도록 조정이 되어있는 상태임
//		Scanner sc = new Scanner(System.in);
		
	}

}
