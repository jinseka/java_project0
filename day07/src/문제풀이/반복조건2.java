package 문제풀이;

public class 반복조건2 {

	public static void main(String[] args) {
//1부터 1000까지 중3 씩 점프해 더해주세요.
//만약 더한 값이 100이 넘으면 더하기를 종료.
//5의 배수는 더하지 않습니다.
		int sum = 0;
		int count =0;
		for (int i = 1; i <= 1000; i = i + 3) {

			if (sum > 100) {
				break; // for문 종료
	}		
			if (i % 5 == 0) {
				continue;//이번 횟수만 제외하고 for문은 계속 돈다.

			}
			sum = sum + i;
			count++;
		}
System.out.println(sum);
System.out.println(count);
	}

}
