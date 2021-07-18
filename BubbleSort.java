package com.hex.test.sort;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    /**
     * 冒泡排序简单实现
     * @param args
     */
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
        }

        printList(list);

        System.out.println();
        System.out.println("-----------------");

        //bubble sort
        printList(sort(list));
    }

    private static void printList(ArrayList<Integer> list) {
        /*
        打印列表
         */
        list.stream().forEach(x -> {
            System.out.print(x + " ");
        });
    }

    static ArrayList<Integer> sort(ArrayList<Integer> a) {
        /*
        冒泡排序逻辑
         */
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    // 异或
                    a.set(j, a.get(j) ^ a.get(j + 1));
                    a.set(j + 1, a.get(j) ^ a.get(j + 1));
                    a.set(j, a.get(j) ^ a.get(j + 1));
                }
            }
        }
        return a;
    }
}
