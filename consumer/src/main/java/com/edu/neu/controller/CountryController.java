package com.edu.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Aurora
 * @Title: CountryController
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 19:14
 */
@RestController
public class CountryController {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单。
     */
    @Autowired
    private RestTemplate restTemplate;

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/country/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/country/discovery", Object.class);
    }


}
