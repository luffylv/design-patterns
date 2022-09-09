/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package proxy.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;


/**
 * @Description
 *
 * @Program DesignPatterns
 * @Author luffy.lv
 * @Date 2022-09-07
 **/
public class Test {

    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        FourOperations proxy = (FourOperations) Enhancer.create(FourOperations.class, logHandler);
        proxy.add(5, 6);
    }
}
