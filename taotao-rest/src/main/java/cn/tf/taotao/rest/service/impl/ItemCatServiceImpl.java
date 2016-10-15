package cn.tf.taotao.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.utils.JsonUtils;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.mapper.TbItemCatMapper;
import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.po.TbItemCat;
import cn.tf.taotao.po.TbItemCatExample;
import cn.tf.taotao.po.TbItemCatExample.Criteria;
import cn.tf.taotao.rest.dao.JedisClient;
import cn.tf.taotao.rest.pojo.CatNode;
import cn.tf.taotao.rest.pojo.CatResult;
import cn.tf.taotao.rest.service.ItemCatService;

//商品分类服务
@Service
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private TbItemCatMapper  itemCatMapper;
	
	
	@Autowired
	private JedisClient jedisClient;
	
	//分类列表
	@Value("${REDIS_CAT_ITEM1}")
	private String REDIS_CAT_ITEM1;
	
	
	@Value("${REDIS_CAT_ITEM2")
	private String REDIS_CAT_ITEM2;
	
	
	//过期时间设置
	@Value("${REDIS_ITEM_EXPIRE}")
	private Integer REDIS_ITEM_EXPIRE;
	
	@Override
	public CatResult getItemCatList() {
		CatResult catResult=new CatResult();
		//查询分类列表
		catResult.setData(getCatList(0));
		return catResult;
	}

	//查询分类列表的方法
	private List<?> getCatList(long parentId){
		
		TbItemCatExample example=new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		

		
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		//返回值list
		List resultList=new ArrayList<>();
		
		int count=0;
		for (TbItemCat tbItemCat : list) {
			//判断是否为叶子节点
			if(tbItemCat.getIsParent()){
				
				CatNode  catNode=new CatNode();
				if(parentId==0){
					catNode.setName("<a href='/products/"+tbItemCat.getId()+".html'>"+tbItemCat.getName()+"</a>");
				}else{
					catNode.setName(tbItemCat.getName());
				}
				catNode.setUrl("/products/"+tbItemCat.getId()+".html");
				catNode.setItem(getCatList(tbItemCat.getId()));
				resultList.add(catNode);
				
				count++;
				if(parentId==0 && count>=14){
					break;
				}
		
			}else{
				//叶子节点
				resultList.add("/products/"+tbItemCat.getId()+".html|"+tbItemCat.getName());
			}
		}

		return resultList;
	}
}
