package com.edu.neu.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: Aurora
 * @Title: User
 * @ProjectName: homework-1
 * @Description:
 * @date: 2021/4/14 22:42
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class User {
    @TableId
    int id;
    String name;
    String telphone;
    String sex;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    Date birthday;
    String job;
    String password;

}
