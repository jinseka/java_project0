package db연결;

import javax.swing.JOptionPane;

public class 회원수정처리 {

	
	public static void main(String[] args) throws Exception {
		//String sql ="update member set tel = ? whwere id =?:;
		String id =JOptionPane.showInputDialog("아이디를 입력하세요.");
	
		String tel =JOptionPane.showInputDialog("핸드폰 번호를 입력하세요.");
	
	
		MemberDB db = new MemberDB();
		db.update(id, tel);
	
		
		
		
	}
	
	
	
}
//db관련되나건 항상 리턴이 있어야한다.

