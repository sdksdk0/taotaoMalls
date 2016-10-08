package cn.tf.taotao.portal.service;

import cn.tf.taotao.portal.pojo.SearchResult;

public interface SearchService {
	
	SearchResult  search(String queryString,int page);

}
