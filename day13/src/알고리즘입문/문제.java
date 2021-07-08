package 알고리즘입문;

import java.util.ArrayList;
import java.util.HashSet;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.동계 올림픽 피겨순위
		// 1위 김연아
		// 2위 김영아
		// 3위 김양아
		// 4위 김용아
		// 4위가 반칙을 하여 탈락함.
		// 전체 명단을 다시 프린트
		// 2.아침에 가방에 넣은 물건들.가방이 무거워지면 안되니까하나씩만 넣으려고함.
		// 내 가방은 같은 물건이 하나이상 들어가지 않음.
		// 실제로 내가 ㄴ허은것 : 휴지 ,휴대폰,볼펜,휴지
		// 내 가방에 들어간 물건의 개수와 물건들을 쓰시오.

		// 1번 문제
		ArrayList list = new ArrayList();
		list.add("김연아");
		list.add("김영아");
		list.add("김양아");
		list.add("김용아");

		for (int i = 0; i < list.size(); i++) { // list.size();리스트에 들어있는 원소 수 !, args.lenhth 는 배열의 수
			System.out.println((i + 1) + ": 위 " + list.get(i));
		}
		System.out.println("===============");
		// 1-1문제
		list.remove(3);							

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ": 위 " + list.get(i));
		}

		System.out.println("===============");
		// 2번문제
		HashSet ad = new HashSet(); // 중복된 값을 표시하지 않는다.
		ad.add("휴지");
		ad.add("휴대폰");
		ad.add("볼펜");
		ad.add("휴지");

		System.out.println("내 가방에 들어간 물건은 " + ad + " 입니다.");
		System.out.println("내 가방에 들어간 물건의 개수는 " + ad.size() + " 입니다.");

	}

}
