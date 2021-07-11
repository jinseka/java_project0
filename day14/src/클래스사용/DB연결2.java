package 클래스사용;

public class DB연결2 {

	String ip = "localhost"; // 127.0.0.1 각자 ip
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "member";

	public void create() {

		System.out.println(ip + port + " 에 연결되었습니다.");
		System.out.println("회원가입 처리");

	}

	public void update() {
		System.out.println("회원정보 수정 처리");

	}

	public void read() {
		System.out.println("회원정보검색 처리");

	}

}
