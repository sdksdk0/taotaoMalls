# taotaoMalls
大型分布式购物网站-B2C项目（持续更新中）
##电商行业模式
- B2B:企业到企业、商家到商家。例如阿里巴巴。
- B2C：商家到客户。例如京东、淘宝商城
- C2C：客户到客户。闲鱼。
- O2O：线上到线下。美团、饿了么。


在互联网项目中尽可能的减少表的关联查询。

Sku：最小库存量单位。就是商品id，是商品最细粒度的划分，每一个sku都唯一对应一款商品，商品的颜色、配置。


##SSM框架整合
###dao层
- 1、配置数据源
- 2、让spring容器管理SqlSessionFactory,单例存在
- 3、把mapper的代理对象放到spring容器中。使用扫描包的方式加载mapper的代理对象。


###Service层
- 1、事务管理
- 2、需要把service实现类放到spring容器中管理

###表现层
- 1、配置注解驱动
- 2、配置视图解析器
- 3、需要扫描controller


###web.xml
- 1、spring容器的配置
- 2、spring前端控制器的配置
- 3、post乱码过滤器
- 4、请求拦截



###数据库连接池：

Druid是目前最好的数据库连接池，在功能、性能、扩展性方面，都超过其他数据库连接池，包括DBCP、C3P0、BoneCP、Proxool、JBoss DataSource。
Druid已经在阿里巴巴部署了超过600个应用，经过多年多生产环境大规模部署的严苛考验。

###配置静态资源映射：

    <mvc:resources location="/WEB-INF/js/" mapping="/js/**"/>
	<mvc:resources  location="/WEB-INF/css/" mapping="/css/**"/>
	

子容器可以访问父容器中的对象。



##分页插件pageHelper的使用
该分页插件对逆向工程生成的代码支持不好，不能对有查询条件的查询分页，会抛异常。

#图片保存位置
1、小型网站，传统项目是把图片放到Tomcat工程的image文件夹。

2、当并发增加后，就添加服务器，做tomcat集群。使用负载均衡服务器来决定存放到哪个服务器的image中。当图片传到tomcat1中到tomcat2中查找图片，我们可以将tomcat1和tomcat映射到另一台服务器上，然后做共享。或者在负载均衡中进行处理。


方案1：在负载均衡服务器上做一个session 映射，如果有记录则分发到原服务器上。

方案2：在负载均衡服务器中运行一个精灵线程，预测服务器压力过大时会自动把session转移压力过小的服务器中。


3、做专门的图片服务器。使用一个http服务器，Apache.或者Nginx。使用ftp服务上传图片，vsftpd


##图片服务器的搭建
使用centos7.0

需要把nginx的根目录指向ftp上传文件的目录。

##service层
接收Controller传递过来的参数，一个文件MultiPartFile对象。把文件上传到ftp服务器。生成一个新的文件。

使用map实现，Map中的数据应该包含error。


##Controller
接收页面传递过来的图片。调用service上传到图片服务器。返回结果。
参数：MultiPartFile uploadFile	
返回值：返回json数据，应该返回一个pojo，PictureResult对象。


##富文本编辑器
//同步文本框中的商品描述
		itemAddEditor.sync();


Service接收商品的pojo，把商品数据写入到tb_item中，返回resultMap



##商品描述的保存
商品信息和商品描述是分开存储的。把商品信息描述保存到tb_item_desc表中。


###规格参数

不同分类的规格参数不同，同一分类的规格项是相同的，值不同。

规格组：
	规格项：规格值

同一类规格项的分组是相同的，规格参数个商品相关联。


##实现方案：
###方案1：使用多表来存储
每一类商品有多个分组，每个分组下有多个项，每个商品对应不同的规格参数。


商品分类表:Tb_item_cat




一对多：

商品规格分组表：Tb_item_param_group，外键，商品分类id


商品规格项：外键，商品规格分组id


商品表：


商品规格参数表：外键：商品id，商品规格项id，商品规格值。


    SELECT  pg.group_name,pk.param_name,pv.param_value
    FROM
    	tb_item_param_value pv ,
    	tb_item_param_key pk,
    	tb_item_param_group pg
    WHERE 
    item_id=855739
    AND pv.param_id=pk.id
    AND pg.id=pk.group_id

该方案需要创建多张表来描述这个规格参数的关系，查询时需要复杂的sql来查询。如果规格参数的数据量是商品信息的几十倍的时候，数据量大的社会，查询效率非常低。可扩展性差。

###方案2
使用模板的思路来解决。
1、每一个商品分类对应一个规格参数模板。
每个商品对应一个唯一的规格参数，在添加商品时，可以根据规格参数的模板，生成一个表单。


实现流程：


不需要做多表关联。缺点：复杂的表单和json之间的转换。

创建规格参数模板


#前台
#系统架构分析
前台系统和服务层可以分开，降低了系统的耦合度。开发团队可以分开，提高了开发效率。系统可以分开灵活的进行分布式部署。
服务之间通信使用的接口通信，开发工作量提高。

使用SSM框架。pom文件添加依赖。

Spring、springmvc、jstl、jQuery、httpClient.


*.html：伪静态化，是给搜索引擎用的。

商品分类展示：
首页左侧的一个商品分类。页面做一个ajax请求，请求json数据含分类信息，得到json数据后初始化分类菜单。


###json跨域请求：
处于安全考虑，js设计时不允许跨域。域名不同；域名相同但是端口不同；只有域名相同，端口相同才可以访问。


可以使用jsonp来解决：jsonp，js跨域请求数据是不可以的，但是js跨域请求js脚本是可以的。所以我们可以把数据封装成一个js语句，跨域请求js脚本，可以得到此脚本。得到js脚本之后会立即执行。可以把数据作为参数传递到方法中。


    URL_Serv: "http://localhost:8084/category.json"

    //使用jsonp来实现跨域请求
        $.getJSONP(this.URL_Serv, category.getDataService);




MappingJacksonValue
