package com.mega.mvc10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBCPTest1 {

	public static void main(String[] args) {
		
		DBConnectionMgr dbcp = DBConnectionMgr.getInstance();
		try {
			// 1,2를 해준다. = 드라이버설정, db연결까지 dbcp가 다 해준다.
			Connection con = dbcp.getConnection();
			
			// dbcp에서 연결해놓은 것 중 하나의 연결을 꺼내와서 3,4단계를 구현하면 됨.
			String sql = "insert into member values ('sun','sun','sun','sun')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
			// 10개 중에서 하나 꺼내썻던 con(주소)를 다시 되돌려 줌.
			dbcp.freeConnection(con, ps);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}