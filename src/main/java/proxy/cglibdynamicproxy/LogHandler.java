/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package proxy.cglibdynamicproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 *
 * @Program DesignPatterns
 * @Author luffy.lv
 * @Date 2022-09-07
 **/
public class LogHandler implements MethodInterceptor {

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String methodName = method.getName();
        Object o = null;
        if (methodName.equals("add")) {
            System.out.println("入参为：" + args[0] + "  " + args[1]);
            o = proxy.invokeSuper(obj, args);
            System.out.println("结果为：" + o);
        }
        return o;
    }
}
