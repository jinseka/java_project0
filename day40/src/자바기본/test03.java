package 자바기본;

import java.util.Random;

public class test03 {

	public static void main(String[] args) {
		Random r = new Random(42); //seed 값 씨앗값 
		int s =r.nextInt(100); //0 ~ 99 시작값 
		int f =r.nextInt(10)+1000; // 1000 ~ 10009 종료값 
		int sum = 0 ;
		for (int i = s; i < f; i++) {
			if (i%3==0) {
				sum += i;
			} 
		}
		System.out.println("시작값 숫자 "+ s);
		System.out.println("종료값 숫자 "+ f);
		System.out.println(sum);
	}

}
