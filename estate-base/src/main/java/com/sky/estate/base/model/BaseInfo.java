package com.sky.estate.base.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseInfo {

    protected LocalDateTime createTime;

    protected LocalDateTime updateTime;

    protected String creator;

}
