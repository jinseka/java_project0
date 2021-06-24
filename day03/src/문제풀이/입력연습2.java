package 문제풀이;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
		
	String name = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
	
	String w = JOptionPane.showInputDialog("오늘의 날씨는 어떤가요?");
	
	System.out.println(name + "은 " + w );
	
	JOptionPane.showMessageDialog(null, name + "은 " +w);
	
	
	
	}

}
