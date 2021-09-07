package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;

public class ProductDAO {

	public ProductDTO read (ProductDTO bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 price는 " + bag.getPrice());
		ResultSet rs = null; //지역변수는 항상 초기화 시켜줘야한다. //set은 집합, 모음이다.
		//메서드 안에서 선언된변수는 모두 지역변수이며 지역변수는 초기화를 해주어야 한다.
		ProductDTO bag4 = new ProductDTO();   //회원Bag은 public뒤에 랑 같아야한다.
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
			String sql = "select * from product where id = ?";
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
				String name = rs.getString(2); //
				String content = rs.getString(3); //
				String price = rs.getString(4); //
				System.out.println(id+" "+ name+ " "+ content+" "+price);
				bag4.setId(id);
				bag4.setName(name);
				bag4.setContent(content);;
				bag4.setPrice(price);
				
				
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
		return bag4; // 결과값을 리턴해라 위치확인.
		
	}//read end.

	public ArrayList<ProductDTO> read () {
		
		//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어주어야 한다.
		ArrayList<ProductDTO> list = new ArrayList<>();
		ResultSet rs = null; //지역변수는 항상 초기화 시켜줘야한다. //set은 집합, 모음이다.
		//메서드 안에서 선언된변수는 모두 지역변수이며 지역변수는 초기화를 해주어야 한다.
		  //회원Bag은 public뒤에 랑 같아야한다.
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
			String sql = "select * from product ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
//			 result = ps.executeUpdate(); //CUD일 때만 사용한다.
			rs =ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색 결과는>> "+rs.next());
			while(rs.next()) {
				ProductDTO bag3 = new ProductDTO(); 
				System.out.println("검색결과가 있음.");
				bag3.setId(rs.getString(1));
				bag3.setName(rs.getString(2));
				bag3.setContent( rs.getString(3));;
				bag3.setPrice(rs.getString(4));
				System.out.println(bag3);
				list.add(bag3);
				System.out.println(list.size());
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return list; // 결과값을 리턴해라 위치확인.
		
	}//read end.
}