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
public class FourOperationsProxy implements Calculation{

    private FourOperations fourOperations;

    public void setFourOperations(FourOperations fourOperations) {
        this.fourOperations = fourOperations;
    }

    public int add(int a, int b) {
        System.out.println("入参为：" + a + "  " + b);
        int sum = fourOperations.add(a,b);
        System.out.println("结果为：" + sum);
        return sum;
    }
}
