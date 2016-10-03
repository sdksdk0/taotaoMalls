package cn.tf.taotao.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.taotao.common.utils.JsonUtils;
import cn.tf.taotao.rest.pojo.CatResult;
import cn.tf.taotao.rest.service.ItemCatService;

@Controller
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	
	
	
	/*@RequestMapping(value="/itemcat/list",
			produces=MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
	@ResponseBody
	public String getItemCatList(String callback){
		CatResult catResult=itemCatService.getItemCatList();
		//把pojo转换位字符串
		String json=JsonUtils.objectToJson(catResult);
		String result=callback+"("+json+");";
		return result;
	}
*/
	
	@RequestMapping("/itemcat/list")
	@ResponseBody
	public Object getItemCatList(String callback){
		CatResult  catResult=itemCatService.getItemCatList();
		MappingJacksonValue   mappingJacksonValue=new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
		
	}
	
	
	
}
