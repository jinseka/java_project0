package 상속;

public class Baby extends Person {
	String eat;
	
	public void cry() {
		System.out.println("아기는 계속 운다. 끈임없이 운다.");
		
		
		
	}

	@Override
	public String toString() {
		return "Baby [eat=" + eat + ", name=" + name + ", age=" + age + "]";
	}
}
