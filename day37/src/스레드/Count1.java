package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		//i--(증감연산자)  >> i=i-1;
		//증감연산자가 마이너스가 되어야 하니간 부등호 생각 잘 해야한다.
		for (int i = 1000; i >= 0; i	= i-2 ) {
			System.out.println("count >> " +i);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 밀리세컨즈 (1/1000초)
		
		
		
		}
	}
}
