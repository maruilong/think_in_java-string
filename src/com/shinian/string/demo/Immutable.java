package com.shinian.string.demo;

/**
 * 
 * @包名 com.shinian.string.demo
 * @类名 Immutable.java
 * @作者 mrl
 * @创建日期 2017年7月3日
 * @描述 String 类不可改变
 * @版本
 * 
 */
public class Immutable {
    public static void main(String[] args) {
        //String类中的所有看起来向修改值的方法都是创建了一个新的对象
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }

    public static String upcase(String s) {
        return s.toUpperCase();
    }

}
