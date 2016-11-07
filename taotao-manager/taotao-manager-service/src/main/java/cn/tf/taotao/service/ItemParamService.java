package cn.tf.taotao.service;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbItemDesc;
import cn.tf.taotao.po.TbItemParam;
import cn.tf.taotao.po.TbItemParamItem;

public interface ItemParamService {
	
	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
	
	EUDResult getItemList(int page,int rows);
	
	TbItemParamItem listParamDesc(Long id);
	/*
	 * 删除
	 */
	TaotaoResult deleteParam(String ids);
	
}
