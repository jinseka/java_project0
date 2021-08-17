package 스레드;

public class 동시처리main2 {

	public static void main(String[] args) {
		//1.thread 객체를 생성
		AtThread thread1 = new AtThread();
		DollarThread thread2 = new DollarThread();
		PercentThread thread3 = new PercentThread();
		
		//cpu에 스레드를 등록해주어야 함.
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
		
		
		
	}

}
