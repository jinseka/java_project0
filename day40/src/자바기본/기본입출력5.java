package 자바기본;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 기본입출력5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int [] jumsu = {0,0,0,0,0};
		//int [] jumsu = new int[5]; //배열은 자동 초기화 ! 

		//횟수를 정하고 반복하고자 하는 경우에는 카운트 초기값이 있어야 한다.
		//반복할 조건, 증가값 
		int i2 =0 ; //카운트 초기값
		while (true) { // 반복할 조건 
			System.out.print("오늘 온도는 몇도인가요 ?");
			int temp = sc.nextInt();
		
			if (temp >= 30) {
				System.out.println("너무 더워요 ! ");
			} else {
				System.out.println("괜찮아요 !  ");
			} 
			jumsu[i2]= temp;
			sum=sum+temp; //sum = sum+ temp;
			i2++ ; // 증가값
			if(i2==5) {
				break; 
				//while 무한루프일때 끝나는 조욜시점을 명시해 주어야 한다.
			}
		}
			double avg =sum / 5.0; 
			System.out.println("평균은 "+ avg);
			System.out.println("---------------");
			for (int i = 0; i < jumsu.length; i++) {
				System.out.print(jumsu[i]+ " ");
			}
		sc.close();
		
	}

}
