package com.shinian.string.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shinian.string.demo.Splitting;

public class Exercise9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a|e|i|o|u");
        String str = Splitting.knights;
        Matcher matcher = pattern.matcher(str);
        String after = matcher.replaceAll("_");
        
        System.out.println(after);
    }
}
