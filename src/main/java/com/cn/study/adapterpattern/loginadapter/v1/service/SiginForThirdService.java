package com.cn.study.adapterpattern.loginadapter.v1.service;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

public class SiginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForWeChat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String openId){
        return null;
    }

    public ResultMsg loginForTelPhone(String openId){
        return null;
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, null);
    }
}
