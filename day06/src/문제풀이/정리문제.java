package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "떡볶이";
		switch (food) {
		case "떡볶이": // 타입에 맞게 사용해야한다.
			System.out.println("분식집으로");

			break;
		case "우동":
			System.out.println("일식집으로");
			break;
		case "짜장면":
			System.out.println("중국집으로");
			break;
//우동: 일식집; 짜장면:중국집; 아니면: 집에서;

		default:
			System.out.println("집에서");
			break;
		}
//위치 = index
		String sn = "980201-1037514"; // 0번째부터 시작

		char gender = sn.charAt(7); // '1' 인 값을 가져온다.'';
		switch (gender) { // 기본데이터는 비교연산자 사용가능하다.

		// swich
		case '1': // 모든 경우의수를 다 입력해줘야한다.
		case '3':
			System.out.println("남자입니다.");

			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");

			break;

		default:
			System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			break;

		}
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
			
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		}	else{
				System.out.println("잘못입력");

		}
		// if~else : char는 기본데이터이기 때문에 비교연산자 사용 가능
		
	}

}
