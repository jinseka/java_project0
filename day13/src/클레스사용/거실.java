package 클레스사용;

import 클레스생성.phone;

public class 거실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone phone1 = new phone();
		phone1.color="빨간색";
		phone1.name="삼성";
		phone1.music();
		phone1.run();
		
		System.out.println(phone1.color);
		System.out.println(phone1.name);
	
		System.out.println("====================");
		dog dog1 = new dog();
		
	
		System.out.println("왈왈 짖는다");
		dog1.eat();
		System.out.println(1);
		dog1.run();

	}

}
