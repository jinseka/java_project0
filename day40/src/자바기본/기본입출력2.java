package 자바기본;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		
		//1. 왜 에러가 나는가 ?
		//Scanner sc1 = new Scanner();
		// 기본생성자란? 
		//기본생성자는 클래스이름과 동일한 이름을 가진 파라메터없는 생성자메서드이다.
		//객체 생성시 꼭 처리해야할 것 있으면 생성자 메서드에 정의해서 꼭 실행하도록 하는 역할 
		//변수 초기화를 많이한다.
		// 생성자메서드는 대문자로 시작하는 유일한 매서드이다 . O & X  O
		//에러의 원인 기본생성자가 없기 대문에 기본생성자를 만들어 두지 않았기 때문에 호출할 수 없다.
		//기본생성자는 자동으로 생성됨.
		//단. 다른 파라메터 있는 생성자가 없는 경우에만  ! ! !
		//어떤 생성자들이 있는 지 알고 싶은 경우
		//1) CTRL + 클릭을 해본다.
		//2) 자동완성 기능을 사용해 본다.
		
		
		
		//2.system.in 말고 다른건 없는가 ? 
		
		
		//오늘 온도는 몇도인가요 ? 
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 온도는 몇도인가요 ?");
			//변수에 넣어서, 30도 이상이면 너무 더워요.
			int temp = sc.nextInt(); // 모든 외부 입력은 모두다 string -- > int 로 변환 ! //"33">> 33
			//1   2     3 
			//순서  ! 
			// 1. 변수 선언 : 변수만들어 졌음.
			// 2. 입력값을 스트링으로 받아서 정수로 변환
			// 3. 변환한 정수값을 변수에 저장함 .
			if (temp >= 30) {
				System.out.println("너무 더워요 ! ");
			} else {
				System.out.println("괜찮아요 !  ");
			} 
		}
		
			
		//콘솔과 자바프로그램간 입력스트림 (입력용 연결통로)이 만들어진다.
		
		sc.close(); // 입력스트림 닫는다.
		
		//입력스트림을 열엇으면 항상 닫아줘야 한다.
	}

}
