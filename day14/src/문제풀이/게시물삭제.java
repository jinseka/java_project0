package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		
		String delete =JOptionPane.showInputDialog("게시물삭제");
		int delete1 =Integer.parseInt(delete);
		BbsDB bbs = new BbsDB();
		bbs.delete(delete1);
	}

}
