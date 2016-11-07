package cn.tf.taotao.portal.service;

import cn.tf.taotao.po.TbUser;


public interface UserService {
	
	TbUser  getUserByToken(String token);

}
