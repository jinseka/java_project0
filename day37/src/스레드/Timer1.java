package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date(); 
			System.out.println(date); //데이트 찍어보기 

			try {
				Thread.sleep(1000); //1초단위로 만들어야 한다.
			} catch (InterruptedException e) {

				e.printStackTrace();
			} 

		}
	}
}
