package com.shinian.string.demo;

/**
 * 
 * @ClassName: IntegerMatch
 * @Description: 正则的小实验
 * @author shinian
 * @date 2017年7月4日 下午2:44:13
 * 
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-123".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(\\+|-)?\\d+"));

    }
}
