package com.cn.study.adapterpattern.poweradapter;

public class PowerAdapterTest {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.outputDC5V();
    }

}
