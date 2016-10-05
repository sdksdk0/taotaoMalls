package cn.tf.taotao.rest.service;

import java.util.List;

import cn.tf.taotao.po.TbContent;

public interface ContentService {
	
	List<TbContent>  getContentList(long contentCid);

}
