package com.hex.test.sort;

import java.util.ArrayList;

public class InsertSort {
    /**
     * 插入排序简单实现
     */
    public static void main(String[] args) {

        // 创建随机整数列表
        ArrayList<Integer> list = Utils.createList();
        // 输出原列表
        Utils.printList(list);
        // 输出分隔线
        Utils.separateLine();
        // InsertSort
        Utils.printList(sort(list));
    }

    private static ArrayList<Integer> sort(ArrayList<Integer> list) {
        /*
        插入排序
         */
        // 创建一个新列表保存排过序的元素
        ArrayList<Integer> l = new ArrayList<>();
        // 第一次将第一个元素当作最小的放进新列表中
        l.add(list.get(0));
        // 从第二个未排序的元素开始遍历
        for (int i = 1; i < list.size(); i++) {
            // 每次向新列表中添加一个空位
            l.add(null);
            // 从最后一个元素开始向前遍历, 依次与未排序的元素作比较(因为最后一个元素是null, 所以这里是size - 2)
            for (int j = l.size() - 2; j >= 0; j--) {
                // 如果未排序的元素小于已排序的元素, 将未排序的元素查到其前面
                if (list.get(i) < l.get(j)) {
                    l.set(j + 1, l.get(j));
                    l.set(j, list.get(i));
                } else {
                    // 如果未排序元素大于等于已排序的最后一个元素, 直接将其放置到已排序列表的最后, 并中断循环
                    l.set(l.size() - 1, list.get(i));
                    break;
                }
            }
        }
        return l;
    }
}
