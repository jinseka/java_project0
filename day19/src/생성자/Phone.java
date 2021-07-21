package 생성자;

public class Phone {
	String com;
	String num;
	String par;
	public Phone(String com, String num, String par) {
		super();
		this.com = com;
		this.num = num;
		this.par = par;
	}

	public String toString() {
		return "Phone [com=" + com + ", num=" + num + ", par=" + par + "]";
	}
	
//	String color;//참조형 변수는 null
//	int price;// 기본형 변수는 0
	//클래스 이름과 동일한 매서드를 생성자라고 부르고 
	//파라매터 (입력값) 없는 생성자는 기본생성자 
	//기본생성자는 자동으로 만들어진다.
	//묵시적으로 생성된다.
//	public Phone() {
//		//객체생성할때마다 무엇을 하고 싶은 경우
//		//클래이름과 동일한 이름을 가진
//		//메서드를 만들어주면 자동호출되어 
//		//객체생성할 때마다 특정한 기능을 처리하게 할 수 있다.
//		System.out.println("객체 하나 만들어짐.");
//	}

	
}
	
	
