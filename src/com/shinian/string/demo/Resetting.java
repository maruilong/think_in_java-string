package com.shinian.string.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("[frb][aiu][gx]").matcher(
                "fix the rug with bags");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        matcher.reset("fix the rig with rags");//待参数 充值 不待参数 重置到起始位置

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
