package com.cn.study.adapterpattern.loginadapter.v1;

import com.cn.study.adapterpattern.loginadapter.ResultMsg;
import com.cn.study.adapterpattern.loginadapter.v1.service.SiginForThirdService;

public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
        ResultMsg login = service.login("zhangsan", "123456");
        ResultMsg loginForQQ = service.loginForQQ("addadadda");
        service.loginForWeChat("asdaqweqeadad");

    }

}
