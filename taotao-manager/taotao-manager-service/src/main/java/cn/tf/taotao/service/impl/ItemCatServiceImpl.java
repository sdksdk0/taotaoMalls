package cn.tf.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.pojo.EUTreeNode;
import cn.tf.taotao.mapper.TbItemCatMapper;
import cn.tf.taotao.po.TbItemCat;
import cn.tf.taotao.po.TbItemCatExample;
import cn.tf.taotao.po.TbItemCatExample.Criteria;
import cn.tf.taotao.po.TbItemExample;
import cn.tf.taotao.service.ItemCatService;


@Service
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private TbItemCatMapper  itemCatMapper;
	
	
	@Override
	public List<EUTreeNode> getCatList(long parentId) {
		TbItemCatExample  example=new TbItemCatExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andParentIdEqualTo(parentId);
		//根据条件查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		List<EUTreeNode>  resultList=new ArrayList<>();
		//把列表转换为treenodelist
		for (TbItemCat tbItemCat : list) {
			EUTreeNode node=new EUTreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
		
	}


}
