package cn.tf.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.pojo.ContentCatTreeNode;
import cn.tf.taotao.common.pojo.EUTreeNode;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.service.ContentCategoryService;

//内容分类管理
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {
	
	@Autowired
	private ContentCategoryService contentCategoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	List<ContentCatTreeNode> getCategoryList(@RequestParam(value = "id", defaultValue = "0") long parentId) {
		return contentCategoryService.getCategoryList(parentId);
	}
	

	
	@RequestMapping("/create")
	@ResponseBody
	public TaotaoResult creatContentCatgory(Long parentId,String name){
		TaotaoResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}
	
	//删除节点
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult  deleteContentCatgory(Long parentId, Long id){
		
		TaotaoResult result = contentCategoryService.deleteContentCategory(parentId, id);
		return result;
	}
	
	//更新节点
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult updateContentCategory(Long id, String name) {
		return contentCategoryService.updateContentCategory(id, name);
	}
	
}
