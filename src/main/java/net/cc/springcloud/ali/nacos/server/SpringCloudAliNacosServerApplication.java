package net.cc.springcloud.ali.nacos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAliNacosServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAliNacosServerApplication.class, args);
    }
}