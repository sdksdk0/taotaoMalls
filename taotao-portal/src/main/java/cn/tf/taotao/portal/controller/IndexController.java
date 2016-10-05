package cn.tf.taotao.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.portal.service.ContentService;


@Controller
public class IndexController {
	
	@Autowired
	private ContentService contentService;
	
	
	@RequestMapping("/index")
	public String showIndex(Model model){
		String adResult = contentService.getContentList();
		model.addAttribute("ad1", adResult);

		return "index";
	}
	
	//模拟post请求
	@RequestMapping(value="/httpclient/post",method=RequestMethod.POST)
	@ResponseBody
	public String tesePost(String username,String password){
		return username+"_"+password;
	}
	
	

}
