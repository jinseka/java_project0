package 자바심화2;

import java.util.Random;

//주민번호가 DB에 있다는 가정
//주민번호 뒷자리 랜덤 100명 돌려서
//뒷자리 첫번째 숫자가 1또는 3이면 남자, 2또는 4이면 여자
//뒷자리 두번째 숫자가 1= 서울 / 2=부산 /3 = 제주 / 나머지 = 기타지역
//출력 
//서울지역 몇명 중 남자는 몇명, 여자는 몇명입니다.
//부산지역 몇명 중 남자는 몇명, 여자는 몇명입니다.
//제주지역 몇명 중 남자는 몇명, 여자는 몇명입니다.
//기타지역 몇명 중 남자는 몇명, 여자는 몇명입니다.

// 뒷자리가 랜덤이다 .
//조건문 1or3 , 2or4   -> 뒷자리 첫번째
//2중 조건 1,2,3, 나머지 -> 뒷자리 두번째
public class test05 {
	public static int[][] main(String[] args) {
		Random r = new Random();
		int count = 0;
		String[] ssnlist = new String[count];
		for (int i = 0; i < ssnlist.length; i++) {
			ssnlist[i] = String.valueOf(r.nextInt(4000000) + 1000000);
		}
		int[][] areaGenger = new int[4][2];
		for (int i = 0; i < ssnlist.length; i++) {
			String ssn = ssnlist[i];

			if (ssn.charAt(1) == '1') {
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGenger[0][0]++;
				} else {
					areaGenger[0][1]++;

				}
			} else if (ssn.charAt(1) == '2') {
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGenger[1][0]++;
				} else {
					areaGenger[1][1]++;
				}
				
			}else if (ssn.charAt(1) == '3') {
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGenger[2][0]++;
				} else {
					areaGenger[2][1]++;
				}
				
			}else {
				if (ssn.charAt(0)=='1' || ssn.charAt(0)=='3') {
					areaGenger[3][0]++;
				} else {
					areaGenger[3][1]++;
			
				}
			}
		
		}
			return areaGenger;
			
		

	}// main
}// class



