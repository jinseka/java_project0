package 자바기본;

import java.util.Random;

public class test04 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int s=r.nextInt(1000);
		int f=r.nextInt(1000)+1000;
		int sum= 0;
		for (int i = s; i < f; i++) {
			sum += i;
		}
		System.out.println("시작값"+s);
		System.out.println("종료값"+f);
		System.out.println(s+"부터"+f + "까지의 합"+sum);
		
	}
}

