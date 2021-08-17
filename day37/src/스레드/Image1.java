package 스레드;

public class Image1 extends Thread {
	@Override
	public void run() {
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png" };
		for (int i = 0; i < list.length; i++) {
			// 보통 카운트 할 때 0부터 증가하는 식을 많이 사용한다.
			System.out.println(list[i]);
			// i값이 증가하면서 값을 가져올 것이다.

			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 밀리세컨즈 (1/1000초)

		}
	}
}
