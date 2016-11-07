package cn.tf.taotao.service;

import cn.tf.taotao.common.pojo.EUDResult;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.po.TbContent;
import cn.tf.taotao.po.TbContentCategory;

public interface ContentService {
	/**
	 * 插入操作
	 * 
	 * @param content
	 * @return
	 */
	TaotaoResult insertContent(TbContent content);

	/**
	 * 列表
	 * @param page
	 * @param rows
	 * @return
	 */
	EUDResult getContentList(long page, long pageSize);

	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	TaotaoResult deleteContent(String ids);

	/**
	 * 更新操作
	 * 
	 * @param content
	 * @return
	 */
	TaotaoResult updateContent(TbContent content);



}
