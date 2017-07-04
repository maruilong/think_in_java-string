package com.shinian.string.demo;

/**
 * 
 * @ClassName: Replacing
 * @Description: 替换
 * @author shinian
 * @date 2017年7月4日 下午3:05:31
 * 
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("d\\w+", "shinian"));
        System.out.println(s.replaceAll("dsa|sad|d", "shinian"));
    }
}
