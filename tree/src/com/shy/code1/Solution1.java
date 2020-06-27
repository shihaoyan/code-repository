package com.shy.code1;

/**
 * @author 石皓岩
 * @create 2020-06-27 16:03
 * 描述：
 */
public class Solution1 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}};
        Find(7, array);
    }

    /**
     * 根据数组的规则进行处理，拿到右上角或者左下角的元素
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target, int[][] array) {
        if (array.length <= 1) {
            return false;
        }
        // 首先我们这样分析，因为这个数组，无论是横纵都是递增的所有就有两个特殊值
        // 第一个就是右上角的值，这个值是每一行的最大值，所以我们就有办法了。
        int r = 0;
        int c = array[0].length - 1;
        while (r < array.length && c >= 0) {
            if (target == array[r][c]) {
                return true;
            } else if (target > array[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }

    /**
     * 解法一：其实就是暴力穷举，我们先拿到每一行的头元素和尾元素，然后进行每一行的比较
     *
     * @param target
     * @param array
     * @return
     */
    private static boolean solution1(int target, int[][] array) {
        if (array.length <= 1) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            // 拿到每一行的头元素和尾元素
            int start = 0;
            int end = array[i].length - 1;
            if (target == array[i][start] || target == array[i][end]) {
                return true;
            } else {
                // 开始查找是否在这里
                while (start++ <= end--) {
                    if (array[i][start] == target || array[i][end] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
