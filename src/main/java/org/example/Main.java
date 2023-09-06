package org.example;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.negative(10);
        System.out.println(myMath.negative(10));
        myMath.ctg(10, 6);
        System.out.println(myMath.ctg(10, 6));
        myMath.circumferenceLength(10);
        System.out.println(myMath.circumferenceLength(10));
        myMath.range(-5, 5);
        System.out.println(" ");

    }
}