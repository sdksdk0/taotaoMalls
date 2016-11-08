package cn.tf.taotao.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.utils.ExceptionUtil;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.rest.dao.JedisClient;
import cn.tf.taotao.rest.service.RedisService;

import redis.clients.jedis.JedisCluster;

@Service
public class RedisServiceImpl implements RedisService{
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	@Override
	public TaotaoResult syncContent(long contentCid) {
		try {
			jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid+"");
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return TaotaoResult.ok();
	}

}
