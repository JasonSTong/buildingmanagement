
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class code
 */

/*
 * 1 根据随机生成的字符串绘制图片，并输出到jsp页面
 * 
 * 使用Java的绘图技术，动态绘制一张图片，由servlet完成，通过outputStream将内容输出到客户端。
 * 
 * 2 浏览器通过img标签的src属性访问servlet以获得动态图片
 * 
 * 
 */

@WebServlet("/code")
public class code extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public code() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 创建一个空白图片
    	BufferedImage image = new BufferedImage(100,30,BufferedImage.TYPE_INT_BGR);
    	//2 获取图片画笔
    	Graphics g = image.getGraphics();
    	
    	//3 设置画笔的颜色
    	Random r = new Random();
    	g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    	
    	//4 绘制矩形背景
    	g.fillRect(0, 0, 100, 30);
    	
    	//5 输出随机验证码字符串
    	String number = getNumber(5);
    	
    	g.setColor(new Color(0,0,0));    	
    	g.setFont(new Font(null,Font.BOLD,24));
    	
    	//6 设置字体颜色之后，绘制字符串
    	g.drawString(number, 5, 25);
    	
    	// 7 绘制10干扰线
    	for(int i=0;i<10;i++){
    		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    		g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100),r.nextInt(30));
    	}
    	
    	//8 将生成的验证码发送给客户端
    	response.setContentType("image/jpeg");
    	OutputStream ops = response.getOutputStream();
    	ImageIO.write(image, "jpeg", ops);
    	
    	ops.close();
	}
    
    private String getNumber(int n)
    {
    	String str = "ABCDEFGHIJKLMNOPQRSTUVWSYZ123456789";
    	String number = "";
    	Random r = new Random();
    	for(int i=0;i<n;i++){
    		number += str.charAt(r.nextInt(str.length()));
    	}
    	
    	return number;
    	
    	
    }


}
