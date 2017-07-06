package com.shinian.string.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppendReplacementDemo {
    public static void main(String[] args) {
        String str = "a apple has a babahr";

        Pattern pattern = Pattern.compile("a");

        StringBuffer sb = new StringBuffer();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group().toUpperCase());
        }
        matcher.appendTail(sb);
        
        System.out.println(sb);
    }
}
