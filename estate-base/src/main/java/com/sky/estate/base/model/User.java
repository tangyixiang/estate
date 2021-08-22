package com.sky.estate.base.model;

import lombok.Data;

@Data
public class User extends BaseInfo {

    protected long id;
    // 登录账号
    protected String identifier;

    protected String userName;

    protected String password;

    protected boolean enable;

    protected String mobile;


}
