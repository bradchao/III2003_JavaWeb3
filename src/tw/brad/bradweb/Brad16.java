package tw.brad.bradweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad16")
public class Brad16 extends HttpServlet {
	private PrintWriter out;
	private Connection conn = null;
	
	@Override
	public void init() throws ServletException {
		super.init();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			prop.setProperty("user", "root");
			prop.setProperty("password", "root");
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/iii", prop);
		}catch(Exception e){
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		outHTML(queryData());
		
		
		
	}
	
	private ArrayList<HashMap<String,String>> queryData(){
		ArrayList<HashMap<String,String>> data = new ArrayList<>();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM member");
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				HashMap<String,String> row = new HashMap<>();
				row.put("id", rs.getString("id"));
				row.put("account", rs.getString("account"));
				row.put("passwd", rs.getString("passwd"));
				row.put("realname", rs.getString("realname"));
				data.add(row);
			}
			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		return data;
	}
	
	private void outHTML(ArrayList<HashMap<String,String>> data){
		
		out.println("<h1>Brad Big Company</h1><hr>");
		out.print("<table border='1' width='100%'>");
		out.print("<tr>");
		out.print("<th>Id.</th>");
		out.print("<th>Account</th>");
		out.print("<th>Password</th>");
		out.print("<th>RealName</th>");
		out.print("</tr>");
		
		for (HashMap<String,String> row : data){
			out.print("<tr>");
			out.print(String.format("<td>%s</td>",row.get("id")));
			out.print(String.format("<td>%s</td>",row.get("account")));
			out.print(String.format("<td>%s</td>",row.get("passwd")));
			out.print(String.format("<td>%s</td>",row.get("realname")));
			out.print("</tr>");
		}
		out.print("</table>");
	}
	

}
