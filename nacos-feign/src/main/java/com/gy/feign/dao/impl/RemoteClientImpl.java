package com.gy.feign.dao.impl;

import com.gy.feign.dao.RemoteClient;
import org.springframework.stereotype.Component;


@Component
public class RemoteClientImpl implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了。。。。。by gy";
    }
}
