package com.gy.feign;


import com.gy.feign.dao.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableFeignClients
@RestController
@SpringBootApplication
public class NacosFeignApplication {

    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test(){
        return remoteClient.helloNacos();
    }

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignApplication.class, args);
    }

}
