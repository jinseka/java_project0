/*
 * 날짜:
 * 수정내용:
 * 작성자:
 * 
 * 
 */
package 배열응용;

import java.util.Scanner;

public class 영화관예약2 {

	public static void main(String[] args) {

		int[] seat = new int[11]; // 변수공간 만들기 , 프로그램에 필요한 배열을 만든다 (int[] seat = new int[11];)
		Scanner sc = new Scanner(System.in); // 입력값이 필요하기 때문에 Scanner를 import하고 (new Scanner();)
		int count = 0;   //count 초기화값
		//현재까지 작성한 코드를 while문에 집어 넣는데, Scanner와 좌석배열 선언은 반복될 필요없으니 while문 위쪽으로 빼놓는다

		while (true) { // 밑의 조건을 무한반복 시킨다.
			System.out.println("----------------------");
			for (int i = 0; i < 11; i++) {
				System.out.print(i + " "); // i가 0~10 까지 1씩 증가하여 프린트 시킨다. 좌석번호 생성

			}
			System.out.println(); // 한줄띄우기
			System.out.println("----------------------");
			for (int i = 0; i < 11; i++) {
				System.out.print(seat[i] + " "); // seat[i] 를 프린트 시켜준다 . 좌석 목록을 생성

			}
			System.out.println(); //한줄 띄우기
			System.out.println("원하시는 좌석번호를 입력하세요.(종료 -1 )>>"); // 문구를 프린트하여 종료시키는조건을 프린트한다.
			int no = sc.nextInt(); //  질문의 스캐너 한 입력받은값을 정수값으로 받는다.
			if (no == -1) {                                // 조건이 -1일경우 반복을 종료한다.         
				System.out.println("종료합니다.");
				break;

			}
			if (seat[no] != 1) { //seat[no] ==0 과 같음
				seat[no] = 1; // 배열 값이 1일 경우 배열값에 예약완료를한다.
								// 배열 값이 1이 된 경우 count 하여 자리 예약을 표시한다.
				System.out.println(no + " 번 예약완료");
				count++; 
				System.out.println(count + "자리 예약되엇니다."); // 총 예약된 자리 표시
				
			}
			else {
				System.out.println("이미 예약된 자리입니다.");   // 배열받은 값이 1이 아닐경우 메세지를 프린트한다. 
				System.out.println("다른 자리를 선택해주세요");	//

			}
		}//while
		
		
		
		sc.close(); // 스캐너 사용 종료

//		1. 문제가 요구하는 출력 화면을 먼저 재현해 본다
//		2. 프로그램에 필요한 배열을 만든다 (int[] seat = new int[10];)
//		3. 입력값이 필요하기 때문에 Scanner를 import하고 (new Scanner();)
//		4. 그 입력값을 변수에 넣기로 한다. (int no = sc.nextInt();)
//		5. 우선 종료 if문을 작성한다.
//		6. if (no == -1) 라면 시스템이 종료되게 코딩을 한 후 확인한다
//		7. 현재까지 작성한 코드를 while문에 집어 넣는데, Scanner와 좌석배열 선언은 반복될 필요없으니 while문 위쪽으로 빼놓는다
//		8. -1 입력 전까지 무한 반복되는지 확인
//		9. 배열 속 값이 0이면 빈 자리, 1이면 예약된 자리라고 하기로 정한다
//		10. 좌석 번호(0~9)를 입력받으면(=no) 그 값이 해당 좌석 index이므로 
//		11. if 조건으로 index가 가리키는 해당값이 0인지 1인지 따진다
//		12. 0이라면 값을 넣는다 seat[no] = 1;
//		13. else {1이라면 예약된 자리임을 사용자에게 알리고 (sysout “이미 예약됨”)} 출력후 8번으로 while반복 재시작
//		14. 예약한 횟수를 알기 위해 새로운 변수 int count 선언한다 (while문 바깥으로)
//		15. 12번 if문 중괄호에 count++; (count = count + 1)
//		16. 그 아래에 바로 count 출력 sysout (count)
//		17. <저장된 값 중 1이 몇개인지>
//		18. 새로운 int count2 = 0; 선언+초기화
//		19. seat 배열수만큼 반복하기 위해 for문
//		20. if조건으로 i가 index일 때 해당하는 값이 1인지 비교시킨다 if (seat[i] == 1)
//		21. 조건이 맞다면 count2++;
//		22. sysout (count2) : 배열에 저장된 값 중 1이 몇개인지 알 수 있다
//		23. <저장된 값 중 1이 어디에 있는지>
//		24. 새로운 String sum = “”; (값을 비워둔다)
//		25. seat 배열수만큼 반복하기 위해 for문
//		26. if조건으로 i가 index일 때 해당하는 값이 1인지 비교시킨다 if (seat[i] == 1)
//		27. 조건이 맞다면 스트링 sum자리에 (sum+i+”번”(결합연산자)) 대입시킨다
//		28. sys out (sum) : 1로 저장된 값의 위치가 출력된다
	
	}

}
