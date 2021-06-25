package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		while (true) { //무한루프
			System.out.println("나는계속돌아요");
			String q = JOptionPane.showInputDialog("중단하실래요x");
			if (q.equals("x")) {
				//break;
			  System.exit(0);
				
			  
			}
		}

		// 반복문은 무한적으로 하던가 유한적인 반복이 있다.
		// wile은 유한적

	}

}
