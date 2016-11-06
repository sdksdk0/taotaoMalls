package cn.tf.taotao;

import java.util.HashSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	
	//单机
	@Test
	public void tets1(){
		//创建一个jedis的对象
		//调用jedis对象的方法，方法名称和redis的命令一样
		Jedis jedis=new Jedis("139.199.158.214",6379);
		jedis.set("key1", "jedis test");
		String string=jedis.get("key1");
		System.out.println(string);
		jedis.close();
	}
	
	//使用连接池
	/*@Test
	public void test2(){
		//创建jedis连接池
		JedisPool pool=new JedisPool("139.199.158.214",6379);
		//从连接池中获得jedis对象
		Jedis jedis=pool.getResource();
		String string=jedis.get("key1");
		System.out.println(string);
		jedis.close();
	}*/
	
	
	//集群
	@Test
	public void tese3(){
		HashSet<HostAndPort> nodeSet=new HashSet<>();
		nodeSet.add(new HostAndPort("139.199.158.214",7001));
		nodeSet.add(new HostAndPort("139.199.158.214",7002));
		nodeSet.add(new HostAndPort("139.199.158.214",7003));
		nodeSet.add(new HostAndPort("139.199.158.214",7004));
		nodeSet.add(new HostAndPort("139.199.158.214",7005));
		nodeSet.add(new HostAndPort("139.199.158.214",7006));
		
		JedisCluster  cluster=new JedisCluster(nodeSet);
		cluster.set("key1", "1000");
		String string=cluster.get("key1");
		System.out.println(string);
		cluster.close();
			
	}
	
	
	@Test
	public void test4(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		JedisCluster jedisCluster =  (JedisCluster) applicationContext.getBean("redisClient");
		String string = jedisCluster.get("key1");
		System.out.println(string);
		jedisCluster.close();
	}
	
	

}
