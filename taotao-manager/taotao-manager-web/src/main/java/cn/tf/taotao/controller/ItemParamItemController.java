package cn.tf.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.tf.taotao.service.ItemParamItemSevice;


//展示商品规格参数
@Controller
public class ItemParamItemController {

	
	@Autowired
	private ItemParamItemSevice itemParamItemSevice;
	
	@RequestMapping("/showitem/{itemId}")
	public String  showItemParam(@PathVariable Long itemId,Model model){
		String string=itemParamItemSevice.getItemParamByItemId(itemId);
		model.addAttribute("itemParam",string);
		return "item";
	}
	
}
