#idea开启热部署步骤
 1.项目中添加依赖
```
<!-- 热部署DevTools -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
```
 2.IDEA开启项目自动编译，进入设置，搜索Compiler，勾选Build Project automatically
 3.IDEA开启项目运行时自动编译，连按两次shift，搜索registry -> 勾选compiler.automake.allow.when.app.running