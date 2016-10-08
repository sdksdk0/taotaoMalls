package cn.tf.taotao.rest.service;

import cn.tf.taotao.common.utils.TaotaoResult;

public interface ItemService {
	
	TaotaoResult  getItemBaseInfo(long itemId);
	TaotaoResult  getItemDesc(long itemId);
	
	TaotaoResult getItemParam(long itemId);
	
	
}
