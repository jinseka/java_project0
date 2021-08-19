package 자바심화2;


//210819 문제
//1~100숫자 중에 3의 배수만 더해서 출력하는 코드



public class test02 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if (i%3==0) {
				sum+=i;
				
			} 
			
		}
		System.out.println(sum);
		
		
		
	}//main
}//class
