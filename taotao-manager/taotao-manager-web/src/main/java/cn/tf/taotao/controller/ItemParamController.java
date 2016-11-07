package cn.tf.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbItemDesc;
import cn.tf.taotao.po.TbItemParam;
import cn.tf.taotao.po.TbItemParamItem;
import cn.tf.taotao.service.ItemParamService;

//参数模板，返回json数据
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	
	
	@Autowired
	private ItemParamService itemParamService;
	
	
	@RequestMapping("/query/itemcatid/{itemCatId}")
	@ResponseBody
	public TaotaoResult getItemParamByCid(@PathVariable Long itemCatId){
		TaotaoResult  result=itemParamService.getItemParamByCid(itemCatId);
		return result;
	}
	
	
	//接收cid，规格参数模板
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public TaotaoResult inserTaotaoResult(@PathVariable Long cid,String paramData){
		TbItemParam itemParam=new TbItemParam();
		itemParam.setItemCatId(cid);
		itemParam.setParamData(paramData);
		TaotaoResult result = itemParamService.insertItemParam(itemParam);
		return result;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDResult getItemList(Integer page,Integer rows){
		EUDResult result = itemParamService.getItemList(page, rows);
		return result;
	}
	
	
	//加载商品规格
	@RequestMapping("/item/query/{id}")
	@ResponseBody
	public TbItemParamItem listItemDesc(@PathVariable Long id) {
		return itemParamService.listParamDesc(id);
	}
		
	
	//删除商品规格参数模板
	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult  deleteParam(String ids){
		return itemParamService.deleteParam(ids);
		
	}
	

}
