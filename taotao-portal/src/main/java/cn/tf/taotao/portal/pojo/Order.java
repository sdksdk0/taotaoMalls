package cn.tf.taotao.portal.pojo;

import java.util.List;

import cn.tf.taotao.po.TbOrder;
import cn.tf.taotao.po.TbOrderItem;
import cn.tf.taotao.po.TbOrderShipping;

public class Order extends TbOrder{
	private List<TbOrderItem>  orderItems;
	private TbOrderShipping orderShipping;
	public List<TbOrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<TbOrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public TbOrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(TbOrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}
	
	

}
