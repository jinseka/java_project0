package 문제풀이;

import javax.swing.JOptionPane;

public class 게시물등록 {

	public static void main(String[] args) {
	
		String write =JOptionPane.showInputDialog("게시물작성");
		BbsDB bbs = new BbsDB();
		bbs.create(write);
	}

}
