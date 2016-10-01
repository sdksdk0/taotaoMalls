package cn.tf.taotao.service;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbItem;

public interface  ItemService {
	TbItem getItemById(long itemId);

	EUDResult getItemList(int page,int rows);
	
	TaotaoResult createItem(TbItem item);
}
