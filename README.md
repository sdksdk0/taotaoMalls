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
使用centos6.4
