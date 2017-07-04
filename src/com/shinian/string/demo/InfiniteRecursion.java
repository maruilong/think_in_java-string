package com.shinian.string.demo;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        //error  return "当前的内存地址是:" + this;
        return "当前的内存地址是:" + super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
