package cn.tf.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.service.ItemService;


//商品管理

@Controller
public class ItemController {
	
	
	@Autowired
	private ItemService  itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable  Long itemId){
		TbItem tbItem=itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDResult getItemList(Integer page,Integer rows){
		EUDResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	
	//接收表单中的内容，使用一个pojo接收表单内容
	@RequestMapping(value="/item/save",method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createItem(TbItem item){
		TaotaoResult result=itemService.createItem(item);
		return result;
		
	}
	
	

}
