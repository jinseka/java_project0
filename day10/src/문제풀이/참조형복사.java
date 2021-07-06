package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에들어있는 주소를 복사해보자
		// 한줄짜리 배열 1차원배열
		// 여러줄배열 면 2차원배열 (가로세로를 가진다)
		// 배열 복사를 할때는 한번 더 생각해야한다. 클론 함수를 사용해서 복사해야 깊은복사가 된다.

		int[] x = { 1, 2, 3 };
		int[] y = x; // 참조형복사 (주소를 복사) 얕은 복사 : 주소만 복사
		//어레이는 배열을 말하는거고  어레이리스트 
//		int []y =x.clone();	// 딥카피 // 참조형 복사 (깊은 복사: 주소가 가르키는 값들의 목록을 복사)
		
		
		
		
		System.out.print("x: ");
		for (int i : y) {
			System.out.print(+i + " ");

		}
		System.out.println("");
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
//		System.out.println(); = \n 이다. 

		System.out.println("\n==원본 x값 수정 후==");
		x[0] = 9;
		System.out.print("x: ");
		for (int i : y) {
			System.out.print(+i + " ");

		}
		System.out.println("");
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
