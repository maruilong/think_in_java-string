package com.shinian.string.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionChcked {
    public static void main(String[] args) {
        args = new String[2];
        args[0] = "d:\\blog";// 你的安装目录
        args[1] = "version";

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
                if (files[i].isDirectory()) {
                    continue;
                }
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
                                + ": " + matcher.start() + " 文件名为: "
                                + files[i].getName());
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
