package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//정리문제
		//랜덤한 값을 1~100
		//4*5에 넣는다.
		//전체를 프린트
		
		Random r = new Random(42);
		
		int[][] s1 = new int[4][5];
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1[i].length; j++) {
				s1[i][j]=r.nextInt(100)+1;
				System.out.print(s1[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		System.out.println("================");
		
		Random r2 = new Random(42);
		int[][] s = new int[4][];
		
		int[] m1= new int [5];
		int[] m2= new int [5];
		int[] m3= new int [5];
		int[] m4= new int [5];
		
		s[0] = m1;
		s[1] = m2;
		s[2] = m3;
		s[3] = m4;
			
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] =r2.nextInt(100)+1;
				System.out.print( s[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
