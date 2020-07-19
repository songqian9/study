package com.so.lambda.syntax;

import com.so.lambda.interfaces.LambdaNoneReturnMutipleParamter;
import com.so.lambda.interfaces.LambdaNoneReturnNoneParameter;
import com.so.lambda.interfaces.LambdaNoneReturnSingleParameter;

public class SyntaxOne {

    public static void main(String[] args) {
        //1.Lambda表达式的基础语法
        //Lambda是一个匿名函数
        //参数列表 方法体

        // ():用来描述参数列表
        // {}:用来描述方法体
        // -> : Lambda运算符，读作goes to

        //无参无返回
        LambdaNoneReturnNoneParameter lambda1 = ()->{System.out.println("hello world");};
        lambda1.test();

        //无返回值单个参数
        LambdaNoneReturnSingleParameter lambda2 = (int a)->{
            System.out.println(a);
        };
        lambda2.test(10);

        //无返回值多个参数的
        LambdaNoneReturnMutipleParamter lambda3 = (int a,int b)->{
            System.out.println(a+b);
        };
        lambda3.test(10,20);
    }
}
