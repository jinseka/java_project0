package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요 ? ");
		try {
			//System.out.println("2. 문제 발생줄 ..  ! ! " + 10 / 0);
			FileWriter file = new FileWriter("/text.txt");
			file.write("첫번째줄\n");
			file.write("두번째줄\n");
			file.close();
		} catch (ArithmeticException e1) { //수학적 에러처리
			e1.printStackTrace();
			System.out.println("수학적 에러 발생 ");
		} catch (IOException e2) { // 쓰고읽고 에러처리
			System.out.println("파일에 쓰는 중 에러 발생 ... ! ! !");
		} catch (Exception e) {
			System.out.println("모든 에러를 처리함 ..."); //위에서 에러를 잡게되면 밑에 에러를 잡지 않는다. catch를 명시할때는 아래로 갈수록 범위가 커져야 한다.
		} finally {
			//에러에 발생 유무에 상관없이 반드시 꼭 실행해주어야 하는 부분은 여기에 넣음. 
			System.out.println("이건 못참지 꼭 실행해야지");
		}
		
		System.out.println("3. 나도 프린트 될까요 ? ");
		
	}//main

}//class
