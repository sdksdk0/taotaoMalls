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
                                <li class="fore-1"><a href="http://i.jd.com/user/info">基本信息</a></li>
                                <li class="fore-2"><a href="http://i.jd.com/user/userinfo/showImg.html">头像照片</a></li>
                                <li class="fore-3"><a class="curr" href="http://i.jd.com/user/userinfo/more.html">更多个人信息</a></li>
								
                            </ul>
                        </div>
                        <div class="mc">
                            <div class="user-set">
                                <div class="form">

                                    <div class="item">
                                        <span class="label">婚姻状况：</span>
                                        <div class="fl">
											<input type="radio" name="maritalStatus" value="0" checked="" style="display:none"> 
                                            <input type="radio" name="maritalStatus" class="jdradio" value="1"><label class="mr10">未婚</label>
                                            <input type="radio" name="maritalStatus" class="jdradio" value="2"><label class="mr10">已婚</label>
                                            <input type="radio" name="maritalStatus" class="jdradio" value="3"><label class="mr10">保密</label>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">月收入：</span>
                                        <div class="fl">
											<select class="selt" name="monthlyIncome" id="monthlyIncome"><option value="">请选择</option><option value="1">2000元以下</option><option value="2">2000-3999元</option><option value="3">4000-5999元</option><option value="4">6000-7999元</option><option value="5">8000元以上</option></select>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">身份证号码：</span>
                                        <div class="fl">
                                            <div id="cidShowDiv" style="">
                                                <strong>140******835</strong>
												<a class="smod" href="javascript:showCidDiv()">修改</a>
                                            </div>
                                            <div id="cidInputDIv" style="display:none">
                                                <input name="userVo.cid" id="cid" value="140109198709195835" maxlength="18" type="text" class="itxt">
												<div class="clr"></div><div class="prompt-06"><span id="cid_msg"></span></div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">教育程度：</span>
                                        <div class="fl">
											<select class="selt" name="education" id="education"><option value="">请选择</option><option value="1">初中</option><option value="2">高中</option><option value="3">中专</option><option value="4">大专</option><option value="5">本科</option><option value="6">硕士</option><option value="7">博士</option><option value="8">其他</option></select>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <span class="label">所在行业：</span>
                                        <div class="fl">
											<select class="selt" name="industryInfo" id="industryInfo"><option value="">请选择</option><option value="1">计算机硬件及网络设备</option><option value="2">计算机软件</option><option value="3">IT服务（系统/数据/维护）/多领域经营</option><option value="4">互联网/电子商务</option><option value="5">网络游戏</option><option value="6">通讯（设备/运营/增值服务）</option><option value="7">电子技术/半导体/集成电路</option><option value="8">仪器仪表及工业自动化</option><option value="9">金融/银行/投资/基金/证券</option><option value="10">保险</option><option value="11">房地产/建筑/建材/工程</option><option value="12">家居/室内设计/装饰装潢</option><option value="13">物业管理/商业中心</option><option value="14">广告/会展/公关/市场推广</option><option value="15">媒体/出版/影视/文化/艺术</option><option value="17">咨询/管理产业/法律/财会</option><option value="16">印刷/包装/造纸</option><option value="19">检验/检测/认证</option><option value="18">教育/培训</option><option value="21">贸易/进出口</option><option value="20">中介服务</option><option value="23">快速消费品（食品/饮料/烟酒/化妆品</option><option value="22">零售/批发</option><option value="25">办公用品及设备</option><option value="24">耐用消费品（服装服饰/纺织/皮革/家具/家电）</option><option value="27">大型设备/机电设备/重工业</option><option value="26">礼品/玩具/工艺美术/收藏品</option><option value="29">汽车/摩托车（制造/维护/配件/销售/服务）</option><option value="28">加工制造（原料加工/模具）</option><option value="31">医药/生物工程</option><option value="30">交通/运输/物流</option><option value="34">酒店/餐饮</option><option value="35">娱乐/体育/休闲</option><option value="32">医疗/护理/美容/保健</option><option value="33">医疗设备/器械</option><option value="38">能源/矿产/采掘/冶炼</option><option value="39">电气/电力/水利</option><option value="36">旅游/度假</option><option value="37">石油/石化/化工</option><option value="42">政府/公共事业/非盈利机构</option><option value="43">环保</option><option value="40">航空/航天</option><option value="41">学术/科研</option><option value="46">其它</option><option value="44">农/林/牧/渔</option><option value="45">跨领域经营</option></select>
                                        </div>
                                    </div>

                                    <div class="item">
                                        <span class="label">&nbsp;</span>
                                        <div class="fl">
											<a href="javascript:void(0)" class="btn-5" onclick="updateMoreUserInfo()">保存</a>
                                        </div>
                                    </div>
                                </div>
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