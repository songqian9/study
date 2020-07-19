package com.so.lambda.exercise;

import com.so.lambda.Person;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Exercise1 {
    //集合排序
    //ArrayList<>
    public static void main(String[] args) {
        //需求：已知在ArrayList中由若干个Person对象。将这些Person对象按照年龄进行降序排序。
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("小明",10));
        list.add(new Person("大熊",30));
        list.add(new Person("小阳",20));
        list.add(new Person("张三",8));
        list.add(new Person("李四",12));
        list.add(new Person("王五",23));
        list.add(new Person("小夫",12));
        list.add(new Person("胖虎",10));


        list.sort((o1,o2)->o2.getAge()-o1.getAge());

        System.out.println(list.toArray());
    }
}
