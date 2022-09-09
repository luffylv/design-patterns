/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package proxy.staticproxy;

/**
 * @Description
 *
 * @Program DesignPatterns
 * @Author luffy.lv
 * @Date 2022-09-07
 **/
public class FourOperations implements Calculation {

    public int add(int a, int b) {
        return a + b;
    }
}
