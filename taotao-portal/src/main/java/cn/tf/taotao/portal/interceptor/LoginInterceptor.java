package cn.tf.taotao.portal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.tf.taotao.common.utils.CookieUtils;
import cn.tf.taotao.po.TbUser;
import cn.tf.taotao.portal.service.impl.UserServiceImpl;

public class LoginInterceptor implements  HandlerInterceptor{

	@Autowired
	private  UserServiceImpl userService;
	
	//在handler执行之前处理  
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//返回值决定handler是否执行
		//判断用户是否登陆，从cookie中取token，根据token获取用户信息，调用sso系统的接口。
		String token=CookieUtils.getCookieValue(request, "TT_TOKEN");
		TbUser user = userService.getUserByToken(token);
		if(null==user){
			//调到登录页面
			response.sendRedirect(userService.SSO_INTERCEPTOR+userService.SSO_PAGE_LOGIN
					+"?redirect="+userService.TAOTAO_MAIN+request.getRequestURI());
			return false;  
		}
		//把用户信息放入Request
		request.setAttribute("user", user);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	
	//返回modelAndView之后，响应用户操作
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
