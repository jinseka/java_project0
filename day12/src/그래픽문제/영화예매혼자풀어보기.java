package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매혼자풀어보기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();								//프레임 생성
		f.setSize(560, 750);									//프레임 F의 크기 설정 가로700,세로 700
		FlowLayout flow = new FlowLayout();						//생성된 프레임을 순서대로 만들어준다.
		f.setLayout(flow);										//
		int[] seat = new int[200];								//정수 배열 200개 생성

		for (int i = 0; i < seat.length; i++) {					//예약시스템 만들기 만들어진 버튼에 번호와 기능을 넣기위해 for문을 사용한다.
			JButton b = new JButton(i+"");                      //버튼을 만들고 i+"" 텍스트를 붙혀준다.
			b.addActionListener(new ActionListener() {			//버튼을 눌렇을때 액션을 넣기위해 사용한다.

				@Override
				public void actionPerformed(ActionEvent e) {	//버튼을 눌렀을때 기능을 넣는다.
					String s = e.getActionCommand();			//버튼을 눌렀을때 기능을 스트링 으로 받아온다.
					int index = Integer.parseInt(s);			//스트링으로 받아온 기능을 정수로 변환한다. 
					seat[index] = 1;							//버튼을 눌렀을때 seat의 인덱스를 1로 변환한다.
					JOptionPane.showMessageDialog(b, index + "번 예약되었습니다.");	//버튼을 눌렀을때 메세지를 생성한다.
					b.setEnabled(false);										//기능이 활성화된후 비활성화 시킨다.
					
					b.setBackground(Color.white);                              //버튼을 눌렀을때 배경을 하얀색으로 변하게 한다.

				}
			});
			f.add(b);														//버튼 추가

		}
		JButton b2 = new JButton("결제");									//결제하기 버튼을 만든다.
		b2.addActionListener(new ActionListener() {						//버튼의 액션을 넣기위해 사용한다.

			@Override
			public void actionPerformed(ActionEvent e) {				//버튼을 눌렀을때 기능을넣는다.
				int count = 0;											//count의 초기값 설정
				int money = 10000;										//money 값 설정
				String sum = "";										//???
				for (int i = 0; i < seat.length; i++) {					//결제시스템버튼의 기능을 넣는다.
					if (seat[i] == 1) {									//seat[i]=1 이되면
						count++;										//예약된 자리 누적 
						sum = sum+i + "번";							//예약된 자리 표시

					}
				}
				
				money=12000;											//추후 가격 변경 final int를 사용하지 않아서 가능
				int don = money * count;								//money * count 금액*자리수 =don
				JOptionPane.showMessageDialog(b2, " 예약된 자리는" + sum + " 입니다."); //값 출력
				JOptionPane.showMessageDialog(b2, " 총 금액은 " + don + " 입니다.");	  //값 출력
			
			}
		});

		f.add(b2);	 //b2버튼 추가

		f.setVisible(true);   //만들어진 프레임 보이게 하기
		// getsource(); 가 주소를 가져온다.
		//객체지향 주소가 생명이다 . cpu 에서 사용하려면 주소를 알고있어야한다.
		 

	}

}
