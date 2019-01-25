#虚谷数据库使用springJDBCTemplate框架的demo程序
1. com.xugu.pojo.PersonMapper 为结果集映射
2. spring.xml为spring应用上下文配置文件
3. AppTest为测试类
4. 该demo程序使用了c3p0,druid数据源
5. target/db下为测试表
6. target/lib为虚谷驱动，在meven目录下加入驱动，或者add to build path(pom驱动的dependency注释掉)