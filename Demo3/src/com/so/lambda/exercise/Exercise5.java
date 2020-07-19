package com.so.lambda.exercise;

public class Exercise5 {
    public static void main(String[] args) {
        //需求：开启一条线程。做一个数字的输出
        Thread t = new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println(i);
            }
        });
        t.start();
    }

}
