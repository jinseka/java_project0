package 자바기본;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//누적용은 반복문 안에 쓰지 않는다.  초기화 되기 때문에
		int sum = 0 ; //쓰레기 갑 상태 : 연산도 불가능 하고 출력도 되지 않는 상태 
		// 처음값을 넣어줘야 한다.
		// 초기화 값  ! !  == 변수초기화 ! 
		
		//변수초기화를 반드시 해주어야 하는 경우는 ?
		//변수자동초기화를 해주게 되면 안해줘도 된다.
		//변수초기화는 항상 해줘야한다. 초기화를 안하는 코드는 테스트 코드다  ! 
		//자동으로 되는 경우가 있다.  = 전역변수 , 멤버변수   << 는 자동 초기화 됨 ! 
		//전역 변수는 클래스 전체영역에서 사용가능한 변수이다.
		//변수선언의 위치가 중요하다 ! 위치에 따라 사용할 수 잇는 범위가 달라짐 .
		//변수 선언이 클래스 바로 아래되어야 전체 영역에서 사용 가능 .
		//자동으로 안되는 경우는 수동으로 초기화르 ㄹ해주어야 한다. (지역변수, 로컬변수 )
		//로컬변수는 반드시 수동으로 초기화를 해주어야 한다.
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("오늘 온도는 몇도인가요 ?");
			
			int temp = sc.nextInt(); 
			
			if (temp >= 30) {
				System.out.println("너무 더워요 ! ");
			} else {
				System.out.println("괜찮아요 !  ");
			} 
			sum = sum + temp;
			 
		}
			double avg = sum / 5.0 ; //자바에서는 정수끼리의 연산은 무조건 정수 ! ! ! 
			//double avg = (double)sum / 5.0 ;   << ()를 통하여 타입을 바꾸려고 할때 CPU가 RAM에 있는 것을 가져다가 타입을 바꾼다.  
			
			//자바에서는 하나라도 실수이면 연산의 결과는 실수이다.  ! ! !
			System.out.println(avg);
		
		sc.close(); 
		
	}

}
