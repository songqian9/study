package com.so.enums;

/**
 * 枚举类
 */
public enum  EnumStatus {

    SEND(1,"发送"),
    RECEIVE(2,"接收");

    private Integer key;
    private String value;

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    EnumStatus(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    EnumStatus() {
    }

    //通过Key值获取Value值
    public static String getValues(Integer key){
        EnumStatus[] enumStatuses = values();
        for (EnumStatus e : enumStatuses){
            if(e.key.equals(key)){
                return e.getValue();
            }
        }
        return null;
    }

    //通过values获取key
    public static Integer getKeys(String value){
        EnumStatus[] enumStatuses = values();
        for (EnumStatus e : enumStatuses){
            if(e.value.equals(value)){
                return e.getKey();
            }
        }
        return null;
    }
}
