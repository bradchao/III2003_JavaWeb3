package tw.brad.bradweb;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad24")
public class Brad24 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		
		String imgPath = getServletContext().getInitParameter("imgs-path");
		File imgBg = new File(imgPath, "bg.jpg");
		// Canvas => bg.jpg
		BufferedImage bimg = ImageIO.read(imgBg);
		Graphics2D g2d = bimg.createGraphics();
		
		// drawing...
		Font font = new Font(null, Font.BOLD+Font.ITALIC, 36);
		g2d.setFont(font);
		g2d.setColor(Color.BLACK);
		g2d.drawString("Hello, World", 100, 100);
		
		// Output
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		out.close();

	}

}
