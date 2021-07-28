package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_301");
		//jdk폴더 아래 몇 개가 있는지 프린트
		String[] list1 = file.list();
		for (String x : list1) {
			System.out.println(x);
		}
		File[] list2 = file.listFiles();
		for (File f : list2) {
			System.out.println(f);
			System.out.println(f.isDirectory());
		}
		System.out.println(list2.length + "개");
		//무엇이 있는지 프린트해보고, 폴더인지/파일인지 프린트
		
		
	}//메인

}//클래스
