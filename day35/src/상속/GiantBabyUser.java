package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
		GiantBaby baby = new GiantBaby();
		baby.think();
		baby.cry();
		baby.move();

		baby.sleep=true;
		baby.age=2;
		baby.eat="끈임없이 먹는다.";
		baby.name="아가";
		
		System.out.println(baby);
		
		
		
	}

}
