package 문제풀이;

import java.util.Scanner;

public class 문제풀이3 {

	public static void main(String[] args) {

		/*
		 * 좋아하는과일은 ? 1)사과 2)바나나 3)포도 4)키위 0)>>종료 \
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		String[] fr = { "사과 ", "바나나", "포도", "키위" };

		int[] na = new int[4];

		while (true) {
			System.out.println("----------------------");
			System.out.print("1)사과, 2)바나나, 3)포도, 4)키위, 0)종료 ");
			int sel = sc.nextInt();
			System.out.println("----------------------");
			if (sel == 0) {
				System.out.println("종료하겠습니다.");
				for (int i = 0; i < fr.length; i++) {
					System.out.println(fr[i] + "  " + na[i] + "  개 입니다.");
				}
				int total = ((na[0] * 2000 + na[1] * 2000) + (na[2] * 3000 + na[3] * 3000));
				System.out.println("사과의 가격은 " + na[0] * 2000 + "  입니다.");
				System.out.println("바나나의 가격은 " + na[1] * 2000 + "  입니다.");
				System.out.println("포도의 가격은 " + na[2] * 3000 + "  입니다.");
				System.out.println("키위의 가격은 " + na[3] * 3000 + "  입니다.");

				System.out.println("구매하는 총금액은 " + total + " 입니다.");

				break;
			}
			na[sel - 1]++;

			System.out.println(fr[sel - 1] + "입니다.");

			System.out.println("");
		}

		sc.close();

	} // class

}// main
