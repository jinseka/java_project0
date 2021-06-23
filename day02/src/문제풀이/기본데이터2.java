package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
	
		// 색을 저장(r)
		// 호실을 저장(709)
		// 평균나이를 저장(27.5)
		// 예약어는 저장공간의 공간을 쓸수없다.
		//char, int, class,
		
//내가한거
//		char color = 'r';
//		int num = 709;
//		double avgAge = 27.5;
		//자바는 카멜표기법 ,낙타표기법 , avg_afe(파이썬, 뱀표기법) 
		
//		System.out.println("색상 : " +  color);
//		System.out.println("호실 : " +  num);
//		System.out.println("평균나이 : "+ avgAge);
	
		
		char color ;
		int num ;
		double avgAge ;
		
		
		//2. 할당, 대입
		color ='r';
		num = 709;
		avgAge = 27.5;
		//변수(variable, 값이 변한다): 램에 저장공간에 들어갈 값은 변할 수 있다.
		//램에 만들어지는 저장공간을 변수라고 부른다.
		
		color = 'b';
		//변수하나에는 값이 하나만 저장!

		//3. 출력(프린트)
		// 한줄 복사 : ctrl + alt + 화살표아래
		// 한줄 이동 : alt + 이동방향화살표
		// 한줄 삭제 : ctrl +d 
		System.out.println("색은 " + color); //결합연산자
		System.out.println("방번호는 " + num + "호");
		System.out.println("평균 나이는 " + avgAge);
	}

}
