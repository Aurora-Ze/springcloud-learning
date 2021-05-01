package com.edu.neu.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Aurora
 * @Title: Country
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/24 13:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("country")
public class Country {
    int id;
    String name;
    String location;
}
