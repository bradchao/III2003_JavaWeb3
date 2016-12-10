package tw.brad.bradweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad19")
public class Brad20 extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
			Statement stmt = conn.createStatement();
			stmt.execute("SET NAME UTF8");
			
			
		}catch(Exception e){
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String jsonString = getJSONString(
				"http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
		if (jsonString != null){
			out.println(jsonString);
		}
	}
	
	private String getJSONString(String url){
		String ret = null;
		try{
			URL jsonURL = new URL(url);
			HttpURLConnection conn = 
					(HttpURLConnection)jsonURL.openConnection();
			conn.connect();
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(
							conn.getInputStream()));
			ret = reader.readLine();
			System.out.println(ret);
			reader.close();
		}catch(Exception ee){}
		return ret;
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
