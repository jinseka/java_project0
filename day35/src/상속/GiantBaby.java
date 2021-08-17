package 상속;

public class GiantBaby extends Baby {

	
	
	boolean sleep;
	
	public void move() {
		System.out.println("움직이지 못한다.");
		
		
		
	}

	@Override
	public String toString() {
		return "GiantBaby [sleep=" + sleep + ", eat=" + eat + ", name=" + name + ", age=" + age + "]";
	}


	
	
}
