package com.shinian.string.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: Exercise16
 * @Description: 修改Jgrep类 你可以通过输入一个目录查出下面所有的文件
 * 
 * @author shinian
 * @date 2017年7月7日 下午4:20:27
 * 
 */
public class Exercise16 {
    // 步骤大概是 接受参数 通过输入的[地址|文件]来获得内容最后使用正则判断

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "D:\\git\\think_in_java-string\\src\\com\\shinian\\string\\demo";
        args[1] = "\\b[Ssct]\\w+";// 模拟用户输入

        Pattern pattern = Pattern.compile(args[1]);
        int index = 0;
        Matcher matcher = pattern.matcher("");

        File[] files;

        File file = new File(args[0]);
        if (file.isDirectory()) {
            files = file.listFiles();
        } else {
            files = new File[1];
            files[0] = file;
        }
        BufferedReader bf = null;
        try {
            for (int i = 0; i < files.length; i++) {
                bf = new BufferedReader(new FileReader(files[i]));
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
                        System.out.println(index++ + ": " + matcher.group()
                                + ": " + matcher.start() + " 文件名为: "+ files[i].getName());
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
