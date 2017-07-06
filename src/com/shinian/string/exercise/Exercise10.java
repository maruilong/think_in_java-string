package com.shinian.string.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: Exercise10
 * @Description: 对java now has regular expreesions验证下列是否能发现一个匹配
 * @author shinian
 * @date 2017年7月6日 下午3:25:14
 * 
 */
public class Exercise10 {

    private static String regString = "java now has regular expreesions";
    private static String[] regArray = { "^java", "\breg.*", "n.w\\s+h(a|i)s",
            "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}" };

    public static void main(String[] args) {
        for (String string : regArray) {
            Pattern pattern=Pattern.compile(string);
            Matcher matcher = pattern.matcher(regString);
            while (matcher.find()) {
                   System.out.println("该正则:"+string + "找到了位置:"+matcher.start());
            }
        }
        
    }

}
