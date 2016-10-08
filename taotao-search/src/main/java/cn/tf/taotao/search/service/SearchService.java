package cn.tf.taotao.search.service;

import org.apache.solr.client.solrj.SolrQuery;

import cn.tf.taotao.search.pojo.SearchResult;

public interface SearchService {

	SearchResult  search(String queryString,int page,int rows)  throws Exception;
}
