package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu =new int [10000]; //10000의배열값
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331);
		}
		//1. 수능 만점자는 몇 명일까요?
		//2. 만점자의 번호는 몇번일까?
		int count =0;
		for (int i = 0; i < jumsu.length; i++) { //반복으로 만점자를 찾아야한다.
			if (jumsu[i] == 330 ) {				 //조건 jumsu[i]==330 이면 count++; 한다
				count++; // count = count +1;
				System.out.println("번호> "+i);
			}
		}
		System.out.println(count);
	
	}

}
