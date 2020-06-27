package com.shy.code5;

import java.util.Stack;

/**
 * @author 石皓岩
 * @create 2020-06-27 17:37
 * 描述：
 */
public class Solution5 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        return stack1.remove(0);
    }


}
