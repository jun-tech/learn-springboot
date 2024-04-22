package org.juntech.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = {"org.juntech"})
@MapperScan("org.juntech")
public class JunTechApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application =  SpringApplication.run(JunTechApplication.class,args);
        // 打印启动信息
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        System.out.println("Application Boot is running port: "+port+", path："+path);
    }
}
