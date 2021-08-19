package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) {
		//시작값 입력 , 종료값 입력 
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값은");
		int startNum =sc.nextInt();
		System.out.println("종료값은");
		int finalNum =sc.nextInt();
		
		//5로 나눴을때 나머지가 0인것만 더한다 .  
		
		//1.시작할 값 입력 , 종료할 값 입력 ,
		
		int sum=0;
		int count=0;
		String num ="";
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = startNum; i < finalNum; i++) {
			if (i%5==0) {
				sum=sum+i;
				count++;
				list.add(i);
				num += i + " , ";
			}
		}
		//2. 5의 배수만 더해서 출력
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 합은 "+ sum + "입니다.");
		//3. 5의 배수의 개수
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 개수은 "+ count + "입니다.");
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 개수은 "+ list.size() + "입니다.");
		//4. 5의 배수의 목록
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 목록은 "+ num + "입니다.");
		//5. 5의 배수의 평균
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 평균은 "+(double)+sum / list.size()+"입니다.");
		int avg =sum / count;
		System.out.println(startNum +" 과 "+ finalNum +"사이의 5의 배수 평균은 "+ avg + "입니다.");
		
		
	}//main
	
}//clss

