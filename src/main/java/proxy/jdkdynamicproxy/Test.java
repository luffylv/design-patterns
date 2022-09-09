/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package proxy.jdkdynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @Description
 *
 * @Program DesignPatterns
 * @Author luffy.lv
 * @Date 2022-09-07
 **/
public class Test {

    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        LogHandler handler = new LogHandler();
        handler.setTarget(fourOperations);
        Calculation proxy = (Calculation) Proxy.newProxyInstance(FourOperations.class.getClassLoader(), FourOperations.class.getInterfaces(), handler);

        proxy.add(5, 6);
    }
}
