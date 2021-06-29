package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이시간요일계절 {

	// 시간을 구해보세요
	// 10시전이면 굿모닝
	// 15시 전이면 굿애프터눈
	// 20시 전이면 굿이브닝
	// 나머지는 굿나잇

	// 요일이 토/일이면 쉬어요.
	// 나머지요일이면 달려요.

	// 월이 3-5이면 봄
	// 6-8이면 여름
	// 9-11이면 가을
	// 나머지면 겨울
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();

		System.out.println("현재시간은 " + hour + "시 입니다.");
		if (hour < 10) {
			System.out.println("굿모닝");

		} else if (hour < 15) {
			System.out.println("굿에프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");

		} else {
			System.out.println("굿나잇");

		}

		int month = date.getMonth()+1;
		System.out.println(month);
		if (month == 3) {
			System.out.println("3월은 봄이에요");

		} else if (month == 4) {
			System.out.println("4월은 봄이에요");

		} else if (month == 5) {
			System.out.println("5월은 봄이에요");

		} else if (month == 6) {
			System.out.println("6월은 여름이에요");
		} else if (month == 7) {
			System.out.println("7월은 여름이에요");
		} else if (month == 8) {
			System.out.println("8월은 여름이에요");
		} else if (month == 9) {
			System.out.println("9월은 가을이에요");
		} else if (month == 10) {
			System.out.println("10월은 가을이에요");
		} else if (month == 11) {
			System.out.println("11월은 겨울이에요");
		} else if (month == 12) {
			System.out.println("12월은 겨울이에요");
		} else if (month == 1) {
			System.out.println("1월은 겨울이에요");
		} else if (month == 2) {
			System.out.println("2월은 겨울이에요");
		}
		

		int day = date.getDay()+1;
		System.out.println(day);

		if (day == 1) {
			System.out.println("일요일");

		} else if (day == 2) {
			System.out.println("월요일");

		} else if (day == 3) {
			System.out.println("화요일");

		} else if (day == 4) {
			System.out.println("수요일");
		} else if (day == 5) {
			System.out.println("목요일");
		} else if (day == 6) {
			System.out.println("금요일");
		} else if (day == 7) {
			System.out.println("토요일");
		}

	}

}
