package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{
	
	
	//static 이라고 붙으면 객체생성하지 않아도 cpu가 바로 호출해서 사용할 수 있음.
	//멤버변수가 있으면 static 메서드에서 바로 사용 불가능.. 
	//전역변수에도 static을 붙여주면 객체생성하지 않아도 static메서드 안에서 접근 가능 
	//RAM에 상주하고 있어서 언제든지 CPU가 접근해서 사용 가능하다.
	//static은 많이 사용하면 안된다. 메모리 폭발한다.
	//메인화면에 static이 많이 붙으면 안좋다.
	JLabel count, image, timer;
	
	public ThreadGraphic1()  { //생성자
		setSize(800,350);
		setTitle("나의 스레드 프로그램");
 
		count = new JLabel("카운터 들어가는 부분");
		image = new JLabel("이미지 변환되는 부분");
		timer = new JLabel("타이머 들어가는 부분");
		
		add(count,BorderLayout.WEST);
		add(image);
		add(timer,BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		
		//thread객체 생성
		Count2 thread1 = new Count2();
//		Image2 thread2 = new Image2();
//		Timer2 thread3 = new Timer2();
		//cpu에 스레드를 등록해주어야 함.
		thread1.start();
//		thread2.start();
//		thread3.start();
				
		
		setVisible(true);
	}
	
	//클래스간 변수를 공유할 목적으로 클래스내에 클래스를 끼워 넣을수 있다 . 
	//내부 클래스 (inner class, 이너 클래스)
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	public class Count2 extends Thread {
		@Override
		public void run() {
			//i--(증감연산자)  >> i=i-1;
			//증감연산자가 마이너스가 되어야 하니간 부등호 생각 잘 해야한다.
			for (int i = 1000; i >= 0; i	= i-2 ) {
				count.setText("count >> " +i);
				
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 밀리세컨즈 (1/1000초)
			
			
			
			}
		}
	}
	
	public void run() {
		String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png" };
		for (int i = 0; i < list.length; i++) {
			// 보통 카운트 할 때 0부터 증가하는 식을 많이 사용한다.
		//	ImageIcon =new ImageIcon(list[i]);
			//image.setIcon(list[i]);
			//image.setText(list[i]);
			// i값이 증가하면서 값을 가져올 것이다.

			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 밀리세컨즈 (1/1000초)

		}
	}


	
	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
		
	}

}

