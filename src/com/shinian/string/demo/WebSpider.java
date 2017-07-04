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
/**
 * 
* @ClassName: WebSpider
* @Description: 网上抄的一个爬虫小列子
* @author shinian
* @date 2017年7月4日 下午2:40:10
*
 */
public class WebSpider {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        String regex = "http://[\\w+\\.?/?]+\\.[A-Za-z]+";
        Pattern p = Pattern.compile(regex);
        try {
            url = new URL("http://www.bilibili.com");
            urlconn = url.openConnection();
            pw = new PrintWriter(new FileWriter("d:/url.txt"), true);// 这里我们把收集到的链接存储在了E盘底下的一个叫做url的txt文件中
            br = new BufferedReader(new InputStreamReader(
                    urlconn.getInputStream()));
            String buf = null;
            while ((buf = br.readLine()) != null) {
                Matcher buf_m = p.matcher(buf);
                while (buf_m.find()) {
                    pw.println(buf);
                }
            }
            System.out.println("获取成功！");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();
        }
    }
}
