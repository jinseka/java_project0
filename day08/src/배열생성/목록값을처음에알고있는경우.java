package 배열생성;

import java.util.Iterator;

public class 목록값을처음에알고있는경우 {

	public static void main(String[] args) {
		// 배열을 만들 때는 처음부터 값을 알고 있는 경우와 모르는 경우를 다르게 써준다.
		String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		for (String s : names) {
			System.out.print(s + " ");

		}
		System.out.println(" ");
		int[] age = { 100, 88, 55, 10, 4 };
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);

		}

		// i=인덱스의 i
		for (int x : age) { // 항상 오른쪽에는 많은거 배열같은거 자동완성의 i 는 인덱스의 i가 아닌 int 의 i이다.
			System.out.print(x + " ");
			// 회사에서는 아래 for문을 더 선호 한다.
			// for each 는 출력용이다 .입력용이 아니다.
		}

		System.out.println(" ");

		double[] eyes = { 2.0, 1.5, 1.2, 0.8, 1.0 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.print(d + " ");

		}
		System.out.println(" ");
		char[] genders = { '남', '여', '남', '여', '남' };
		for (int i = 0; i < genders.length; i++) {
			System.out.println(genders[i]);
		}
		for (char c : genders) {
			System.out.print(c + " ");

		}
		System.out.println(" ");
		boolean[] food = { true, false, true, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);

		}
		for (boolean b : food) {
			System.out.print(b + " ");

		}

	}

}
