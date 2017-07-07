package com.shinian.string.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: Jgrep
 * @Description: 匹配一个文件中符合的位置
 * @author shinian
 * @date 2017年7月7日 下午4:03:32
 * 
 */
public class Jgrep {
    public static void main(String[] args) {
        args = new String[2];
        args[0] = "D:\\git\\think_in_java-string\\src\\com\\shinian\\string\\demo\\Jgrep.java";
        args[1] = "\\b[Ssct]\\w+";// 模拟用户输入

        Pattern pattern = Pattern.compile(args[1]);
        int index = 0;
        Matcher matcher = pattern.matcher("");

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(
                    args[0])));
            String str;
            List<String> strings = new ArrayList<>();
            try {
                while ((str = bf.readLine()) != null) {
                    strings.add(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String line : strings) {
                matcher.reset(line);// 重置
                while (matcher.find()) {
                    System.out.println(index++ + ": " + matcher.group() + ": "
                            + matcher.start());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
