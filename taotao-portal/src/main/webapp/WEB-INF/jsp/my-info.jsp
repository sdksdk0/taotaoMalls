<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Cache-Control" content="max-age=300" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的信息 - 淘淘</title>
<meta name="Keywords" content="java,淘淘java" />
<meta name="description" content="在淘淘中找到了29910件java的类似商品，其中包含了“图书”，“电子书”，“教育音像”，“骑行运动”等类型的java的商品。" />
<link rel="stylesheet" type="text/css" href="/css/base.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/myjd.common.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/myjd.info.css" media="all" />
<script type="text/javascript" src="/js/jquery-1.6.4.js"></script>
</head>
<body>
<script type="text/javascript" src="/js/base-2011.js" charset="utf-8"></script>
<!-- header start -->
<jsp:include page="commons/header.jsp" />
<!-- header end -->

<div id="container">
<div class="w">
	
<div id="main">
    <div class="g-0">
        <div id="content" class="c-3-5">
            
			<div class="mod-main">
                        <div class="mt">
                            <ul class="extra-l">
                                <li class="fore-1"><a class="curr" href="http://i.jd.com/user/info">基本信息</a></li>
                                <li class="fore-2"><a href="http://i.jd.com/user/userinfo/showImg.html">头像照片</a></li>
                                <li class="fore-3"><a href="http://i.jd.com/user/userinfo/more.html">更多个人信息</a></li>
                                
                            </ul>
                        </div>
                        <div class="mc">
                            <div class="user-set userset-lcol">
                                <div class="form">
                                    <div class="item">
                                        <span class="label"><em>*</em>昵称：</span>
                                        <div class="fl">
                                            <input type="text" class="itxt" maxlength="20" id="nickName" name="userVo.nickName" value="林中守望者">
                                            <div class="clr"></div><div class="prompt-06"><span id="nickName_msg"></span></div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label"><em>*</em>性别：</span>
                                        <div class="fl">
                                            <input type="radio" name="sex" class="jdradio" value="0"><label class="mr10">男</label>
                                            <input type="radio" name="sex" class="jdradio" value="1"><label class="mr10">女</label>
                                            <input type="radio" name="sex" class="jdradio" value="2"><label class="mr10">保密</label>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">生日：</span>
                                        <div class="fl birthday-info">
                                            <select name="" class="selt selt1" id="birthdayYear"><option value="0" disabled="" selected="selected">请选择：</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="00后">00后</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="90后">90后</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="80后">80后</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="70后">70后</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="60后">60后</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="50后">50后</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="40后">40后</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option><option value="30后">30后</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option></select>
                                            <label class="ml5 mr5">年</label>
                                            <select name="" class="selt selt1" id="birthdayMonth"><option value="0" disabled="" selected="selected">请选择：</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select>
                                            <label class="ml5 mr5">月</label>
                                            <select name="" class="selt selt1" id="birthdayDay"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option></select>
                                            <label class="ml5 mr5">日</label>
                                            <span class="ftx03">填生日有惊喜哦~</span>
                                        </div>
                                    </div>

                                    <div class="item">
                                        <span class="label">兴趣爱好：</span>
                                        <div class="fl interest-list">
                                            <p>请选择您感兴趣的分类，给您最精准的推荐</p>
                                            <ul class="hobul">
                                                <li name="hobbyType" value="1">图书/音像/数字商品<s></s></li>
                                                <li name="hobbyType" value="2">家用电器<s></s></li>
                                                <li name="hobbyType" value="3">手机/数码<s></s></li>
                                                <li name="hobbyType" value="4">电脑/办公<s></s></li>
                                                <li name="hobbyType" value="5">家居/家具/家装/厨具<s></s></li>
                                                <li name="hobbyType" value="6">服饰内衣/珠宝首饰<s></s></li>
                                                <li name="hobbyType" value="7">个护化妆<s></s></li>
                                                <li name="hobbyType" value="8">鞋靴/箱包/钟表/奢侈品<s></s></li>
                                                <li name="hobbyType" value="9">运动健康<s></s></li>
                                                <li name="hobbyType" value="10">汽车用品<s></s></li>
                                                <li name="hobbyType" value="11">母婴/玩具乐器<s></s></li>
                                                <li name="hobbyType" value="12">食品饮料/保健食品<s></s></li>
                                                <li name="hobbyType" value="13">彩票/旅行/充值/票务<s></s></li>
                                            </ul>
                                        </div>
                                    </div>
									<div class="item">
									<span class="label">邮箱：</span>
									<div class="fl">
																				<div>
											<strong>    zh*****_j@163.com
