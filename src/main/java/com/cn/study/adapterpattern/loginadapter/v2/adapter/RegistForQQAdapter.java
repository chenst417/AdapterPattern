package com.cn.study.adapterpattern.loginadapter.v2.adapter;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter {
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg regist(String id, Object adapter) {
        return null;
    }
}
