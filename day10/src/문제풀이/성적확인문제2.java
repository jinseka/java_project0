package 문제풀이;

public class 성적확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sub = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] trem1 = { 44, 66, 22, 99, 100 };
		int [] trem3 = trem1.clone();
//		int[] trem2 = { 22, 66, 88, 99, 100 };
		trem3[0] = 22;
		trem3[2] = 88;
		System.out.println("전체 1학기 ,    2학기 성적");
		int count1 = 0;
		System.out.println();
		for (int i = 0; i < trem1.length; i++) {
			System.out.println("     " + trem1[i] + "       " + trem3[i]);

		}
		int count2 = 0;
		for (int i = 0; i < trem3.length; i++) {
			if (trem1[i] == trem3[i]) {
				count2++;

			}
		}
		System.out.println("동일한과목수는 : " + count2);
		int count3 = 0;
		for (int i = 0; i < trem3.length; i++) {
			if (trem1[i] < trem3[i]) {
				count3++;

			}
		}

		System.out.println("성적이 오른 과목수는 : " + count3);
		int count4 = 0;

		int location = -1;
		for (int i = 0; i < trem3.length; i++) {
			if (trem1[i] < trem3[i]) {
				count4++;
				location = i;

			}
		}
		if (location != -1) {
			System.out.println("성적이 오른과목은 : " + sub[location]);

		} else {
			System.out.println("동일한 과목이 없습니다.");

		}

	}

}
