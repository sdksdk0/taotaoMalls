package cn.tf.taotao.controller.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	
	@Test
	public void test1() throws Exception{
		//创建一个FtpClient对象
		FTPClient  ftpClient=new FTPClient();
		//创建FTP连接
		ftpClient.connect("139.199.158.214",21);
		ftpClient.login("ftpuser", "123456");
		
		FileInputStream inputStream=new FileInputStream(new File("C:\\Users\\asus\\Pictures\\pic\\a1.jpg"));
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("hello2.jpg", inputStream);
		//关闭连接
		ftpClient.logout();
	}
	
	
	
	

}
