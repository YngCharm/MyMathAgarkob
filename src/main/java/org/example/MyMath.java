package org.example;

public class MyMath {
    static final double PI = 3.1415926535;
    public final double E = 2.7182818284;

    public double negative(double num) {
        return -num;
    }
    public int negative(int num) {
        return -num;
    }
    public long negative(long num) {
        return -num;
    }
    public float negative(float num) {
        return -num;
    }

    public double ctg(double catheterIsAdjacent, double oppositeСathet) {
        //в — катет, прилежащий углу А; а — противолежащий катет.
        double ctg = oppositeСathet / catheterIsAdjacent;
        return ctg;
    }

    public void arcctg() {

    }

    public double circumferenceLength(double radius) {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    public int range(int firstNum, int secNum) {
        for (int i = firstNum; i <= secNum; i++) {
            System.out.println(i);

        }
        return firstNum;
    }


}
