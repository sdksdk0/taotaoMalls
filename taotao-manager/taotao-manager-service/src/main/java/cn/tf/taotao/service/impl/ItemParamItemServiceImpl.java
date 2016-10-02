package cn.tf.taotao.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.taotao.common.utils.JsonUtils;
import cn.tf.taotao.mapper.TbItemParamItemMapper;
import cn.tf.taotao.po.TbItemParamItem;
import cn.tf.taotao.po.TbItemParamItemExample;
import cn.tf.taotao.po.TbItemParamItemExample.Criteria;
import cn.tf.taotao.service.ItemParamItemSevice;

@Service
public class ItemParamItemServiceImpl implements ItemParamItemSevice{

	@Autowired
	private TbItemParamItemMapper  itemParamMapper;
	
	
	@Override
	public String getItemParamByItemId(Long itemId) {
		TbItemParamItemExample  example=new TbItemParamItemExample();
		Criteria  criteria=example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		
		List<TbItemParamItem> list = itemParamMapper.selectByExampleWithBLOBs(example);
		if(list==null || list.size()==0){
			return "";
		}
		
		TbItemParamItem itemParamItem=list.get(0);
		String paramData=itemParamItem.getParamData();
		//生成html
		
		//把规格参数json数据转换为java对象
		List<Map> jsonList = JsonUtils.jsonToList(paramData, Map.class);
		StringBuffer  sb=new StringBuffer();
		sb.append("<table cellpadding=\"1\"  cellspacing=\"1\"  width=\"100%\"  border=\"0\"  >\n");
		for(Map m1:jsonList){
			sb.append("  <tr>\n");
			sb.append("<th colspan=\"2\">"+m1.get("group")+"</th>\n");
			sb.append( "</tr>\n");
			List<Map> list2=(List<Map>) m1.get("params");
			for (Map m2 : list2) {
				sb.append("  <tr>\n");
				sb.append("<th>"+m2.get("k")+"</th>\n");
				sb.append("<th>"+m2.get("v")+"</th>\n");
				sb.append( "</tr>\n");			}
		}
		
		sb.append(" </table>");
		return sb.toString();
		
		
		
		
	}

}
