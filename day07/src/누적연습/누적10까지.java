package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		//1 -10 까지 더해 봅시다.
		int sum = 0 ; // 변수의 초기값  int같은 경우 0으로 초기값을 설정을 많이 한다. etc:최고값을 찾을 때 
		for (int i = 1; i <= 10000; i++) {
			//1 +2+3+...
			//for 문안에반복시키는것을 넣지 않는다. 초기화 된다.
			sum = sum + i; // 1 = 0 + 1 
						   // 3 = 1 + 2
						   // 6 = 3 + 3
		} //  <<< 안에 넣을경우 모든 값이 나오게 된다.
		System.out.println(sum); 
		
		
	}

}
