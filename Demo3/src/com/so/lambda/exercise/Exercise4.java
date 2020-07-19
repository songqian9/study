package com.so.lambda.exercise;

import com.so.lambda.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Exercise4 {
    public static void main(String[] args) {
        //需求：删除集合中满足条件的元素
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("小明",10));
        list.add(new Person("大熊",30));
        list.add(new Person("小阳",20));
        list.add(new Person("张三",8));
        list.add(new Person("李四",12));
        list.add(new Person("王五",23));
        list.add(new Person("小夫",12));
        list.add(new Person("胖虎",10));

        //删除集合中年龄>10岁的元素
//        ListIterator<Person> it = list.listIterator();
//        while (it.hasNext()){
//            Person ele = it.next();
//            if(ele.getAge() > 10){
//                it.remove();
//            }
//        }

        //Lambda实现
        //将集合中的每一个元素都带入到test方法中，如果返回值是true则删除元素
        list.removeIf(ele->ele.getAge()>10);

        System.out.println(list);
    }
}
