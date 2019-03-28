package com.cn.study.adapterpattern.loginadapter.v2.adapter;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;

/**
 * 在适配器模式里面，这个借口是可有可无的，不要和模板模式混淆
 * 模板模式一定是抽象类，而这里仅仅只是一个接口
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
