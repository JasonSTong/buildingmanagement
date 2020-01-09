
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
 * 1 ����������ɵ��ַ�������ͼƬ���������jspҳ��
 * 
 * ʹ��Java�Ļ�ͼ��������̬����һ��ͼƬ����servlet��ɣ�ͨ��outputStream������������ͻ��ˡ�
 * 
 * 2 �����ͨ��img��ǩ��src���Է���servlet�Ի�ö�̬ͼƬ
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
		//1 ����һ���հ�ͼƬ
    	BufferedImage image = new BufferedImage(100,30,BufferedImage.TYPE_INT_BGR);
    	//2 ��ȡͼƬ����
    	Graphics g = image.getGraphics();
    	
    	//3 ���û��ʵ���ɫ
    	Random r = new Random();
    	g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    	
    	//4 ���ƾ��α���
    	g.fillRect(0, 0, 100, 30);
    	
    	//5 ��������֤���ַ���
    	String number = getNumber(5);
    	
    	g.setColor(new Color(0,0,0));    	
    	g.setFont(new Font(null,Font.BOLD,24));
    	
    	//6 ����������ɫ֮�󣬻����ַ���
    	g.drawString(number, 5, 25);
    	
    	// 7 ����10������
    	for(int i=0;i<10;i++){
    		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
    		g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100),r.nextInt(30));
    	}
    	
    	//8 �����ɵ���֤�뷢�͸��ͻ���
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
