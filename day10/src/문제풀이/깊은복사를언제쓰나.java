package 문제풀이;

public class 깊은복사를언제쓰나 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] trem1 = { 100, 88, 99, 77, 22 };
		int [] trem2 = trem1.clone();
		trem2[4] =66;
		
		System.out.println(trem2);
		
	}

}
