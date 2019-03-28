package com.cn.study.adapterpattern.loginadapter.v2;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;
import com.cn.study.adapterpattern.loginadapter.v1.service.SiginService;
import com.cn.study.adapterpattern.loginadapter.v2.adapter.*;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return processLogin(openId, LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelPhone(String tel, String code) {
        return processLogin(tel, LoginForTelPhoneAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){

        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key, adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
