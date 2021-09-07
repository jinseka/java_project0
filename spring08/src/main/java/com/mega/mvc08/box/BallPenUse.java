package com.mega.mvc08.box;

public class BallPenUse {

	public static void main(String[] args) {
		
		BallPen p1 = new BallPen();
		p1.company = "monami";
		p1.price = 50000;
		p1.size = 20;
		
		p1.buy();
		p1.write();
		
		System.out.println(p1);
	}

}
