package 배열생성;

public class 문제풀이1 {

	public static void main(String[] args) {
		// int 크기 5인 배열을 생성해보세요.
		// 2 배열의 크기를 프린트해보세요
		// 3 배열의 첫번째 위치에 100을 넣어서 프린트 하세요
		// 4. 배열의 마지막 위치에 500을 넣어서, 프린트
		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		// 6. 배열의 전체 데이터를 프린트
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		// 8. 그림으로 그려보세요.
		// 1 배열생성
		int[] s = new int[5];
		
		// 2.배열의 크기
		System.out.println(s.length);
		// 3
		s[0] = 100;
		System.out.println(s[0]);
		// 4
		s[s.length-1] = 500; //마지막 위치 s.length-1
		System.out.println(s[4]);
		// 5
		s[2] = 200;
		System.out.println(s[2]);

		// 6
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");

		}
		System.out.println();
		// 7
		for (int i = 0; i < s.length; i++) {
			System.out.println((i) + " : " + s[i]);
			
		}
	}

}
//기본형 변수를 제외하고는 참조형변수
//기본형은 값이들어가고 기본형 변수
//나머지는 주소가 들어가기때문에 참조형 변수
