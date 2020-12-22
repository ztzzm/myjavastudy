## system模块引入依赖后Dependencies报红但是仓库中已下载jar包可以剪切依赖刷新并返回依赖
## 如果`@Resource`无法使用可以引入jar包也可以使用`@Autowired`jdk11删除了这个包
    ```maven
    <dependency>
        <groupId>javax.annotation</groupId>
        <artifactId>javax.annotation-api</artifactId>
        <version>1.3.2</version>
    </dependency
    ```
## mybatis步骤
+ 添加依赖
    
  ```maven
    //Spring整合mybatis
    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
    </dependency>
    //数据库驱动
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
    </dependency>
+ mybatis-config.xml或者使用yml、配置类
+ 编写Mapper映射文件
+ @ComponentScan是组件扫描注解，用来扫描@Controller  @Service  @Repository这类,主要就是定义扫描的路径从中找出标志了需要装配的类到Spring容器中
+ @MapperScan 是扫描mapper类的注解,就不用在每个mapper类上加@MapperScan
