package com.so.lambda.exercise;

import com.so.lambda.Person;

import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        // TreeSet
        TreeSet<Person> set = new TreeSet<>((o1,o2)->{
            if(o1.getAge() >= o2.getAge()) {
                return -1;
            }else{
                return 1;
            }
        });
        set.add(new Person("小明",10));
        set.add(new Person("大熊",30));
        set.add(new Person("小阳",20));
        set.add(new Person("张三",8));
        set.add(new Person("李四",12));
        set.add(new Person("王五",23));
        set.add(new Person("小夫",12));
        set.add(new Person("胖虎",10));

        System.out.println(set);
    }
}
