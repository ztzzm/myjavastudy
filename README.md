# 1.添加pom注释
# 2.springboot jar 和 war 区别
  直观上 生成的pom文件不同 项目结构不同
    pom: jar 依赖为spring-boot-starter
         war 依赖为spring-boot-starter-web和spring-boot-starter-tomcat(排除SpringBoot的内置Tomcat,添加javax.servlet-api和                   tomcat-servlet-api(SpringMVC还需要配置后缀)) 
    结构：war 会多出ServletInitializer类(外置Servlet容器)继承SpringBootServletInitializer并重写了configure方法
  作用不同 war 声明这是一个web应用 war包可以使用外置Tomcat直接在tomcat下启动 war Tomcat依赖可以修改标签为<scope>provided</scope>仅测试和编译使用
          scope属性
            1.compile:默认值 表示被依赖项目需要参与当前项目的编译
            2.test:依赖项目仅仅参与测试相关的工作包括测试代码的编译和执行不会被打包例如junit
            3.runtime:表示被依赖项目无需参与项目的编译不过后期的测试和运行周期需要其参与与compile相比跳过了编译而已例如JDBC驱动适用运行和测试阶段
            4.provided:打包的时候可以不用包进去别的设施会提供事实上该依赖理论上可以参与编译测试运行等周期相当于compile但是打包阶段做了exclude操作
            5.system:和provided相同不过被依赖项不会从maven仓库下载而是从本地文件系统拿需要添加systemPath的属性来定义路径
    

