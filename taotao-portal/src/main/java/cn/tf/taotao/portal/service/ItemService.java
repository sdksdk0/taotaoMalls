package cn.tf.taotao.portal.service;


import cn.tf.taotao.portal.pojo.ItemInfo;

public interface ItemService {
	ItemInfo  getItemById(long itemId);
	
	String getItemDescById(long itemId);
	
	String getItemParam(long itemId);

}
