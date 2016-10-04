package cn.tf.taotao.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.pojo.EUTreeNode;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.mapper.TbContentCategoryMapper;
import cn.tf.taotao.po.TbContentCategory;
import cn.tf.taotao.po.TbContentCategoryExample;
import cn.tf.taotao.po.TbContentCategoryExample.Criteria;
import cn.tf.taotao.service.ContentCategoryService;

@Service
public class ContentCategoryServiceImpl implements  ContentCategoryService{

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;
	
	
	@Override
	public List<EUTreeNode> getCategoryList(long parentId) {
		TbContentCategoryExample example=new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//根据parentid查询节点列表
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<EUTreeNode> resultList=new ArrayList<>();
		
		for (TbContentCategory tbContentCategory : list) {
			EUTreeNode node=new EUTreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		return resultList;
	}


	@Override
	public TaotaoResult insertContentCategory(long parentId, String name) {
		
		TbContentCategory  contentCategory=new TbContentCategory();
		contentCategory.setName(name);
		contentCategory.setIsParent(false);
		contentCategory.setStatus(1);  //1是正常，2是删除
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		contentCategoryMapper.insert(contentCategory);
		//查看父节点的isParent列是否为true
		TbContentCategory parentCat = contentCategoryMapper.selectByPrimaryKey(parentId);
		//判断是否为true
		if(!parentCat.getIsParent()){
			parentCat.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(parentCat);
		}
		return TaotaoResult.ok(contentCategory);
	}

}
