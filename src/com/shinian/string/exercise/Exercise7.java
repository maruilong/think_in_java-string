package com.shinian.string.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: Exercise7
 * @Description: 使用Pattern编写一个正则表达式 检查一个句子是否以大写字母开头 以句号结尾
 * @author shinian
 * @date 2017年7月4日 下午3:08:58
 * 
 */
public class Exercise7 {
    public static void main(String[] args) {
        // 创建表达式对象
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");

        String str = "Waa.";
        // 匹配机
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.find());
    }
}
