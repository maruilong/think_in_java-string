package com.shinian.string.demo;

/**
 * 
* @ClassName: WitherStringBuilder
* @Description: TODO(这里用一句话描述这个类的作用)
* @author shinian
* @date 2017年7月3日 上午11:43:37
*
 */
public class WitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }
}
