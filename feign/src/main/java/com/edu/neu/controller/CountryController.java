package com.edu.neu.controller;

import com.edu.neu.entity.Country;
import com.edu.neu.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Aurora
 * @Title: CountryController
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 17:03
 */
@RestController()
@RequestMapping(value = "/consumer/country")
public class CountryController {
    @Autowired
    private CountryService service;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Country> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public Country findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

}
