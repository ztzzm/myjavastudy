# 1.添加Eureka服务端(启动类添加@EnableEurekaServer,声明依赖spring-cloud-starter-netflix-eureka-server在父pom)
# 2.SpringBloud父pom
     1.设置<packaging>pom</packaging>
     2.添加spring-cloud-dependencies依赖
# 3.<dependencyManagement>和<dependency>区别
     dependencyManagement只是声明依赖 并不实现引入 子项目需要显式的声明需要用的依赖。
     如果不在子项目中声明依赖 是不会从父项目中继承下来的 只有在子项目中写了该依赖项并且没有制定具体版本 才会从父项目中继承该项 并且version和scope都读取自父pom；