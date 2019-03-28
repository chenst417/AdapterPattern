package com.cn.study.adapterpattern.loginadapter.v2.adapter;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

public class LoginForTelPhoneAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelPhoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
