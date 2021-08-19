package 자바심화2;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----계산기----");
		System.out.println("값을 입력해보세요 >>>");
		int pac =sc.nextInt();
		int result = pac;
		for (int i = pac-1; i >0; i--) {
			System.out.println(result + " : " + i + " = " +result*i);
			result= result*i ;
			
		}
	System.out.println("결과");
	System.out.println(pac + "!=" + result + "입니다.");
	sc.close();
	}
	

}
