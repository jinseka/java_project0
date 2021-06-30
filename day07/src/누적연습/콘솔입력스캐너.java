package 누적연습;

//패키지가 java.util.a.Test; 불가능 java.util.a.*; 가능 
//java.util.* 가능하다
import java.util.Scanner;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		// 스캐너는 입력용이다.
		// 외부에서 정보를 받아올때 사용한다.
		// 자바나 자바x 패키지를 만들면 안된다. 내가 만들경우 내 패키지를 인식해서 사용하지 못하게 된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요. >>>");
		String name = sc.next(); // String 입력 
								 // next라는거는 단어를 가져온다. 한 줄을 다 가져오는 것이 아니다. 공백이 있으면 안된다.
								//공백이 있으면 무시한다.
		System.out.println("당신의 이름은 " + name);

		
		System.out.print("당신의 소속을 입력하세요>>>");
		String com = sc.next(); //한줄 문장을 다 가져올수 있는 함수가 다르다. nextline
		System.out.print("당신의 소속은 "+com);
		
		//scanner는 String을 숫자로 가져올때 편하다.
		//sc.nextint(); 
	}

}
