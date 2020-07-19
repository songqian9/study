package com.so.lambda;

public class Program {
    public static void main(String[] args) {

        //1.使用接口实现类
        Comparator comparator = new MyComparator();

        //2.使用匿名内部类
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };

        //3.使用Lambda表达式来实现接口
        Comparator comparator2 = (a,b) -> a-b;

    }
}

class MyComparator implements  Comparator{

    @Override
    public int compare(int a, int b) {
        return a-b;
    }
}


interface  Comparator{
    int compare(int a,int b);
}