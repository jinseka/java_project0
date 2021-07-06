package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로2 {
	// 공백제거
	public static void main(String[] args) {
		// String에 포항되어 있는 공백을 제거할 때는 trim을 써라
		String s1 = "    감자    ";
		System.out.println(s1.length());
		String s2 = s1.trim(); // 공백제거
		System.out.println(s2.length());
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());

		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파 ";
		//비파괴함수(원본을 건드리지않음.)
		System.out.println(data.length());
		String data2 = data.trim(); // 양쪽은 트림으로 자르고
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", ""); // 중간에 공백은 리플레이스로 잘라라 ,비파괴함수
		System.out.println(data3);

		int[] num = { 1, 2, 5, 10, 4, 20 };
		Arrays.sort(num); // 원본을 바꾼다. 파괴함수
		for (int i : num) {
			System.out.print(i + " ");
		}
		// 전화번호입력>> 011-245-1234
		// 1)양쪽 공백을 제거하시오.
		// 2)-을 기준으로 분리해내세여(String[])
		// 3)첫번째 문자열이 011이면 sk.019이면 lg, 나머지면 apple
		// 4)두번째 글자의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		//					아니면 유효하지 않는 전화번호
		String n1="    011-245-1234";
		System.out.println(n1.length());
		
		
		

	}
}