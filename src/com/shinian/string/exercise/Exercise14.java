package com.shinian.string.exercise;

import java.util.Arrays;

/**
 * 
 * @ClassName: Exercise14
 * @Description: 使用String.split() 重写SplitDemo
 * @author shinian
 * @date 2017年7月6日 下午4:55:40
 * 
 */
public class Exercise14 {

    public static void main(String[] args) {
        String input = "this!!unusual user !!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        // 第二次参数限制数量
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