</strong><a target="_blank" class="ml5 ftx05" href="http://safe.jd.com/validate/updateMail">修改</a><span class="ftx-03">&nbsp;&nbsp;&nbsp;已验证</span>
										</div>
																			</div>

									<div class="clr"></div>
								</div>
									
                                    <div class="item">
                                        <span class="label">真实姓名：</span>
                                        <div class="fl">
                                            <input type="text" class="itxt" maxlength="20" name="userVo.realName" id="realName" value="张志君">
                                            <div class="clr"></div><div class="prompt-06"><span id="realName_msg"></span></div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">所在地：</span>
                                        <div class="fl">
                                            <select name="userVo.province" class="selt mr5" id="province" value="2">
                                                                                                    <option value="1">北京</option>
                                                                                                    <option value="2">上海</option>
                                                                                                    <option value="3">天津</option>
                                                                                                    <option value="4">重庆</option>
                                                                                                    <option value="5">河北</option>
                                                                                                    <option value="6">山西</option>
                                                                                                    <option value="7">河南</option>
                                                                                                    <option value="8">辽宁</option>
                                                                                                    <option value="9">吉林</option>
                                                                                                    <option value="10">黑龙江</option>
                                                                                                    <option value="11">内蒙古</option>
                                                                                                    <option value="12">江苏</option>
                                                                                                    <option value="13">山东</option>
                                                                                                    <option value="14">安徽</option>
                                                                                                    <option value="15">浙江</option>
                                                                                                    <option value="16">福建</option>
                                                                                                    <option value="17">湖北</option>
                                                                                                    <option value="18">湖南</option>
                                                                                                    <option value="19">广东</option>
                                                                                                    <option value="20">广西</option>
                                                                                                    <option value="21">江西</option>
                                                                                                    <option value="22">四川</option>
                                                                                                    <option value="23">海南</option>
                                                                                                    <option value="24">贵州</option>
                                                                                                    <option value="25">云南</option>
                                                                                                    <option value="26">西藏</option>
                                                                                                    <option value="27">陕西</option>
                                                                                                    <option value="28">甘肃</option>
                                                                                                    <option value="29">青海</option>
                                                                                                    <option value="30">宁夏</option>
                                                                                                    <option value="31">新疆</option>
                                                                                                    <option value="32">台湾</option>
                                                                                                    <option value="42">香港</option>
                                                                                                    <option value="43">澳门</option>
                                                                                                    <option value="84">海外</option>
                                                                                            </select>
                                            <select name="userVo.city" class="selt mr5" id="city" value="2826"><option value="78">黄浦区</option><option value="2811">卢湾区</option><option value="2813">徐汇区</option><option value="2815">长宁区</option><option value="2817">静安区</option><option value="2820">闸北区</option><option value="2822">虹口区</option><option value="2823">杨浦区</option><option value="2824">宝山区</option><option value="2825">闵行区</option><option value="2826">嘉定区</option><option value="2830">浦东新区</option><option value="2833">青浦区</option><option value="2834">松江区</option><option value="2835">金山区</option><option value="2836">南汇区</option><option value="2837">奉贤区</option><option value="2841">普陀区</option><option value="2919">崇明县</option></select>
                                            <select name="userVo.county" class="selt mr5" id="county" value="2864"><option value="2864">外环以外</option></select>
											<div class="clr"></div><div class="prompt-06"><span id="city_msg"></span></div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">&nbsp;</span>
                                        <div class="fl">
                                            <input type="text" class="itxt itxt1" name="userVo.address" id="address" value="上海徐汇区内环以内漕溪北路737弄2号楼3201室">
										    <div class="clr"></div><div class="prompt-06"><span id="address_msg"></span></div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">&nbsp;</span>
                                        <div class="fl">
                                            <input id="code" value="100294" style="display:none">
                                            <input id="rkey" value="736e6f5f315f67657455736572496e666f6468313839313030323934" style="display:none">
                                            <a href="javascript:void(0)" class="btn-5" onclick="updateUserInfo()">提交</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="user-info">
                                <div class="u-pic">
                                    <img alt="用户头像" src="/images/defaultImgs/1.jpg">
                                    <div class="mask"></div>
                                    <div class="face-link-box"></div>
                                    <a href="http://i.jd.com/user/userinfo/showImg.html" class="face-link">修改头像</a>
                                </div>
                                <div class="info-m">
									<div><b>用户名：dh189</b></div>
                                    <div class="u-level">
										<span class="rank r4">
											<s></s><a href="http://usergrade.jd.com/user/grade" target="_blank">金牌会员</a>
										</span>
                                    </div>
                                    <div class="shop-level">购物行为评级：<span><a target="_blank" href="http://help.jd.com/help/question-57.html#help2173">
										<s id="userCredit" class="rank-sh rank-sh01 rank-sh02"></s></a></span></div>
                                    <div>会员类型：个人用户</div>
                                </div>
                            </div>
							<div class="fr ac" style="width:280px;">
								  注：修改手机和邮箱请到<a class="ml5 ftx05" href="http://safe.jd.com/user/paymentpassword/safetyCenter.action">账户安全</a>
							</div>
                            <div class="clr"></div>
							
                        </div>
                    </div>            
        </div>
    </div>
    <div id="left" class="g-3-5 c-0">
        <!--js 加载异步加载的左侧菜单 -->
    <div id="menu"><h3>我的交易</h3><dl class="fore1"><dt><a target="_blank" clstag="homepage|keycount|home2013|hdd" id="_MYJD_ordercenter" href="http://order.jd.com/center/list.action" class="curr">我的订单</a></dt></dl><dl class="fore2"><dt><a target="_blank" clstag="homepage|keycount|home2013|hyushou" id="_MYJD_yushou" href="http://yushou.jd.com/member/qualificationList.action">我的预售</a></dt></dl><dl class="fore3"><dt><a target="_blank" clstag="homepage|keycount|home2013|hbdsh" id="_MYJD_locallife" href="http://life.jd.com/localOrder/iniOrder.do">我的本地生活</a></dt></dl><dl class="fore4"><dt><a target="_blank" clstag="homepage|keycount|home2013|hdqs" id="_MYJD_ding" href="http://ding.jd.com/plan/showPlans.action">我的定期送</a></dt></dl><dl class="fore5"><dt><a target="_blank" clstag="homepage|keycount|home2013|htg" id="_MYJD_tuan" href="http://tuan.jd.com/order/index.php">我的团购</a></dt></dl><dl class="fore6"><dt><a target="_blank" clstag="homepage|keycount|home2013|hjg" id="_MYJD_protection" href="http://jiabao.jd.com/protecting">价格保护</a></dt></dl><dl class="fore7"><dt class="hc"><b></b><a target="_blank" id="_MYJD_gz" href="#none">我的关注</a></dt><dd class="fore1"><div class="item" id="_MYJD_product"><a target="_blank" clstag="homepage|keycount|home2013|hgz" href="http://t.jd.com/home/follow">关注的商品</a></div></dd><dd class="fore2"><div class="item" id="_MYJD_vender"><a target="_blank" clstag="homepage|keycount|home2013|hdp" href="http://t.jd.com/vender/followVenderList.action">关注的店铺</a></div></dd><dd class="fore3"><div class="item" id="_MYJD_activity"><a target="_blank" clstag="homepage|keycount|home2013|hhd" href="http://t.jd.com/activity/followActivityList.action">关注的活动</a></div></dd><dd class="fore4 last "><div class="item" id="_MYJD_history"><a target="_blank" clstag="homepage|keycount|home2013|hll" href="http://my.jd.com/history/list.html">浏览历史&nbsp;<img width="24" height="11" src="/images/myjd-new-ico.png"></a></div></dd></dl><dl class="fore8"><dt class="hc"><b></b><a target="_blank" id="_MYJD_zc" href="#none">我的资产</a></dt><dd class="fore1"><div class="item" id="_MYJD_cashbox"><a target="_blank" clstag="homepage|keycount|home2013|hjk" href="http://jinku.pay.jd.com/xjk/income.action">我的小金库</a></div></dd><dd class="fore2"><div class="item" id="_MYJD_credit"><a clstag="homepage|keycount|home2013|hbt" tag="213" href="http://baitiao.jd.com/creditUser/record">淘淘白条</a>&nbsp;</div></dd><dd class="fore3"><div class="item" id="_MYJD_tx"><a target="_blank" clstag="homepage|keycount|home2013|htx" href="http://mobile.jd.com/yyswt/myjd.do">淘淘通信</a></div></dd><dd class="fore4"><div class="item" id="_MYJD_balance"><a target="_blank" clstag="homepage|keycount|home2013|hye" href="http://mymoney.jd.com/finance/recently.action">余额</a></div></dd><dd class="fore5"><div class="item" id="_MYJD_ticket"><a target="_blank" clstag="homepage|keycount|home2013|hyh" href="http://quan.jd.com/user_quan.action">优惠券</a></div></dd><dd class="fore6"><div class="item" id="_MYJD_card"><a target="_blank" clstag="homepage|keycount|home2013|he" href="http://giftcard.jd.com/giftcard/index.action">淘淘卡/E卡</a></div></dd><dd class="fore7 last"><div class="item" id="_MYJD_bean"><a target="_blank" clstag="homepage|keycount|home2013|hjd" href="http://bean.jd.com/myJingBean/list">京豆</a></div></dd></dl><dl class="fore9 last "><dt class="hc"><b></b><a target="_blank" id="_MYJD_fw" href="#none">客户服务</a></dt><dd class="fore1"><div class="item" id="_MYJD_repair"><a target="_blank" clstag="homepage|keycount|home2013|hfx" href="http://myjd.jd.com/repair/orderlist.action">返修退换货</a></div></dd><dd class="fore2"><div class="item" id="_MYJD_refundment"><a target="_blank" clstag="homepage|keycount|home2013|hqx" href="http://rps.fm.jd.com/rest/refund/refundList">取消订单记录</a></div></dd><dd class="fore3 last "><div class="item" id="_MYJD_complaint"><a target="_blank" clstag="homepage|keycount|home2013|htx" href="http://myjd.jd.com/opinion/orderList.action">我的投诉</a></div></dd></dl></div><div id="da-game" class="da-box m"><a href="http://c.nfa.jd.com/adclick?sid=14&amp;cid=720&amp;aid=4497&amp;bid=0&amp;unit=85943&amp;advid=131939&amp;guv=&amp;url=http://wan.jd.com/yeyou/play.html?gameId=86&amp;gateWayId=s40"><img width="100%" src="/images/547e6a57N75c2f016.gif" alt=""></a></div><div id="da-home" class="da-box"><a href="http://c.nfa.jd.com/adclick?sid=2&amp;cid=102&amp;aid=413&amp;bid=8305&amp;unit=65429&amp;advid=166662&amp;guv=&amp;url=http://vivoshop.jd.com" target="_blank"><img width="100%" height="100%" alt="" app="image:poster" src="/images/549d03d0N59b1f026.jpg"></a></div></div>
    <span class="clr"></span>
</div>
</div>
</div>

<!-- footer start -->
<jsp:include page="commons/footer.jsp" />
<!-- footer end -->
</body>
</html>