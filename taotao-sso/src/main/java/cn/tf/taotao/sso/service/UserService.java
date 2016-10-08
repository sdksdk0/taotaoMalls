package cn.tf.taotao.sso.service;

import cn.tf.taotao.common.utils.TaotaoResult;

public interface UserService {
	
	TaotaoResult checkData(String content,Integer type);

}
