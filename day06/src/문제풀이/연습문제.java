package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 연습문제 {

	public static void main(String[] args) {

//1.사원번호 입력: 기103
// 사원번호 중 첫글자가 '기' 인경우 '기획부이군요'
//		'인' 인경우 '인사부이군요'
//                	'개' 인경우 '개발부이군요'
//	사원번호 중 두번째 글자가 '1'또는 '2'인경우 '임원'
//		'3'인경우 '부장'
//		'4'또는 '5'인경우 '평사원'
//		나머지는 해당 직급이 없음.

//2.나이를 입력:2
//태어난 연도는 2020년(date이용)
//태어난 시각:10 intger.parseint
//=>오전에 태어나셨군요(오전,오후,밤,새벽,....)

		String sn = JOptionPane.showInputDialog("사원번호를 입력해주세요");
//	"기103";
		char num1 = sn.charAt(0);
		switch (num1) {
		case '기':
			System.out.println("기획부이군요");
			JOptionPane.showMessageDialog(null, "기획부이군요");

			break;
		case '인':
			System.out.println("인사부이군요");
			JOptionPane.showMessageDialog(null, "인사부이군요");

			break;

		default:
			System.out.println("개발부이군요");
			JOptionPane.showMessageDialog(null, "개발부이군요");
			break;
		}

		char num2 = sn.charAt(1);
		switch (num2) {
		case '1':
		case '2':
			System.out.println("임원");
			JOptionPane.showMessageDialog(null, "임원");

			break;
		case '3':

			System.out.println("부장");
			JOptionPane.showMessageDialog(null, "부장");

			break;

		case '4':
		case '5':
			System.out.println("평사원");
			JOptionPane.showMessageDialog(null, "평사원");

			break;
		default:

			System.out.println("해당 직급이 없음.");
			JOptionPane.showMessageDialog(null, "해당 직급이 없음");
			break;
		}

		String age = JOptionPane.showInputDialog(null, "태어난 연도를 입력해주세요");
		int a = Integer.parseInt(age);

		Date date = new Date();
		int year = date.getYear() + 1900;

		JOptionPane.showMessageDialog(null, "올해 " + (year - a + 1) + "살 입니다.");

		String hour = JOptionPane.showInputDialog(null, "태어난 시각은 몇시인가요?");
		int b = Integer.parseInt(hour);

		if (b <6) {
			JOptionPane.showMessageDialog(null, "새벽에 태어나셨군요");
			System.out.println("새벽에 태어나셨군요");
		} else if (b < 12) {
			JOptionPane.showMessageDialog(null, "오전에 태어나셨군요");
			System.out.println("오전에 태어나셨군요");
			
		} else if (b<18) {
			JOptionPane.showMessageDialog(null, "오후에 태어나셨군요");
			System.out.println("오후에 태어나셨군요");

		} else {
			JOptionPane.showMessageDialog(null, "밤에 태어나셨군요");
			System.out.println("밤에 태어나셨군요");

		}
		{

		}

	}

}
//
//부품을 사용하는 방법 
//24가지중 2가지 배움 , 앞으로 10가지정도배울예정
//항상 임포트를 확인해봐라
//조건문 반복문 (유한반복, 무한반복)
//
//Integer, Double, System, JOptionPane,는 하드웨어 처럼 생각하자.  기능 = 명령어가 기능처리한다. 함수
