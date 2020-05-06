package com.floreo.bbah.problems_set;

public class OneSum {

    public static void main(String[] args) {
        System.out.println(sum(3,2,3));
    }

    public static int sum(int a, int b, int c) {
        if(a == b) {
            if(a == c)
                return 0;
            return c;
        }
        if(a == c)
            return b;
        if(b == c)
            return a;
        return (a + b + c);
    }


}
