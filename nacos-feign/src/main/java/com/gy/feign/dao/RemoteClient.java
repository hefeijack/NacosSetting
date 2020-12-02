package com.gy.feign.dao;

import com.gy.feign.dao.impl.RemoteClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 定义OpenFeign要调用的远程服务接口
 */

//通过@FeginClient注解指定被调用方的服务名
//通过fallback属性指定RemoteHystrix类，来进行远程调用的熔断和降级处理
@FeignClient(name = "nacos-provide-gy", fallback = RemoteClientImpl.class)
@Component
public interface RemoteClient {

    @GetMapping("/helloNacos")
    String helloNacos();

}
