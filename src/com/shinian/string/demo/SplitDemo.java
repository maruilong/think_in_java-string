package com.shinian.string.demo;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "this!!unusual user !!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        // 第二次参数限制数量
        System.out.println(Arrays.toString(Pattern.compile("!!")
                .split(input, 3)));
    }
}
