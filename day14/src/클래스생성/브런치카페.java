package 클래스생성;

public class 브런치카페 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coffeePrice = 3500;
		int coffeeCount = 5;

		int bagelPrice = 3000;
		int bagelCount = 3;

		계산기 cal = new 계산기();
		cal.곱하기(coffeeCount, coffeePrice);
		cal.곱하기(bagelCount, bagelPrice);

		// 커피 주문하기
		cal.order("커피");

		// 베이글 주문하기
		cal.order("베이글");

		cal.더하기(1000, 2000);

		cal.나누기(55.5, 11.2);

	}

}
