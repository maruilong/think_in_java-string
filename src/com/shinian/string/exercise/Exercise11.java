package com.shinian.string.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
 * @ClassName: Exercise11
 * @Description: 使用正则 (?!)(([^aeiou])|(\s+[aeiou])\w+?[aeiou]\b)
 *               <p>
 *               匹配字符串 Arline ate eight apples and one orange while anita han't
 *               any
 * @author shinian
 * @date 2017年7月6日 下午3:56:18
 * 
 */
public class Exercise11 {

    public static void main(String[] args) {
        String str = "Arline ate eight apples and one orange while anita han't any";

        Pattern pattern = Pattern
                .compile("(?!)(([^aeiou])|(\\s+[aeiou])\\w+?[aeiou]\b)");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
