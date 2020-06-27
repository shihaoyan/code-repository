package com.shy.code2;

/**
 * @author 石皓岩
 * @create 2020-06-27 17:05
 * 描述：直接调用Java的方法就行了，没啥难度。如果不用API的话 我们可以重新构建一个数组，然后通过两个索引，
 * 一个指向原数组，另一个指向新数组，然后一步一步赋值就行了。
 */
public class Solution2 {

    public String replaceSpace(StringBuffer str) {

        return solution1(str);

    }

    private String solution1(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }


}
