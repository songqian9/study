package com.so.stream;

import com.so.pojo.School;
import com.so.pojo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        //输出10个随机数
        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

        //使用map输出了元素对应的平方数：
        List<Integer> numbers= Arrays.asList(3,2,2,3,7,3,5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
//        System.out.println(squaresList);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();
//        System.out.println(count);

        List<String> stringList = strings.stream().filter(string->!string.equals("bc")).collect(Collectors.toList());
//        System.out.println(stringList);

        Student student = new Student(1,"wang",20,"男");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        School school = new School(1,"武昌首义学院",studentList);
        List<School> schoolList = new ArrayList<>();
        schoolList.add(school);



    }

}
