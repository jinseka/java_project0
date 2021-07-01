package 배열생성;

public class 연습문제2 {

	public static void main(String[] args) {
		int evenSum =0 ;
		int oddSum =0 ;
		for (int i = 1; i <=100; i++) {
			{if (i%2 == 0) {
				evenSum = evenSum+i;
				
			} else {
				oddSum=oddSum+i;

			}
				
			}
		
			
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
	
	

}
