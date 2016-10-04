package cn.tf.taotao.service;

import java.util.List;

import cn.tf.taotao.common.pojo.EUTreeNode;
import cn.tf.taotao.common.utils.TaotaoResult;

public interface  ContentCategoryService {
	
	List<EUTreeNode>  getCategoryList(long parentId);
	
	TaotaoResult  insertContentCategory(long parentId,String name);

	

}
