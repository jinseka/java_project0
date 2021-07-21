package db연결;

import javax.swing.JOptionPane;

public class 회원검색처리 {

	
	public static void main(String[] args) throws Exception {
		
		//string sql = "delete from member where id ='apple';
		
		String id =JOptionPane.showInputDialog("검색할 아이디 입력하세요.");
	
	
		MemberDAO db = new MemberDAO();
		String [] result =db.read(id);
		System.out.println("검색된 id는 "+ result[0]);
		System.out.println("검색된 pw는 "+ result[1]);
		System.out.println("검색된 name는 "+ result[2]);
		System.out.println("검색된 tel는 "+ result[3]);
//		System.out.println("검색된 는 "+ result);
		//l1.settext(result[0])
		//b1.settext(result[1])
	}
	
	
	
}
//db관련되나건 항상 리턴이 있어야한다.

