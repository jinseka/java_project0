package 자바기본;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int [] jumsu = {0,0,0,0,0};
		//int [] jumsu = new int[5]; //배열은 자동 초기화 ! 
		for (int i = 0; i < 5; i++) {
			System.out.print("시험"+ (i+1) + "교시 과목의 점수는  ?");
			int num = sc.nextInt();
			
			if (num  >= 0) {
				System.out.println("시험을 보셨군요. 고생하셨습니다.");
			} else {
				System.out.println("시험을 안보셨군요. 화이팅입니다.");
			} 
			jumsu[i]= num;
			sum=sum+num;
		}
			double avg =sum/5.0;
			System.out.println("총 과목의 점수의 합은 "+ sum+ " 입니다.");
			System.out.println("평균은 "+ avg);
			System.out.println("---------------");
			for (int i = 0; i < jumsu.length; i++) {
				System.out.println((i+1)+"과목 점수는"+jumsu[i]+ "점 ");
			}
			System.out.println("----------------------");
			if (avg >=100) {
				System.out.println("1등급 입니다.");
			} else if (avg >=80) {
				System.out.println("2등급 입니다.");
			} else if (avg >=60) {
				System.out.println("3등급 입니다.");
			} else if (avg >=40) {
				System.out.println("4등급 입니다.");
			}  else if (avg >=20) {
				System.out.println("5등급 입니다.");
			} else {
				System.out.println("6등급 입니다.");
			}
			System.out.println("시험 고생하셨습니다.");
		sc.close();
		
	}

}
