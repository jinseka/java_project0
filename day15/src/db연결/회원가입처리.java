package db연결;

import javax.swing.JOptionPane;

public class 회원가입처리 {

	
	public static void main(String[] args) throws Exception {
		
		String id =JOptionPane.showInputDialog("아이디를 입력하세요.");
		String pw =JOptionPane.showInputDialog("비밀번호를 입력하세요.");
		String tel =JOptionPane.showInputDialog("핸드폰 번호를 입력하세요.");
		String name =JOptionPane.showInputDialog("이름을 입력하세요.");

	
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel);
	
		
		
		
	}
	
	
	
}
//db관련되나건 항상 리턴이 있어야한다.

