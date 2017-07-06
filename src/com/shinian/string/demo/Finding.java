package com.shinian.string.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher(
                "evening is full of the linnet wings");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        int i = 0;
        while (matcher.find(i)) {
            System.out.println(matcher.group());
            i++;
        }
    }
}
