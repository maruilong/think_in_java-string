package com.shinian.string.demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BiliBiliSplider {

    public static void main(String[] args) {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        String regex = "dp-inline-block room-title";
        Pattern p = Pattern.compile(regex);
        try {
            pw = new PrintWriter(new FileWriter("d:/url.txt"), true);
        } catch (IOException e1) {
            e1.printStackTrace();
        }// 这里我们把收集到的链接存储在了E盘底下的一个叫做url的txt文件中
        for (int i = 10000; i < 11000 ; i++) {
            try {
                String u = "http://live.bilibili.com/" + i;
                url = new URL(u);
                urlconn = url.openConnection();
                br = new BufferedReader(new InputStreamReader(
                        urlconn.getInputStream()));
                String buf = null;
                while ((buf = br.readLine()) != null) {
                    Matcher buf_m = p.matcher(buf);
                    while (buf_m.find()) {
                        buf=buf.replaceAll("</?[^>]+>", "");
                        pw.append("房间:" + i + "名字叫:" + buf + "\r\n");
                    }
                }
                System.out.println("获取成功！");
            } catch (MalformedURLException e) {
                // e.printStackTrace();
                System.out.println("房间:" + i + "不存在");
                continue;
            } catch (IOException e) {
                System.out.println("房间:" + i + "不存在");
                continue;
            }
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw.close();
    }
}
