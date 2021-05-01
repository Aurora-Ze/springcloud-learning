package com.edu.neu.service;

import com.edu.neu.entity.Country;
import com.edu.neu.mapper.CountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Aurora
 * @Title: CountryService
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/17 17:01
 */
@Service
public class CountryService {
    private CountryMapper mapper;

    public List<Country> findAll() {
        return mapper.selectList(null);
    }
    public Country findById(int id) {
        return mapper.selectById(id);
    }
}
