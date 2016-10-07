package cn.tf.taotao.rest.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;




import cn.tf.taotao.common.utils.JsonUtils;
import cn.tf.taotao.mapper.TbContentMapper;
import cn.tf.taotao.po.TbContent;
import cn.tf.taotao.po.TbContentExample;
import cn.tf.taotao.po.TbContentExample.Criteria;
import cn.tf.taotao.rest.dao.JedisClient;
import cn.tf.taotao.rest.dao.impl.JedisClientCluster;
import cn.tf.taotao.rest.service.ContentService;

@Service
public class ContentServiceImpl implements  ContentService{

	@Autowired
	private TbContentMapper  contentMapper;
	
	@Autowired
	//private JedisClientCluster jedisClientCluster;
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	

	
	@Override
	public List<TbContent> getContentList(long contentCid) {
		
	
		//从缓存中取内容
		
		try{
			//String result=jedisClientCluster.hget(INDEX_CONTENT_REDIS_KEY, contentCid+"");
			String result=jedisClient.hget(INDEX_CONTENT_REDIS_KEY, contentCid+"");
			
			if(!StringUtils.isBlank(result)){
				List<TbContent> list = JsonUtils.jsonToList(result, TbContent.class);
				return list;
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}

		
		TbContentExample example=new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		List<TbContent> list = contentMapper.selectByExample(example);
		
		
		//向缓存中添加内容
		try{
			//吧list转换为字符串
			String cacheString=JsonUtils.objectToJson(list);
			//jedisClientCluster.hset(INDEX_CONTENT_REDIS_KEY, contentCid+"", cacheString);
			jedisClient.hset(INDEX_CONTENT_REDIS_KEY, contentCid+"", cacheString);
			
		}catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}

}
