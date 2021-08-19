package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Random r = new Random();
//		int q= r.nextInt(4);
//		System.out.println(q);
//		if (q==0) {
//			System.out.println("추천 여행지는 서울입니다.");
//		} else if (q==1) {
//			System.out.println("추천 여행지는 제주도입니다.");
//		} else if (q==2) {
//			System.out.println("추천 여행지는 강원도입니다.");
//		}
		int [] w = {0,0,0};
		int w2 = r.nextInt(3);
		System.out.println(w2);
		if (w2==0) {
			System.out.println("추천 여행지는 서울입니다.");
		} else if (w2==1) {
			System.out.println("추천 여행지는 제주도입니다.");
		} else if (w2==2) {
			System.out.println("추천 여행지는 강원도입니다.");
		}

		System.out.println("이번 휴가 여행지를 선택하세요");
		System.out.println("-----------------------------");
		
		System.out.println("1)서울 2)제주 3)강원도 ");
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 여행지 번호를 입력하세요 >> ");
		int a = sc.nextInt();
		if (a==1) {
			System.out.println("서울로 휴가를 가시는군요");
		} else if (a==2) {
			System.out.println("제주로 휴가를 가시는군요");
			
		} else if (a==3){
			System.out.println("강원도로 휴가를 가시는군요");
		}else {
			System.out.println("휴가를 안가시는군요" );
			return;
		}
		
		System.out.println("몇명이서 놀러가시나요 ?");
		int n =sc.nextInt();
		if (n==1) {
			System.out.println("혼자 휴가를 가시는군요");
		} else if (n==2) {
			System.out.println("두명이서 휴가를 가시는군요");
		} else if (n==3){
			System.out.println("3명이서 휴가를 가시는군요");
		}else {
			System.out.println("4인이상 집합 금지입니다.");
			return;
		}
		System.out.println("두사람의 예상경비는 얼마인가요 ? ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int total = n1+n2;
		System.out.println("총 금액은 "+total+ "입니다." );
		int avg = total/2;
		System.out.println("예상경비의 평균은 "+avg+"입니다.");
		if (avg>=100000) {
			System.out.println("추천 예행지는 제주도 입니다.");
		} else if (avg>=50000) {
			System.out.println("추천 예행지는 서울 입니다.");
		} else {
			System.out.println("추천 예행지는 강원도 입니다.");
		}
	sc.close();
	return;
	}
	
	

}
