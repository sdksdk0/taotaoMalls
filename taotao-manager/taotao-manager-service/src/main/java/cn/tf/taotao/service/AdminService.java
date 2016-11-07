package cn.tf.taotao.service;

import cn.tf.taotao.po.TbAdminUser;


public interface AdminService {
	
	TbAdminUser  getUserByToken(String token);

}
