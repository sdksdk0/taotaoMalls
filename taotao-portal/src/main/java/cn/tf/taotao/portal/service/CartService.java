package cn.tf.taotao.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.portal.pojo.CartItem;

public interface CartService {
	TaotaoResult addCartItem(long  itemId,int num,HttpServletRequest request, HttpServletResponse response);

	//得到购物车列表
	List<CartItem> getCartItemList(HttpServletRequest request,
			HttpServletResponse response);

	//删除
	TaotaoResult deleteCartItem(long itemId, HttpServletRequest request,
			HttpServletResponse response);

	
	
}
