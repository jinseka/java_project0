package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//상속을 받아서 만들거다.
//JSP가 서버에서 실행될 때는 자바프로그램으로 자돟 코드 변경 되어 실행된다.
//이렇게 자동 생성되는 자바 코드를 서블릿이라고 부른다.
//Servlet : server + let(릿, 작은 프로그램) 
//JSP---> Servlet : Tomcat 내의  JSP엔진 (서블릿 엔진)

//JSP 내에 작성한 모든 자바코드는 서비스 메서드안으로 들어간다.
//JSP 에서 선언된 변수는 모두 지역변수이다. 초기화를 해주어야 한다. <% %> 스크립트릿 
//전역변수를 선언해서 사용하고자 하는 경우는 <%!  %>    <<< 전역변수 선언

public class Page01 extends HttpServlet{	
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String id = req.getParameter("id");
			//out.println("<h3>test</h3>");
			super.service(req, resp);
			
		}
	
}
