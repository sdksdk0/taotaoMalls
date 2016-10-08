package cn.tf.taotao.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.rest.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	//接收商品id,调用service查询商品信息，返回商品对象，使用taotaoResult包装
	@Autowired
	private ItemService itemService;
	

	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public TaotaoResult getItemBaseInfo(@PathVariable Long itemId){
		TaotaoResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}
	
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public TaotaoResult getItemDesc(@PathVariable Long itemId){
		TaotaoResult result = itemService.getItemDesc(itemId);
		return result;
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public TaotaoResult getItemParam(@PathVariable Long itemId){
		TaotaoResult result = itemService.getItemParam(itemId);
		return result;
	}

}
