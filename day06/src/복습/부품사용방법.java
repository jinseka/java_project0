package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음.
		// 클래스이름으로 바로 사용 가능.
		// Integer, Double, System, JOptionPane,
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는지 여부
		// 함수를 가지고 있는 부품을 선택
		// cpu가 주인 집을만들때 항상 렘에 가져다놔야한다. 망치는 이미 램에 있는 것

		// 벽돌
//		Date name; //변수를 만들어라
//		name = new Date(); //데이트를 만들어 name에 복사해라
		// 내눈 앞에 가져다 놔야한다. = 램에 가져다 놔야한다.
		// 아직 가져다 놓은 상태이다.

		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔
		// cpu는 모든 부품을 ram에 가져다 놓고 조립한다.
		// Date date; => 저장된 타입 변수명; (선언)
		// 선연 : Ram에 저장공간을 만드는 것
		Date date = new Date();
//		Random name = new Random(); // 부품마다 다르다 . 랜덤은 써줘도 되고 안써줘도 된다.
//		Scanner sc = new Scanner(System.in); // 스캐너는 입력값이 있어야한다.
		int hour = date.getHours(); // 10
		System.out.println("현재 시각은 " + hour + "시"); // +연산자가 먼저, 변수에 넣을 수 없다.

		// 합수는 반환이 있는 것이 있고, 없는 것이 있다.
		// 반환을 return이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
//		반환값이 있다, 없다
		System.out.println(date.getMinutes());
//		System.out.println(System.out.println()); // 가져올 값이 없으면 프린트 되지 않는다.
		// 반환값이 없는 경우에는 void라고 써있다. void는 없다라는 의미이다.

		// 유형 변수이름 = 함수
		// 앞에있는걸 소문자로 쓰는걸 권장한다.

		int month = date.getMonth() + 1; // +1양력
		String result = "해당 계절이 없습니다."; // null은 비워져있는 상태 꺠끗한 상태 , 해당되지 않고 싶을때 해당값을 넣으면 된다.
//		month ==3 ||month ==4 || month ==5   =  3<= month && month <=5
		if (3 <= month && month <= 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);

		System.out.println("===================");

		int day = date.getDay();// 요일
		// if 문에는 자체적으로 브레이크가 있다.
		// while 문에는 브레이크가 없다.
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요");

		} else {
			System.out.println("주중에는 달려요");

		}
		while (true) {
			System.out.println("달려요 ! ! 달려요 ! !"); // 1
			System.out.println("또 달려요!!!");// 2
			System.out.println("마지막 달려요");// 3
			break;

		}
//key 에 변수를 입력
		switch (month) {
		// case가 if이다.
		case 6:
		case 7:
		case 8: // if
			System.out.println("여름 입니다.");

			break;
		case 9:
		case 10:
		case 11: // if
			System.out.println("가을 입니다.");
			break;

		case 12:
		case 1:
		case 2: // if
			System.out.println("겨울입니다.");
			break;
		default: // else
			System.out.println("봄 입니다.");
			break;
		}
//2:28, 3,5,7,8,10,12 : 31, 나머지 :30
// 심플하면 기능이 적다.
// 정수(int), 문자1, String, 실수는 지원하지 않는다,
		switch (month) {
		case 3:
		case 5:
		case 7:
		case 10:
		case 12:
			System.out.println("31일까지 있습니다.");

			break;

		case 1:
		case 4:
		case 6:
		case 8:
		case 9:
		case 11:
			System.out.println("30일까지 있습니다.");

			break;

		default:
			System.out.println("28일까지 있습니다.");
			break; // else의 경우는 안써도 된다.
		}
		
		
		
	}
//기능중심적으로 부품을 만들어야 한다.

}
