package 클래스사용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 회원로그인처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id =JOptionPane.showInputDialog("아이디 입력");
		String pw =JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDB db = new MemberDB();
		db.login(id, pw);
		db.deldte(id);
		
		
	
	
	
	
	
	
	}

}
