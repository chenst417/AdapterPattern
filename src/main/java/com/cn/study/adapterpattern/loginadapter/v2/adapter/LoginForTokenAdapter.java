package com.cn.study.adapterpattern.loginadapter.v2.adapter;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
