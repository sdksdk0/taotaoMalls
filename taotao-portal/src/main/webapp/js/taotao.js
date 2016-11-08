var TT = TAOTAO = {
	checkLogin : function(){
		var _ticket = $.cookie("TT_TOKEN");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://sso.tianfang1314.cn/user/token/" + _ticket,
			dataType : "jsonp",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					var username = data.data.username;
					var html = username + "，欢迎来到淘淘！<a href=\"javascript:void()\" class=\"link-logout\"  onclick=\"logout()\" >[退出]</a>";
					$("#loginbar").html(html);
				}
			}
		});
		
		
		
		
	}
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	TT.checkLogin();
});

function logout(){
	var _ticket = $.cookie("TT_TOKEN");
	if(!_ticket){
		return ;
	}
	$.ajax({
		url : "http://sso.tianfang1314.cn/user/logout/" + _ticket,
		dataType : "jsonp",
		type : "GET",
		success : function(data){
			if(data.status == 200){
				location="http://taotao.tianfang1314.cn";
			}
		}
	});
	
}

