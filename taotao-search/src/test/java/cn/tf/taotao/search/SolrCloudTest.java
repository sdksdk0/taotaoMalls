package cn.tf.taotao.search;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrCloudTest {
	
	@Test
	public void test1() throws SolrServerException, IOException{
		//创建一个连接，和solr集群的,参数就是zookeeper的地址列表，
		String zkHost="139.199.158.214:2181,139.199.158.214:2182,139.199.158.214:2183";
		CloudSolrServer   solrServer=new CloudSolrServer(zkHost);
		//设置默认的collection2
		solrServer.setDefaultCollection("collection2");
		//创建一个文档对象
		SolrInputDocument  document=new SolrInputDocument();
		
		//向文档中添加域
		document.addField("id", "test001");
		document.addField("item_title", "测试测试");

		//把文档添加到索引库
		solrServer.add(document);
		solrServer.commit();
		
	}
	
	
	//测试删除功能
	@Test
	public void test2() throws SolrServerException, IOException{
		//创建一个连接，和solr集群的,参数就是zookeeper的地址列表，
		String zkHost="139.199.158.214:2181,139.199.158.214:2182,139.199.158.214:2183";
		CloudSolrServer   solrServer=new CloudSolrServer(zkHost);
		//设置默认的collection2
		solrServer.setDefaultCollection("collection2");
		
		solrServer.deleteById("test001");
		solrServer.commit();
		
	}
	
	

}
