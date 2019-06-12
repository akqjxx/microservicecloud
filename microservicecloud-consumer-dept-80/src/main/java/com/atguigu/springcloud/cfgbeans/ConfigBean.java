package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import static com.atguigu.springcloud.cfgbeans.InterfaceTest.DEFAULT_PREFIX;

@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate() {
        String str = "t"+DEFAULT_PREFIX;
        return new RestTemplate();
    }
}
