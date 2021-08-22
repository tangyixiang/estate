package com.sky.estate.base.model;

import lombok.Data;

@Data
public class Department extends BaseInfo{

    private long id;

    private String name;

    private long institutionId;

    private long parentId;

}
