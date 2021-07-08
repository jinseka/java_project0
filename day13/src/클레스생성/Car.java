package 클레스생성;

public class Car {
	//전역변수(global, 글로벌변수) <>로컬변수와의 차이 는 자동초기화가 되나 안되나 
	//전역변수는 클래스 밑에 있는 전체영역의 변수 
	//성질 :변수로 만든다. 멤버 변수
	//색 (color), 바퀴수(count)
public String color; //자동초기화 null,  string color =null;
public	int count; // 자동초기화 0 
	
	
	//동작 : 메서드로 만든다.멤버 메서드
	public void run() { //메서드
		//함수의 기능을 정의
		// 리턴 항수의 이름 
		System.out.println("네 바퀴로 달리다.");
	}	
//	   파이썬 문법
//	def run():
//		print("네 바귀로 달리다.")
//	런이라는 함수를 디파인(정의)해라
 	
	public void up() {
		System.out.println("속도를 20씩 빨라진다.");
		
	}
	
	//클래스는 멤버변수와 멤버매서드로 구성되어 있다.
	
	
	//public 이없으면 다른 패키지에서 사용을 못한다.
}
