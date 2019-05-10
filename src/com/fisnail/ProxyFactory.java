package com.fisnail;

public class ProxyFactory {
    public static IRentalAgency getProxy(){
        return new ProxyRent(new Zhangsan());
    }
}