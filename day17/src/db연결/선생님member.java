package db연결;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 선생님member {
   private static JTextField t1;
   private static JTextField t2;
   private static JTextField t3;
   private static JTextField t4;

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().setBackground(Color.YELLOW);
      f.setSize(500, 500);
      f.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("아이디");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
      lblNewLabel.setBounds(46, 41, 156, 40);
      f.getContentPane().add(lblNewLabel);
      
      t1 = new JTextField();
      t1.setForeground(Color.WHITE);
      t1.setBackground(Color.RED);
      t1.setFont(new Font("굴림", Font.BOLD, 30));
      t1.setBounds(190, 41, 229, 40);
      f.getContentPane().add(t1);
      t1.setColumns(10);
      
      JLabel lblNewLabel_1 = new JLabel("패스워드");
      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
      lblNewLabel_1.setBounds(46, 107, 156, 40);
      f.getContentPane().add(lblNewLabel_1);
      
      t2 = new JTextField();
      t2.setForeground(Color.WHITE);
      t2.setBackground(Color.RED);
      t2.setFont(new Font("굴림", Font.BOLD, 30));
      t2.setColumns(10);
      t2.setBounds(190, 107, 229, 40);
      f.getContentPane().add(t2);
      
      JLabel lblNewLabel_1_1 = new JLabel("이름");
      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
      lblNewLabel_1_1.setBounds(46, 181, 156, 40);
      f.getContentPane().add(lblNewLabel_1_1);
      
      t3 = new JTextField();
      t3.setForeground(Color.WHITE);
      t3.setBackground(Color.RED);
      t3.setFont(new Font("굴림", Font.BOLD, 30));
      t3.setColumns(10);
      t3.setBounds(190, 181, 229, 40);
      f.getContentPane().add(t3);
      
      JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
      lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
      lblNewLabel_1_1_1.setBounds(46, 251, 156, 40);
      f.getContentPane().add(lblNewLabel_1_1_1);
      
      t4 = new JTextField();
      t4.setForeground(Color.WHITE);
      t4.setBackground(Color.RED);
      t4.setFont(new Font("굴림", Font.BOLD, 30));
      t4.setColumns(10);
      t4.setBounds(190, 251, 229, 40);
      f.getContentPane().add(t4);
      
      JButton btnNewButton = new JButton("가입");
      btnNewButton.setBackground(Color.GREEN);
      btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
      btnNewButton.setBounds(38, 314, 110, 105);
      f.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("탈퇴");
      btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
      btnNewButton_1.setBackground(Color.PINK);
      btnNewButton_1.setBounds(192, 314, 110, 105);
      f.getContentPane().add(btnNewButton_1);
      
      JButton btnNewButton_1_1 = new JButton("수정");
      btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
      btnNewButton_1_1.setBackground(Color.CYAN);
      btnNewButton_1_1.setBounds(335, 314, 110, 105);
      f.getContentPane().add(btnNewButton_1_1);
      f.setVisible(true);
   }
}
