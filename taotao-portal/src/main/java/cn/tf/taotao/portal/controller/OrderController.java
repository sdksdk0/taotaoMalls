package cn.tf.taotao.portal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tf.taotao.common.utils.ExceptionUtil;
import cn.tf.taotao.common.utils.TaotaoResult;
import cn.tf.taotao.portal.pojo.CartItem;
import cn.tf.taotao.portal.pojo.Order;
import cn.tf.taotao.portal.service.CartService;
import cn.tf.taotao.portal.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order-cart")
	public String showOrderCart(HttpServletRequest request,HttpServletResponse response,Model  model){
		
		List<CartItem> list = cartService.getCartItemList(request, response);
		
		//传递给页面
		model.addAttribute("cartList",list);
		
		return "order-cart";
	}
	
	
	@RequestMapping("/create")
	public String createOrder(Order  order,Model model){
		try {
			String orderId = orderService.createOrder(order);
			model.addAttribute("orderId",orderId);
			model.addAttribute("payment",order.getPayment());
			model.addAttribute("date",new DateTime().plusDays(3).toString("yyyy-MM-dd"));
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message","订单创建异常!");
			return "error/exception";
		}
	}
}
