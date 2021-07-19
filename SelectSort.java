package com.hex.test.sort;

import java.util.ArrayList;

public class SelectSort {
    /**
     * 选择排序的简单实现
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = Utils.createList();
        //打印原始列表
        Utils.printList(list);
        //分割线
        Utils.separateLine();
        //SelectSort
        Utils.printList(sort(list));
    }

    private static ArrayList<Integer> sort(ArrayList<Integer> list) {
        /*
        选择排序逻辑
         */
        int min, tmp;
        //外层循环控制第一个没有排序过的位置
        for (int i = 0; i < list.size(); i++) {
            min = i;
            tmp = list.get(min);
            //内层循环寻找没有排序过的元素中的最小值
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j) < tmp) {
                    min = j;
                    tmp = list.get(min);
                }
            }
            //一轮比较完成后将最小值与第一个没有排序过的位置交换
             list.set(min, list.get(i));
            list.set(i, tmp);
        }

        return list;
    }

}
