package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {
		//데이터베이스
//		목적성
//		항상 접근 가능해야한다.
//
		// 배열을 만들때 고민해야할것
		// 배열을 만들 때 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 }; // 변수가 5개 생겼다.(num .100. 200.300 lenght.) 24바이트 int = 4바이트 ;4+4+4+4+8
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {
			System.out.println(x);
//데이터를 가지고 할 수 있는 종류 
		}

		// 배열을 만들 때 모르고 있다가 나중에 넣는 경우
		int[] num2 = new int[3]; // {0,0,0 } 자동 초기화 !
		num2[0] = 1000;
		num2[num2.length - 1] = 1000;
		for (int x : num2) {
			System.out.println(x);
		}
	}//main
}//class