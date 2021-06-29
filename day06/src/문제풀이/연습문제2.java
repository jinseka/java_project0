package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		String no = JOptionPane.showInputDialog(null, "사원번호입력하세요");

		char first = no.charAt(0);
		char sec = no.charAt(1);
		switch (first) {
		case '기':
			System.out.println("기획부");

			break;
		case '개':
			System.out.println("개발부");

			break;
		case '인':
			System.out.println("인사부");

			break;
		default:

			System.out.println("없는 부서입니다.");

			break;
		}

		switch (sec) {
		case '1':
		case '2':
			System.out.println("임원");

			break;
		case '3':
			System.out.println("부장");

			break;
		case '4':
		case '5':
			System.out.println("평사원");

			break;
		default:

			System.out.println("해당직급이 없습니다.");

			break;
		}

		String age = JOptionPane.showInputDialog(null, "나이를 입력");
		// 태어난 연도는 올해년도에서 - 나이 +1
		int age2 = Integer.parseInt(age);

		Date date = new Date(); // 올해를 구한다.
		// year는 1900을 더해야한다. 기준이 1900년도 였다.
		// 오류가 났을때 f2눌러서 확인
		// 자동 import ctrl+shift+o(영문)

		int year = date.getYear() + 1900;

		int result1 = year - age2 + 1;
		System.out.println(result1);
		// 태어난 연도는 올해년도에서 - 나이 +1

		String time = JOptionPane.showInputDialog(null, "태어난 시간입력");
		int time2 = Integer.parseInt(time);
		if (time2 < 12) {
			System.out.println("오전에 태어나셨군요.");
		} else if (time2 < 20) {
			System.out.println("오후에 태어나셨군요.");
		} else if (time2 < 24) {
			System.out.println("밤에 태어나셨군요.");
		} else {
			System.out.println("새벽에 태어나셨군요.");

		}
	}

}
