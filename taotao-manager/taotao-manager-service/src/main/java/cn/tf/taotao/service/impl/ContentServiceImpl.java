package cn.tf.taotao.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.mapper.TbContentMapper;
import cn.tf.taotao.po.TbContent;
import cn.tf.taotao.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;
	
	@Override
	public TaotaoResult insertContent(TbContent content) {
		
		content.setCreated(new Date());
		content.setUpdated(new Date());
		contentMapper.insert(content);
		
		return TaotaoResult.ok();
	}

}
