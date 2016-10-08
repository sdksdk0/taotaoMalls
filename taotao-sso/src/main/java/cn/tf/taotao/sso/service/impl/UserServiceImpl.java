package cn.tf.taotao.sso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.mapper.TbUserMapper;
import cn.tf.taotao.po.TbUser;
import cn.tf.taotao.po.TbUserExample;
import cn.tf.taotao.po.TbUserExample.Criteria;
import cn.tf.taotao.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public TaotaoResult checkData(String content, Integer type) {
		
		TbUserExample example=new TbUserExample();
		Criteria criteria = example.createCriteria();
		
		//对数据进行校验
		if(1==type){
			//用户名校验
			criteria.andUsernameEqualTo(content);
		}else if(2==type){
			//电话校验
			criteria.andPhoneEqualTo(content);
		}else{
			//邮件校验
			criteria.andEmailEqualTo(content);
		}
		//执行查询
		List<TbUser> list = userMapper.selectByExample(example);
		if(list==null || list.size()==0){
			return TaotaoResult.ok(true);
		}
		return TaotaoResult.ok(false);	
	}
}
