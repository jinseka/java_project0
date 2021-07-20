package mlniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class page2DAO {

	//==필요에따라 ()이부분만 수정해서 사용하면됨
	public int update(int choice) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결성공!!");
		//==필요에따라 DB명 수정해서 사용하면됨
		String url = "jdbc:mysql://localhost:3306/play";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결성공!");
		//라이언이1이면 
		if (choice==1) {
			String sql = "update vote set lion = lion + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
		else if (choice==2) {
			String sql = "update vote set wicked = wicked + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
		else {
			String sql = "update vote set turan = turan + 1";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 연결성공!!");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			System.out.println("SQL문 수행개수 " + result);
			return result;
		}
	}

	
}
