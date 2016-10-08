package com.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/10.
 */
public class User implements Serializable{
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
