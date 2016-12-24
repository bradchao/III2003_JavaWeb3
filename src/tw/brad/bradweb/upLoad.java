package tw.brad.bradweb;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class upLoad
 */
@WebServlet(
		description = "上傳", 
		urlPatterns = { "/upload" }, 
		initParams = { 
				@WebInitParam(name = "upload-path"
						, value = "/Users/hungming/Documents/workspace/JackyWeb/WebContent/upload")
		})


@MultipartConfig 

public class upLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public upLoad() {}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 response.setContentType("text/html;charset=utf-8");
		  PrintWriter out = response.getWriter();
		  Part part = request.getPart("upload");
		  String header = part.getHeader("Content-Disposition");
 		  out.println(header+"<br>");
 		  //Mac 只會抓到檔名，Windows會含路徑
		  String filename = part.getSubmittedFileName(); 
		  String type = part.getContentType();
		  String name = part.getName();
		  String myfilename = getFilename(header);
//		  out.print(filename);	
	//	  out.println(type);
 		  long size = part.getSize();

		  byte[] buf = new byte[(int)size];
 		  BufferedInputStream bin = new BufferedInputStream(part.getInputStream());
 	//	  ServletContext context = getServletContext();
// 		  String uploadPath = context.getInitParameter("upload-path");
 		 String uploadPath = getServletConfig().getInitParameter("upload-path");
 		  out.println("uploadPath"+uploadPath);
 		  FileOutputStream fout = new FileOutputStream(uploadPath+"/"+myfilename);
 		  bin.read(buf);
 		  fout.write(buf);

 		  bin.close();
     
    }

    
    private String getFilename(String body){
		int start = body.indexOf("filename=\"");
		String temp = body.substring(start+10);
		String filename = temp.substring(0, temp.indexOf("\""));
		int s = filename.lastIndexOf("\\");
		filename = filename.substring(s+1);
		
		return filename;
	}
}
