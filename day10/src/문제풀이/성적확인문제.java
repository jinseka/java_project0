package 문제풀이;

import java.util.Scanner;

public class 성적확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] subject = {"컴퓨터","국어","수학","영어","체육"};
		
		int []term1 = {77,88,99,55,70};
		int []term2 = {99,100,88,80,80};

		
		//1. 성적이 2학기 향상된 과목의 수를 카운트 해보세요.
		int count1 =0; // 
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]<term2[i]) {
				count1++;
				
			}
		}
		
		System.out.println(count1);
		
		//2. 성적이 1,2학기 동일한 과목의 수를 카운트 해보세요.
		int count2 =0; // 
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]==term2[i]) {
				count2++;
				
			}
		}
		
		System.out.println(count2);

		//3. 성적이 1,2학기 동일한 과목명을 프린트해보세요.
		
		int count3 =0; // 
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]==term2[i]) {
				count3++;
				location = i;
				
			}
		}
		if (location!=-1) {
			System.out.println(subject[location]);
			
		}else {
			System.out.println("동일한 과목이 없습니다.");
			
		}
		//없으면 0이찍힌다.
		//1개만 가능하다.
		
		
		//term1 점수와 term2의 배열값을 가져와 비교한다.
		//두 배열의 성적값은 비교해 같으면 카운트 
		//비교해서 성적이 같은 값을 프린트
		
		
	
	
	}

}
