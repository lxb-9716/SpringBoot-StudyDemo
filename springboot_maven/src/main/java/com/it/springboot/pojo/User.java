package com.it.springboot.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {

    public User() {
    }

    //表示当前id属性为对应表格的主键
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "user_age")
    private Integer age;
}
