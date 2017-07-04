package com.shinian.string.demo;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * 
 * @ClassName: Turtle
 * @Description: 格式化的类
 * @author shinian
 * @date 2017年7月4日 上午10:50:22
 * 
 */
public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s the turtle is at (%d,%d) \n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlia = System.out;
        Turtle shinian = new Turtle("shinian", new Formatter(System.err));
        Turtle ybr = new Turtle("ybr", new Formatter(outAlia));
        shinian.move(0, 0);
        ybr.move(0, 0);
        shinian.move(2, 3);
        ybr.move(2, 3);
        shinian.move(5, 6);
    }

}
