package cn.tf.taotao.search.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.tf.taotao.search.dao.SearchDao;
import cn.tf.taotao.search.pojo.Item;
import cn.tf.taotao.search.pojo.SearchResult;

//商品搜索dao
@Repository
public class SearchDaoImpl  implements  SearchDao {

	
	@Autowired 
	private SolrServer solrServer;
	
	
	@Override
	public SearchResult searchItem(SolrQuery query) throws Exception {
		
		SearchResult result=new SearchResult();
		//根据查询条件查询索引库
		QueryResponse queryResponse=solrServer.query(query);
		SolrDocumentList solrDocumentList=queryResponse.getResults();
		result.setRecordCount(solrDocumentList.getNumFound());
		List<Item> itemList=new ArrayList<>();
		
		//高亮显示
		Map<String, Map<String,List<String>>>  highlight=queryResponse.getHighlighting();
		
		for (SolrDocument solrDocument : solrDocumentList) {
			Item item=new Item();
			item.setId((String) solrDocument.get("id"));
			
			List<String>list = highlight.get(solrDocument.get("id")).get("item_title");
			String title = "";
			if (null != list&& !list.isEmpty()) {
				title = list.get(0);
			} else {
				title = (String) solrDocument.get("item_title");
			}
			item.setTitle(title);

			item.setPrice((long) solrDocument.get("item_price"));
			item.setSell_point((String) solrDocument.get("item_sell_point"));
			item.setImage((String) solrDocument.get("item_image"));
			item.setCategory_name((String) solrDocument.get("item_category_name"));
			
			itemList.add(item);

		}
		result.setItemList(itemList);
		return result;
		
	}
	
	

}
