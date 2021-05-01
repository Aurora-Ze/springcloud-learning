package com.edu.neu.controller;

import com.edu.neu.domain.Country;
import com.edu.neu.service.CountryService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping(value = "/country",produces = {"application/json;charset=UTF-8"})
public class CountryController {
    @Autowired
    private CountryService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Country> findAll() {
        return service.findAll();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public Country findById(@PathVariable("id") int id) throws Exception{
        Country c = service.findById(id);
        if (c == null) {
            throw new Exception();
        } else {
            return c;
        }
    }

    public Country fallback(@PathVariable("id") int id){
        Country country = new Country();
        country.setId(id);
        country.setName("The country id " + id + " is not found!");
        country.setLocation("no this data in Database");
        return country;
    }
}
