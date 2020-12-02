package com.gy.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient      //开启服务注册发现功能
public class NacosProvideApplication {

    public static void main(String[] args) {

        SpringApplication.run(NacosProvideApplication.class, args);

    }

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos!  by gygygy";
    }

}
