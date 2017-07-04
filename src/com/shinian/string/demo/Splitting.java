package com.shinian.string.demo;

import java.util.Arrays;

public class Splitting {
    public static String knights = "dsadsna a,./ dsadsadsa, 111. sad  dsa d dsa dsa dsa d ";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");//没有使用
        split("\\W+");//非单词字符
        split("n\\W+");//字符N后面跟了多个非单词字符
    }

}
