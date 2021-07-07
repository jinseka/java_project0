package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 730);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; // {0,0,0,0,,,}
		// 누적되는건 for문 반복문안에 만들면 안된다.
		for (int i = 0; i < 200; i++) {

			JButton b = new JButton(i + ""); // String.valueOF(0); //b버튼 누를수 있게 하기위해 b.addaction 을 넣는다.
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println(e.getActionCommand()); //버튼 눌렀을때 값을 가져온다. 누를떄마다 액션 퍼폼드가 실행된다. 액션 e에 들어간다.
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1; // s가 인덱스가 스트링이여서 에러가남 /타입에러
					JOptionPane.showMessageDialog(f, index + "번 예약됨.");

					// 버튼을 비활성화 ! 시켜야한다.
					b.setEnabled(false); // 눌렀던 버튼 비활성화 !
					b.setBackground(Color.red); // 눌렀을 경우 빨간색으로 바뀜
					// seat[s] =1; // s가 인덱스가 스트링이여서 에러가남 /타입에러
				}
			});
			f.add(b);
		}

		JButton b2 = new JButton("<<<<<< 결제하기 >>>>>>");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int count = 0;

				final int MONEY = 10000;
				String sum = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
						
					}
				}
				int payment = count * MONEY;
				JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 " + payment + " 원 입니다.");
				JOptionPane.showMessageDialog(f, "당신이 예약한 좌석번호는 " + sum + "  입니다.");
				
				// 예약된 좌석의 인덱스 값을 입력받아출력한다. sum =sum+i;

			}
		});

		b2.setBackground(Color.yellow); // 옐로라는 변수 힙영역에 생긴다. rgb값이 들어가있다.인트값이 변경되어 들어간다.소문자 대문자 상관없이 쓸수있다.
		f.add(b2);

		// 결제버튼을 누르면
		// 1번 배열안에 1이 몇개인지 세서
		// 2자리당 금액 10000원 계산후에
		// 3결제금액 알려주세요.
		// 4몇번 좌석을 입력했는지 출력

		f.setVisible(true);

	}

}
