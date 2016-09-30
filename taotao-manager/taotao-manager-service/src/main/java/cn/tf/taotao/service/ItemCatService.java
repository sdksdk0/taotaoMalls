package cn.tf.taotao.service;

import java.util.List;

import cn.tf.taotao.common.pojo.EUTreeNode;

public interface ItemCatService {
	
	List<EUTreeNode>  getCatList(long parentId);

}
