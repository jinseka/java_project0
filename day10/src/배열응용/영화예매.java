package 배열응용;

import java.util.Scanner;


public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		// {0,0,0,0,0,0,0,...} 배열은 while문에 넣으면 계속 초기화되서 새자리 생성됨
		// 따라서 맨 위로
		Scanner sc = new Scanner(System.in); // 누적시키는 저장공간은 반복문안에X
		int sum = 0;
		final int MONEY =10000;  //★final은 변경 불가능. 이게끝이야
		//final은 상수를 나타냄, 변경 불가능! 변수명을 모두 대문자!
		while (true) { // 트루여야 와일문이 돔
			// 따라서 맨 위로 빼줌
			System.out.println("---------------------------");
			// for (int i = 0; i < args.length; i++) {
			//
			// } -->args.length가 어느 범위인지 몰라서 for문이 안돌음
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("---------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("원하는 자리 번호 입력(종료 -1)>> ");
			int no = sc.nextInt(); // 0번
			if (no == -1) {
				System.out.println("예약 시스템 종료합니다.");
		    int total = sum * MONEY;
		    System.out.println("총 결제 금액은" + total + "원 입니다");
				break;
				// System.exit(0);
			}
			if (seat[no] != 1) {
				System.out.println("");

				// 예약처리 하기 전에 이미 그 자리가 예약된 자리인지 확인해야함
				// 0번을 입력했으면 배열의인덱스 0번 자리를1로 변경해서
				// 예약되었다라는 것을 저장해두자.
				seat[no] = 1;
				System.out.println(no + "번 예약 완료.");
				sum++;
				System.out.println((sum) + "자리 예약완료");
			} else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 자리를 선택해주세요 ");
			}
			System.out.println();

		}
		sc.close(); // while로 묶으니 에러가 남 위에 시스템이 종료되었음
		// System.exit 주석으로 묶고 break;를 넣음
		
		//예약된 자리를 배열 1이 들어간 개수를 세어도 구할 수 있음.
		//지금까지 배열에 저장된 값 들중 1이 몇개인지 세어보세요 
		int count2 = 0;
//		count2 = seat[no];
//		System.out.println("1의 개수는" + count2);
		for (int i = 0; i < seat.length; i++) {
			if(seat[i]==1) {
			count2++;	
		}
		} System.out.println(count2 +"자리 예약됨");
		//2. 1로 예약된 자리가 어디인지 프린트
		String sum1 = "";
		
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				//System.out.println(i + "번 자리");
				sum1 = sum1+ i + "번";
			}
		}
		System.out.println("예약된 자리 목록:" +sum1);
		//★한번에 프린트 할수 있는 방법 
	}

}
