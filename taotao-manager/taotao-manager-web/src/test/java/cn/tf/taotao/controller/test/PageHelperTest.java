package cn.tf.taotao.controller.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tf.taotao.mapper.TbItemMapper;
import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.po.TbItemExample;

public class PageHelperTest {
	
	
	//测试分页
	@Test
	public void test1(){
		//创建一个spring容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//从spring容器中获得mapper的代理对象
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		
		//执行查询并分页
		TbItemExample  example=new TbItemExample();
		PageHelper.startPage(1, 10);
		List<TbItem> list = mapper.selectByExample(example);
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		
		//取分页信息
		PageInfo<TbItem> pageInfo=new PageInfo<>(list);
		long total=pageInfo.getTotal();
		System.out.println("共有商品"+total);
		
	}

}
