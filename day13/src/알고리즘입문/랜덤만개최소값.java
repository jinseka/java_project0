package 알고리즘입문;

import java.util.Arrays;
import java.util.Random;

public class 랜덤만개최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10000까지의 값을 랜덤하게 100개 만들어서
		// 최소값을 찾아보세요
		// 개수를 세어보세요
		// 위치값을 찾아보세요
		// 랜덤선언
		Random r = new Random(100);

		// 값 생성
		int[] s = new int[10000];
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000) + 1; // 랜덤값을 넣어야된다.
		}
		//
		int min = s[0];

		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];

			}

		}
		System.out.println("최소값은 " + min + " 입니다. ");

		String result = "";
		int count = 0; // 카운트는 0으로 해도 된다. //1이 몇개인가?
		for (int i = 0; i < s.length; i++) {
			if (min == s[i]) {
				count++;
				//system.out.println(i);
				result += i+" ";
//				result =result+i+" ";
//				
//				result= result+i+" ";
			}
		}
		System.out.println("최소값" + min + " 개수는 " + count + "개");
		System.out.println(result);
		
		//파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s);              //Arrays.sort(s); 파괴해서 정렬 
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
	}

}
//배열의 사용이유 
//타입 똑같고 많은양의데이터를 사용할때 
