package com.edu.neu.service;

import com.edu.neu.entity.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author: Aurora
 * @Title: CountryService
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/19 15:27
 */
@Service
@FeignClient("provider")
@RequestMapping("/country")
public interface CountryService {
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<Country> findAll();

    @RequestMapping("/findById/{id}")
    Country findById(@PathVariable int id);

}
