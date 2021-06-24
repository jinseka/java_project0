package 문제풀이;

public class 문제풀이4 {

	public static void main(String[] args) {
		int WaterPrice = 1000;
		int Watern = 2;
		int waterm = WaterPrice * Watern;

		int MaskPrice = 2000;
		int Maskn = 3;
		int maskm = MaskPrice * Maskn;

		int all = maskm + waterm;

		System.out.println("생수 값은 " + WaterPrice * Watern + "원 입니다.");
		System.out.println("마스크 값은 " + MaskPrice * Maskn + "원 입니다.");
		System.out.println("총 지불금액은 " + all + "원 입니다.");
	}

}
