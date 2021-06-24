package 복습;

public class 복습1 {

	public static void main(String[] args) {
	//오늘 온도 26.2
	//어제온도  27.5
	//어제온도와 오늘온도가 동일한지 프린트
	//어제온도보다 오늘 온도가 높은지도 프린트
//	double todayTemp = 26.2;
//	double nextdaytemp = 27.5;
//	
//
//	System.out.println("어제의 온도는 "+ todayTemp +"입니다");
//	System.out.println("오늘의 온도는 "+ nextdaytemp +"입니다");
//	
//	System.out.println(todayTemp==nextdaytemp);
//	System.out.println(todayTemp>nextdaytemp);
//  string 에서 추출 char	
		
		

		
	double temp = 26.2; // 8바이트
	//double nextTemp = 27.5; 
	int classNo = 8; // 4바이트
	char day = '목';  //2바이트
	boolean food = false; // 1바이트
	String Lunch = "1층가서 생각해보자."; // 글자22바이트+ 8바이트
	// 한 줄 복사 : 컨트롤 + 알트 + 화살표 아래
	// 한 줄 이동 : 알트 + 화살표 아래
	System.out.println("오늘 온도 "+ temp + "도");
	System.out.println("오늘 수업 수 " + classNo);
	System.out.println("오늘 요일 수 " + day);
	System.out.println("오늘 아침 먹었나요 " + food);
	System.out.println("점심 어떻게 하지 ?  " + Lunch);
	System.out.println(temp == 27.5);
	System.out.println(temp > 27.5);
	//오늘온도 29.2로 변경하여, 어제의 온도보다 낮은지?
	temp=29.2;
			
	System.out.println(temp < 27.5);
	
	
	
	
	
	
	
	
	
			
	
	
	}

}
