package cn.tf.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.mapper.TbItemMapper;
import cn.tf.taotao.mapper.TbItemParamItemMapper;
import cn.tf.taotao.mapper.TbItemParamMapper;
import cn.tf.taotao.po.TbItem;
import cn.tf.taotao.po.TbItemCatExample;
import cn.tf.taotao.po.TbItemExample;
import cn.tf.taotao.po.TbItemParam;
import cn.tf.taotao.po.TbItemParamExample;
import cn.tf.taotao.po.TbItemParamExample.Criteria;
import cn.tf.taotao.po.TbItemParamItem;
import cn.tf.taotao.po.TbItemParamItemExample;
import cn.tf.taotao.service.ItemParamService;


//商品规格参数模板
@Service
public class ItemParamServiceImpl implements ItemParamService{

	@Autowired
	private TbItemParamMapper itemParamMapper;
	@Autowired
	private TbItemMapper  itemMapper;
	@Autowired
	private TbItemParamItemMapper  itemParamItemMapper;
	
	
	@Override
	public TaotaoResult getItemParamByCid(long cid) {
		TbItemParamExample example=new TbItemParamExample();
		Criteria  criteria=example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//判断是否查询到结果
		if(list!=null && list.size()>0){
			return TaotaoResult.ok(list.get(0));
		}
		return TaotaoResult.ok();
	}


	//规格参数模板
	@Override
	public TaotaoResult insertItemParam(TbItemParam itemParam) {
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		
		itemParamMapper.insert(itemParam);

		return TaotaoResult.ok();
	}

	//分页查询
	@Override
	public EUDResult getItemList(int page, int rows) {
		TbItemParamExample example=new TbItemParamExample();
		PageHelper.startPage(page, rows);
		
		
		List<TbItemParam> list = itemParamMapper.selectByExample(example);

		EUDResult result=new EUDResult();
		result.setRows(list);
		PageInfo<TbItemParam>  pageInfo=new PageInfo<TbItemParam>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}


	@Override
	public TbItemParamItem listParamDesc(Long id) {
		
		TbItemExample example=new TbItemExample();
		cn.tf.taotao.po.TbItemExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(id);
		
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			TbItem item=list.get(0);
			Long cid = item.getCid();
			
			//通过cid查询tb_item_cat的id
			TbItemParamExample example1=new TbItemParamExample();
			cn.tf.taotao.po.TbItemParamExample.Criteria createCriteria1 = example1.createCriteria();
			createCriteria1.andItemCatIdEqualTo(cid);
			
			List<TbItemParam> list1 = itemParamMapper.selectByExample(example1);
			if(list1!=null && list1.size()>0){
				TbItemParam item1=list1.get(0);
				Long id2 = item1.getId();
				
				//通过id2取规格参数
				TbItemParamItem result = itemParamItemMapper.selectByPrimaryKey(id2);
				return result;
			}
			
		}
		return null;
	}

}
