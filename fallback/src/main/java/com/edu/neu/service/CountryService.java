package com.edu.neu.service;

import com.edu.neu.domain.Country;
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
 * @date: 2021/4/24 13:36
 */
@FeignClient(value = "provider", fallbackFactory =
        com.edu.neu.config.CountryServiceFallbackFactory.class)
@Service
@RequestMapping("/country")
public interface CountryService {
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<Country> findAll();

    @RequestMapping(value = "/findById/{id}", method =
            RequestMethod.GET)
    Country findById(@PathVariable("id") int id);
}
