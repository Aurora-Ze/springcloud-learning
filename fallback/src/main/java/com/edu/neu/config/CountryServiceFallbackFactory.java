package com.edu.neu.config;

import com.edu.neu.domain.Country;
import com.edu.neu.service.CountryService;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import feign.hystrix.FallbackFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Aurora
 * @Title: CountryServiceFallbackFactory
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 13:27
 */
@Component
public class CountryServiceFallbackFactory implements FallbackFactory{
    @Override
    public Object create(Throwable throwable) {
        return new CountryService(){
            @Override
            public List<Country> findAll() {
                Country country = new Country(-1,"no data","no data");
                ArrayList<Country> list = new ArrayList<>();
                list.add(country);
                return list;
            }
            @Override
            public Country findById(int id) {
                Country country = new Country();
                country.setId(id);
                country.setName("The country id " + id + " is not found!");
                country.setLocation("no this data in Database");
                return country;
            }
        };
    }
}
