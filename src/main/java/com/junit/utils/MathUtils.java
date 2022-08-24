package com.junit.utils;

public class MathUtils {

    /*public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.add(1, 2));
    }*/

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double computeCircleArea(final double radius) {
        return Math.PI * radius * radius;
    }



}
