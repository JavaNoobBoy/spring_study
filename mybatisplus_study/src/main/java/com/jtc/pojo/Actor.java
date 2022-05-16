package com.jtc.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Actor {

    private Integer id;
    private String name;
    private String sex;
    private LocalDateTime borndate;
    private String phone;
}
