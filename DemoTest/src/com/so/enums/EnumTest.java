package com.so.enums;

public class EnumTest {

    public static void main(String[] args) {
       String values = EnumStatus.getValues(2);
//       Integer key = EnumStatus.getKeys("发送");

//        System.out.println("key:"+key);
        System.out.println("values:"+values);

    }
}
