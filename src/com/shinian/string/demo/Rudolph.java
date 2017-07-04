package com.shinian.string.demo;

public class Rudolph {

    public static void main(String[] args) {
        for (String pattern : new String[] { "Rudolph", "[rR]udolph","R.*" }) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
