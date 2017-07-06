package com.shinian.string.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        args=new String[2];
        args[0]="abcabcabcabc";
        args[1]="abc+";
        if (args.length < 2) {
            System.out.println("需要更多的词汇");
            System.exit(0);
        }
        System.out.println("input:" + args[0]);
        for (String arg : args) {
            System.out.println(arg);
            Pattern pattern = Pattern.compile(arg);
            Matcher matcher = pattern.matcher(args[0]);
            while (matcher.find()) {//可以找到多个
                System.out.println(matcher.group() + "在" + matcher.start()
                        + "与" + matcher.end() + "之间");
            }
        }
    }
}
