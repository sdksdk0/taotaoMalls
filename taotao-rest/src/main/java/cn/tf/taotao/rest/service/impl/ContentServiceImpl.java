package cn.tf.taotao.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.mapper.TbContentMapper;
import cn.tf.taotao.po.TbContent;
import cn.tf.taotao.po.TbContentExample;
import cn.tf.taotao.po.TbContentExample.Criteria;
import cn.tf.taotao.rest.service.ContentService;

@Service
public class ContentServiceImpl implements  ContentService{

	@Autowired
	private TbContentMapper  contentMapper;
	
	
	@Override
	public List<TbContent> getContentList(long contentCid) {
		
		TbContentExample example=new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		List<TbContent> list = contentMapper.selectByExample(example);
		return list;
	}

}
