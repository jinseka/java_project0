
package pack03;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);					//스캐너 생성
		
		for (int i = 0; i < 10; i++) {						//반복문 int i = 0; i < 10 만큼 *을 프린트
			System.out.print("*");
		}
		System.out.println("");									//한칸 띄우기
		System.out.println("원하시는 기호를 넣으세요>>");				//질문으로 답 받기
		String s =sc.next();									//받은 답을 string s 변수 만듬
		System.out.println("원하시는 횟수를 넣으세요>>");				
		int mun1=sc.nextInt();									//횟수의 답을 int 로 받는다.
		for (int i = 0; i < mun1; i++) {						//반복문을 사용하여 int로 받은 답만큼 반복한다.
			System.out.print(s);								//반복한 만큼의 s를 프린트한다.
		}
		
		System.out.println();									
		int count = 0;												//count의 초기값설정한다.
		while (true) {												//while 문을 사용한다.
			System.out.println("1)증가,2)감소,3)종료를 선택해주세요.>>");	//질문을 프린트 한다.
			int num1 = sc.nextInt();								//받은 답을 int num1으로 받는다.
			
			for (int i = 0; i < args.length; i++) {					//for문을 사용하여 num1으로 받은값을 카운트 한다.
				System.out.println(count+"num1");
			}
			
			if (num1==3) {
				System.out.println("시스템을 종료합니다.");				//받은값이 3일경우 스시템을 종료한다.
				break;
			}	
			count++;
		} 
	
	
		System.out.println("현재까지의 카운트 값은 "+count+" 입니다.");				//최종값을 프린트한다.
		sc.close();
			
	}

}
