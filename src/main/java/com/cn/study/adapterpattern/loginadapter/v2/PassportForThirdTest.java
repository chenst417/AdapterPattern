package com.cn.study.adapterpattern.loginadapter.v2;

public class PassportForThirdTest {

    public static void main(String[] args) {
        IPassportForThird login = new PassportForThirdAdapter();
        login.loginForQQ("asdadaerq");
    }
}
