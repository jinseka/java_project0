package 반복문;

import java.util.Iterator;

public class 반복문1 {

	public static void main(String[] args) {
		// 반복문안에 들어가는 변수는 횟수를 카운트 할 때도 사용하고
		// 변수에 들어있는 값을 가지고 처리할 때도 사용한다.
		// 2가지 경우가 있음
		// 1부터 5까지 반복해서 찍어보자

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (int j = 1; j <= 10; j = j + 2) {
			System.out.println(j);
		}
		for (int j2 = 0; j2 <= 100; j2 = j2 + 5) {
			System.out.println(j2);
		}
		for (int k = 100; k >= 1; k--) {
			System.out.println(k);
		}
		for (int k2 = 1000; k2 >= 0; k2 = k2 - 8) {
			System.out.println(k2);

		}

	}
}

//1부터 10까지 중 2씩 점프해서 찍어보자.
//1부터 100까지 중 5씩 점프해서 찍어보자.
//100부터 1까지 점프해서
//1000부터 0까지 8씩 점프해서 찍어보자.