package cn.tf.taotao.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.portal.pojo.Item;
import cn.tf.taotao.portal.pojo.ItemInfo;
import cn.tf.taotao.portal.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping("/item/{itemId}")
	public String showItem(@PathVariable Long itemId,Model model){
		ItemInfo item = itemService.getItemById(itemId);
		model.addAttribute("item",item);
		return "item";
	}
	
	@RequestMapping(value="/item/desc/{itemId}",produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8")
	@ResponseBody
	public String getItemDesc(@PathVariable Long itemId){
		String string=itemService.getItemDescById(itemId);
		return string;
	}
	
	@RequestMapping(value="/item/param/{itemId}",produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8")
	@ResponseBody
	public String getItemParam(@PathVariable Long itemId){
		String string=itemService.getItemParam(itemId);
		return string;
	}
	

}
