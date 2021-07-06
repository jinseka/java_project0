package 문제풀이;

import java.util.Scanner;

public class 배열응용문제 {

	public static void main(String[] args) {
		// 전화번호입력>> 011-245-1234
		// 1)양쪽 공백을 제거하시오.
		// 2)-을 기준으로 분리해내세여(String[])
		// 3)첫번째 문자열이 011이면 sk.019이면 lg, 나머지면 apple
		// 4)두번째 글자의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		// 아니면 유효하지 않는 전화번호
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력");
		String num = sc.next();
		// 1)양쪽 공백을 제거하시오.
		String num2 = num.trim();
		System.out.println(num2);
		// 2)-을 기준으로 분리해내세여(String[])
		String[] num3 = num2.split("-");
		// 3)첫번째 문자열이 011이면 sk.019이면 lg, 나머지면 apple
		if (num3[0].equals("011")) {
			System.out.println("sk입니다");

		} else if (num3[0].equals("019")) {
			System.out.println("lg");
		} else {
			System.out.println("apple");
		}
		// 4)두번째 글자의 길이가 4개이상이면 최신폰, 아니면 올드폰
		if (num3[1].length() >= 4) {
			System.out.println("최신폰");

		} else {
			System.out.println("올드폰");
		}

		// 5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		if (num2.length() >= 10) {
			System.out.println("유효한 핸드폰 번호입니다.");
		} else {
			System.out.println("유효하지 않은 핸드폰 입니다.");
		}

	}//class

}//main



//210706


//
//에러의 종류 
//------------------
//
//ctrl +f11 을 누르면 
//1)번역단계 : 컴파일, 컴파일러(javac.exe) => 컴파일 에러(디버깅)
//  javac 영화예매.java
//2)실행단계 : 인터프리트, 인터프리터(java.exe) =>실행에러(런타임에러)
//  java 영화예매
//
// 
//버튼을 누를때 위치가 변경되면서 이름과 이미지 평점이 바뀐다.
//눌렀을때 인덱스값 일치시켜 바뀌게끔
//



