package cn.tf.taotao.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.utils.ExceptionUtil;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbContent;
import cn.tf.taotao.rest.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {
	
	//发布服务，接收查询参数
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/list/{cid}")
	@ResponseBody
	public TaotaoResult getContentList(@PathVariable Long cid){
		try {
			List<TbContent> list = contentService.getContentList(cid);
			return TaotaoResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}		
	}
	

}
