package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import shop.dto.게시판Bag;

public class 게시판DAO {

	//메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	//             중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	//             파라메터, parameter
	public int create(게시판Bag bag) {
		//매서드 안에서 만들어진 변수임.
		//변수는 "타입 변수명;"만들어 짐.(선언!)
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라메터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
		int result =0;
		try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			//1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			
			//2. java에서 db로 연결: 
			//   연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			//3. sql문을 만든다.
			String sql = "insert into board values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");
			
			//4. sql문을 mysql로 전송한다.
			 result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		}
		return result;
	}
	//하나의 이름으로 메서드이름을 쓸 수 있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public 게시판Bag read (게시판Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
		ResultSet rs = null; //지역변수는 항상 초기화 시켜줘야한다. //set은 집합, 모음이다.
		//메서드 안에서 선언된변수는 모두 지역변수이며 지역변수는 초기화를 해주어야 한다.
		게시판Bag bag3 = new 게시판Bag();   //회원Bag은 public뒤에 랑 같아야한다.
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
//         String url = "jdbc:mysql://localhost:3306/shop";
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from board where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
//			 result = ps.executeUpdate(); //CUD일 때만 사용한다.
			rs =ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색 결과는>> "+rs.next());
			if (rs.next()) {
				System.out.println("검색결과가 있음.");
				String id = rs.getString(1); //apple, rs.getsring("id");
				String title = rs.getString(2); //
				String content = rs.getString(3); //
				String writer = rs.getString(4); //
				System.out.println(id+" "+ title+ " "+ content+" "+writer);
				bag3.setId(id);
				bag3.setTitle(title);
				bag3.setContent(content);;
				bag3.setWriter(writer);
				
				
			}else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return bag3; // 결과값을 리턴해라 위치확인.
		
	}//read end.
	public void read1() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
