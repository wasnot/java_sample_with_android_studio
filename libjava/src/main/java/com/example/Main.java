package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) throws Exception {

//        System.out.println("test");
//        abs();
        aaa();
    }

    static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strs = line.split(" ");
        List<String> stringList = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (String str : strs) {
            int i = stringList.indexOf(str);
            if (i >= 0) {
                integers.set(i, integers.get(i) + 1);
            } else {
                stringList.add(str);
                integers.add(1);
            }
        }
        int count = stringList.size();
        String out = "";
        for (int i = 0; i < count; i++) {
            out += stringList.get(i) + " " + integers.get(i) + "\n";
        }

        System.out.println(out);
    }

    static void abs() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int i = Integer.parseInt(line);
        System.out.println(Math.abs(i) + "");
    }

    static void aaa() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] args = line.split(" ");

        int sum = Integer.parseInt(args[0]);
        Integer[] nums = new Integer[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            nums[i - 1] = (Integer.parseInt(args[i]));
        }
        System.out.println(new SumCheck(sum, nums).canMakeSum());
    }


}
