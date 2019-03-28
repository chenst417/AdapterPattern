package com.cn.study.adapterpattern.loginadapter.v2.adapter;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

/**
 *
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg regist(String id, Object adapter);
}
