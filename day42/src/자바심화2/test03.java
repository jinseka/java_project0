package 자바심화2;

import java.util.Scanner;
//수강신청을 진행 
//0 누르면 종료 
//과목 해당 숫자 입력시  ++하여 추가  >> 신청가능합니다 신청완료되었습니다, 문구출력
//배열을 주어서 해당 배열이 1이아니고 1이되면 수강신청 완료 그외는 이미 신청한 과목 
//다시 while으로 반복
public class test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] time = {"자바","스프링","안드로이드","파이썬","제이쿼리"};
		int[] time2 =new int[5];
		int sum = 0;
		while (true) {
			 for (int i = 0; i < 5; i++) {
				System.out.print(i+")"+time[i]+" ");
			}
			System.out.println();
			System.out.println("수강신청 하세요");
			System.out.println("과목 신청");
			System.out.println("---------------------");
			for (int i = 0; i < time2.length; i++) {
				System.out.print(time[i]+" ");
			}
			System.out.println("");
			System.out.println("---------------");
			System.out.println("원하는 과목의 번호를 입력하세요 0)자바 1)스프링 2)안드로이드 3)파이썬 4)제이쿼리 5)종료");
			int sel = sc.nextInt();
			System.out.println();
			if (sel ==5) {
				System.out.println("수강신청 종료합니다.");
				System.out.println("안녕히가세요");
				System.out.println("수강신청한 과목은 총 "+sum+" 개의 과목입니다.");
				break;
			}
			if (time2[sel] != 1) {
				time2[sel] = 1;
				System.out.println(sel + " " + time[sel]+ " 수강신청 완료");
				sum++;
				System.out.println();
				System.out.println(sum+ "과목 수강신청이 완료되었습니다.");
			}else {
				System.out.println("이미 신청한 과목입니다.");
			}
		}
		sc.close();
	}// main
}// class
