package com.feng.hello;

/**
 * Created by zhouliang on 2016/12/11.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("feng,hello world.ok123789");

        for (int i = 0; i < 128; i++) {
            System.out.print(i + ": " + (char) i + "   ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("end.");
    }

}
