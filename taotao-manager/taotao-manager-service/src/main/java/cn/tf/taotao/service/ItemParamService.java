package cn.tf.taotao.service;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbItemDesc;
import cn.tf.taotao.po.TbItemParam;

public interface ItemParamService {
	
	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
	
	EUDResult getItemList(int page,int rows);
	
	TbItemParam listParamDesc(Long id);
	
}
