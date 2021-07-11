package 클래스생성;

public class TV extends Object{//틀을 만들것
 //일반적으로 부품은 메인에 넣지 않는다.
		// Class 를 만들 때는 그 부품들이 가지는 특징을 선택해서 틀을 만들게 된다.
		//특징 : 
//	1)성질(멤버변수) : 채널, 볼륨, 전원
//	2)동작(멤버메서드) : tv키다.tv끄다. 볼륨up하다.
	public int ch; // 자동초기화,전역변수
	//전역변수는 자동초기화가 된다.
	//<->지역변수는 자동초기화가 안된다.
	public int vol;
	public boolean onoff;
	
	
	
	//멤버 매서드 . 메서드 정의해야함.
	//메서드 정의할 때 고려사항
	//1.입력값이 있는가
	//2.반환값이 있는가
	public void tv켜다() {
		System.out.println("전원을 리모콘으로  on 버튼을 누르다.");
	}
	
	public void tv끄다() {
		System.out.println("전원을 리모콘으로  off 버튼을 누르다.");
		
	}
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 up시키다.");
		
		
		
		
		
		
	}
	
}
