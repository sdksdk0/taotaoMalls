package cn.tf.taotao;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrJTest {
	
	/*@Test
	public void addDocument() throws SolrServerException, IOException{
		
		//创建一个连接
		SolrServer solrServer=new HttpSolrServer("http://115.28.16.234:8090/solr");
		//创建一个文档对象
		SolrInputDocument  document=new SolrInputDocument();
		document.addField("id", "test001");
		document.addField("item_title", "测试商品");
		document.addField("item_price", 12345);
		//把文档写入索引库
		solrServer.add(document);
		
		//提交
		solrServer.commit();
		
		
	}
	
	@Test
	public void delete() throws SolrServerException, IOException{
		SolrServer solrServer=new HttpSolrServer("http://115.28.16.234:8090/solr");
		solrServer.deleteById("test001");
		solrServer.commit();
	}
	
	@Test
	public void queryDocument() throws SolrServerException {
		SolrServer solrServer=new HttpSolrServer("http://115.28.16.234:8090/solr");
		SolrQuery query=new SolrQuery();
		query.setQuery("*:*");
		
		query.setStart(20);
		query.setRows(50);
		
		QueryResponse response=solrServer.query(query);
		SolrDocumentList solrDocumentList=response.getResults();
		
		System.out.println("共查询到记录数:"+solrDocumentList.getNumFound());
		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("item_title"));
			System.out.println(solrDocument.get("item_price"));
		}
		
		
		
	}
	
	*/

}
