package tw.brad.bradweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.net.www.content.image.png;

@WebServlet("/Brad16")
public class Brad16 extends HttpServlet {
	private PrintWriter out;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		outHTML();
		
		
		
	}
	
	private void outHTML(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			Connection conn =
					DriverManager.getConnection(
							"jdbc:mysql://127.0.0.1/iii", prop);
			System.out.println("OK");
		}catch(Exception e){
			System.out.println(e.toString());
		}

		
		out.println("<h1>Brad Big Company</h1><hr>");
		out.print("<table border='1' width='100%'>");
		out.print("<tr>");
		out.print("<th>Id.</th>");
		out.print("<th>Account</th>");
		out.print("<th>Password</th>");
		out.print("<th>RealName</th>");
		
		
		out.print("</tr>");
		
		out.print("</table>");
	}
	

}
