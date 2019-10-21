package com.mettre.pojo;

import com.mettre.enum_.GenderEnum;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@Data
public class User {

    private String userId;

    private String userName;

    private String signature;

    private GenderEnum gender;

    private String headAvatar;

    private String password;

    private String phone;

    private String city;

    private Integer age;

    private String backgroundWall;

    private Date creationTime;

    private Date updateTime;
}