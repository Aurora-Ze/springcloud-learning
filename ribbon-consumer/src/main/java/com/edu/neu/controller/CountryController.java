package com.edu.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://provider";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单。
     */
    @Autowired
    private RestTemplate restTemplate;

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/country/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/country/discovery", Object.class);
    }

    @RequestMapping("/consumer/country/findById/{id}")
    public Object findById(@PathVariable int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/country/findById/" + id, Object.class);
    }


}
