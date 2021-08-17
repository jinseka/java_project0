package 스레드;
import java.lang.*; //목시적 import
//자바에서 기본적으로 많이 사용되는 것은 임포트 안써줘도 된다. 이미 임포트가 되어있다 . 

//1.Thread class를 상속받는 방법
public class 동시1 extends Thread{
	//run메서드를 오버라이드해서 구현해주면 , run메서드 내의 구현 부분이 동시에 처리가 된다.
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시1>> "  + i );
				}
			}
		}
