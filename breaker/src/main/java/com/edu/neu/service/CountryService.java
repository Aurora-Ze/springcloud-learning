package com.edu.neu.service;

import com.edu.neu.domain.Country;
import com.edu.neu.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Aurora
 * @Title: CountryService
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 13:34
 */
@Service
public class CountryService {
    @Autowired
    private CountryMapper mapper;

    public List<Country> findAll() {
        return mapper.selectList(null);
    }
    public Country findById(int id) {
        return mapper.selectById(id);
    }
}
