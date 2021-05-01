package com.edu.neu.controller;

import com.edu.neu.entity.Country;
import com.edu.neu.service.CountryService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
@RequestMapping(value = "/country")
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
    public Country findById(@PathVariable("id") int id) throws Exception {
        Country country = service.findById(id);
        if (country == null) {
            throw new Exception();
        } else {
            return country;
        }
    }

    public Country fallback(@PathVariable("id") int id){
        Country country = new Country();
        country.setId(id);
        country.setName("The country id " + id + " is not found!");
        country.setLocation("no this data in Database");
        return country;
    }

    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("provider");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
