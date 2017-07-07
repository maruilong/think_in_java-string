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
 * @ClassName: Exercise19
 * @Description: 输出java源代码所有用的到的类的名称 大写字母开头后面0~N位任意数字
 * @author shinian
 * @date 2017年7月7日 下午10:05:43
 * 
 */
public class Exercise19 {
	// 比起上一道题 这道题的重点终于绕了回来 那就是正则表达式如何书写 大概是 "中间任意字符"
	public static void main(String[] args) {
		args = new String[2];
		args[0] = "l://git//think_in_java-string//src//com//shinian//string//exercise//Exercise19.java";
		args[1] = "[A-Z]\\w+";// 模拟用户输入

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
