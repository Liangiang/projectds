package com.ex.project.controller;

public class test {
    public static void main(String[] args) {
        //控制行
        System.out.println("===============");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("=");
            }
            for (int m = 0; m <= i; m++) {
                System.out.print("+");
            }
            for (int k = 0; k < i; k++) {//建立3号图形
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============");
    }
}
