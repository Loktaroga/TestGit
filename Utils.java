package com.hex.test.sort;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

    public static void printList(ArrayList<Integer> list) {
        /*
        打印列表
         */
        list.stream().forEach(x -> {
            System.out.print(x + " ");
        });
    }

    public static ArrayList<Integer> createList() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
        }

        return list;
    }

    public static void separateLine() {
        System.out.println();
        System.out.println("-----------------------------");
    }

}
