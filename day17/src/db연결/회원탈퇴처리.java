package db연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	
	public static void main(String[] args) throws Exception {
		
		//string sql = "delete from member where id ='apple';
		
		String id =JOptionPane.showInputDialog("아이디를 입력하세요.");
	
	
		MemberDAO db = new MemberDAO();
		db.delete(id);
	
		
		
		
	}
	
	
	
}
//db관련되나건 항상 리턴이 있어야한다.

