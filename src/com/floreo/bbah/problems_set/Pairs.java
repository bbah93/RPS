package com.floreo.bbah.problems_set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pairs {

    public static void main(String[] args) {
        String[] arr = {"man", "moon", "main"};
        System.out.println(pairs(arr));

    }

    public static HashMap<String, String> pairs(String[] strings) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            String tmp = strings[i];
            String first = String.valueOf(tmp.charAt(0));
            String last = String.valueOf(tmp.charAt(tmp.length() - 1));
            map.put(first, last);
        }

        return map;
    }


}
