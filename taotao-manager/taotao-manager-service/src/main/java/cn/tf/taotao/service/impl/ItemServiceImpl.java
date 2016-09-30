package cn.tf.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.mapper.TbItemMapper;
import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.po.TbItemExample;
import cn.tf.taotao.po.TbItemExample.Criteria;
import cn.tf.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper  itemMapper;
	
	
	@Override
	public TbItem getItemById(long itemId) {
		//主键查询
		//TbItem item =itemMapper.selectByPrimaryKey(itemId);
		
		//根据条件查询
		TbItemExample example=new TbItemExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(itemId);
		
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			TbItem item=list.get(0);
			return item;
		}
		
		return null;
	
	}


	
	//商品列表查询
	@Override
	public EUDResult getItemList(int page, int rows) {
			TbItemExample example=new TbItemExample();
			PageHelper.startPage(page, rows);
			List<TbItem> list = itemMapper.selectByExample(example);
	
			EUDResult result=new EUDResult();
			result.setRows(list);
			PageInfo<TbItem>  pageInfo=new PageInfo<>(list);
			result.setTotal(pageInfo.getTotal());
			return result;
	}

}
