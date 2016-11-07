package cn.tf.taotao.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbAdminUser;
import cn.tf.taotao.po.TbUser;

public interface AdminService {
	
	TaotaoResult checkData(String content,Integer type);
	TaotaoResult createUser(TbAdminUser  user);
	TaotaoResult userLogin(String username,String password,HttpServletRequest  request,HttpServletResponse response);

	TaotaoResult getUserByToken(String token);
}
