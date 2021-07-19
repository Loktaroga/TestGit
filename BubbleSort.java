package com.hex.test.sort;

import java.util.ArrayList;

public class BubbleSort {
    /**
     * 冒泡排序简单实现
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = Utils.createList();

        // 打印原始列表
        Utils.printList(list);

        // 分隔线
        Utils.separateLine();

        //bubble sort
        Utils.printList(sort(list));
    }


    static ArrayList<Integer> sort(ArrayList<Integer> a) {
        /*
        冒泡排序逻辑
         */
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    // 异或实现变量值的对换
                    a.set(j, a.get(j) ^ a.get(j + 1));
                    a.set(j + 1, a.get(j) ^ a.get(j + 1));
                    a.set(j, a.get(j) ^ a.get(j + 1));
                }
            }
        }
        return a;
    }
}
