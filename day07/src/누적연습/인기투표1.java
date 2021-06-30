package 누적연습;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		// 배고프세요? 네 , 아니요
		int yes = 0, no = 0; // 같은인트일경우 앞에 식처럼 가능

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요(배고프면1, 배안고프면2)");
			switch (reply) {
			case "1": 
				yes++;   //증감연산자
				break;
			case "2":
				no++;    //증감연산자
				break;

			default:
				JOptionPane.showMessageDialog(null, "1,2중 선택해주세요.");
				i--; //i<10번이 충족되지 않았기 때문에 i--; 가 들어간다.
				//다시 for 문으로 돌아간다.
				break;
			}
		}//for
		
		System.out.println("배고픈사람: "+yes +"명");
		System.out.println("안배고픈사람: "+no +"명");
		
	}

}
