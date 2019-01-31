#虚谷数据库使用spring jdbc template框架的demo程序

一. Demo程序使用步骤：
1. 从https://github.com/xugu-publish/xugu-spring-jdbc-demo.git下载最新源代码，并引入工程
2. 在pom.xml中配置lib下的虚谷数据库jdbc依赖包，将依赖包拷贝只maven工程对应的环境目录结构中，并update maven工程
3. 执行init_db.sql中的SQL语句(创建表及初始化数据)
4. 执行测试类，查看运行结果

二. 文件介绍
1. com.xugu.pojo.PersonMapper 为结果集映射
2. spring.xml为spring应用上下文配置文件
3. AppTest为测试类
4. 该demo程序使用了c3p0,druid数据源
5. init_db为SQL脚本文件
6. lib为虚谷数据库jdbc驱动(cloudjdbc为驱动包，XuGuDialect为Hibernate方言包)，在meven目录下加入驱动，或者add to build path(pom驱动的dependency注释掉)