package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
	// 자바에서 db처리 할 때는 dml중심으로 클래스를 만든다.
	// db 연결할 때는 db를 단위로 연결한다.
	// db연결하여 데이터처리를 하는 클래스를 만들 때는 테이블단위로 만든다.
	// 테이블 (entity, 개체)
	// create(insert~into values)

	public void create(String id, String pw, String name, String tell) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		String sql = "insert into member values (?,?,?,?)";

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tell);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println(result);

	} // creat end

	public void delete(String id) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		
		String sql = "delete from member where id =?"; //물음표의 번호는 1번 

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println(result);

	} // creat end

	public void update(String id,String tell) throws Exception {
		// 자바와 db연결하는 프로그램을(JBDC) 순서
		// 1.JDBC CONNECTOR설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector연결 성공!!!");
		// 2.java에서 DB로 연결 :
//		연결할 주소 URL(IP, PORT, DB명) USERNAME, PASSWORD

		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.shoes db연결 성공 ! ! !");

		// 3. sql문을 만든다.
		String sql = "update member set tell=? where id =?";

//		String sql = "delete from member where id = 'apple'";
		// PrepareStatment : sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// preparestatment 부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tell);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공  ! ! !");

		// String url ="http://www.naver.com";
//		String file ="c:/temp/test.txt";

		// 4. sql문을 mysql로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4.sql문 전송 전송");
		System.out.println(result);

	} // creat end

}
// class end
