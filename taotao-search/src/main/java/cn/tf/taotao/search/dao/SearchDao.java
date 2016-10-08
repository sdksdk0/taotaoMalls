package cn.tf.taotao.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import cn.tf.taotao.search.pojo.SearchResult;

public interface SearchDao {
	
	SearchResult searchItem(SolrQuery solrQuery) throws Exception;


}
