package cn.tf.taotao.httpClient;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.web.bind.annotation.ResponseBody;

public class HttpClientTest {
	
	/*@Test
	public void doGet() throws ClientProtocolException, IOException{
		
		//创建一个httpclient对象
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpGet get=new HttpGet("http://www.tianfang1314.cn");
		CloseableHttpResponse response = httpClient.execute(get);
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		HttpEntity entity = response.getEntity();
		String string = EntityUtils.toString(entity,"utf-8");
		System.out.println(string);
		 
		//关闭
		response.close();
		httpClient.close();
	}
	
	@Test
	public void doGetWithParam() throws  Exception {
		CloseableHttpClient httpClient=HttpClients.createDefault();
		URIBuilder  uri=new URIBuilder("http://www.sogou.com/web");
		uri.addParameter("query", "火车票");
		HttpGet get=new HttpGet(uri.build());
		
		
		CloseableHttpResponse response = httpClient.execute(get);
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		HttpEntity entity = response.getEntity();
		String string = EntityUtils.toString(entity,"utf-8");
		System.out.println(string);
		
		//关闭
		response.close();
		httpClient.close();
			
	}
	
	
	 
	@Test
	public void doPost() throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient=HttpClients.createDefault();
		//创建一个post对象
		HttpPost post=new HttpPost("http://localhost:8085/httpclient/post.action");
		
		CloseableHttpResponse response = httpClient.execute(post);
		String string = EntityUtils.toString(response.getEntity());
		System.out.println(string);
		response.close();
		httpClient.close();
	}
	
	@Test
	public void doPostWithParam() throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient=HttpClients.createDefault();
		//创建一个post对象
		HttpPost post=new HttpPost("http://localhost:8085/httpclient/post.action");
		List<NameValuePair> kvList=new ArrayList<>();
		kvList.add(new BasicNameValuePair("username", "张三"));
		kvList.add(new BasicNameValuePair("password", "123"));
		
		StringEntity entity=new UrlEncodedFormEntity(kvList);
		post.setEntity(entity);
		
		CloseableHttpResponse response = httpClient.execute(post);
		String string = EntityUtils.toString(response.getEntity());
		System.out.println(string);
		response.close();
		httpClient.close();
	}
*/
}
