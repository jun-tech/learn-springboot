package org.juntech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication(scanBasePackages = {"org.juntech"})
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
