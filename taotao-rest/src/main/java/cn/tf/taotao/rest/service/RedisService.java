package cn.tf.taotao.rest.service;

import cn.tf.taotao.common.utils.TaotaoResult;

public interface RedisService {
	//
	TaotaoResult syncContent(long contentCid);

}
