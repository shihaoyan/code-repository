package com.shy.code3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 石皓岩
 * @create 2020-06-27 17:15
 * 描述：
 */
public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode == null) {
            return arrayList;
        }
        arrayList = printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        return arrayList;
    }

    /**
     * 这个更简单了直接调用Java的API。
     *
     * @param listNode
     * @return
     */
    private ArrayList<Integer> solution2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }

    /**
     * 思路是这样的，就是首先按顺序遍历，但是同时改变这个链表的结构，让他头变尾，尾变头，然后添加集合就行了。
     *
     * @param listNode
     * @return
     */
    private ArrayList<Integer> solution1(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode == null) {
            return arrayList;
        }
        ListNode p = listNode.next;
        listNode.next = null;
        ListNode s = listNode;
        ListNode temp = null;
        boolean flag = false;
        //首先应该遍历链表走到最后一位
        while (p != null) {
            if (!flag) {
                temp = p.next;
                p.next = s;
                s = p;
                p = temp;
                if (p == null) {
                    flag = true;
                    p = s;
                    arrayList.add(p.val);
                    p = p.next;
                }
            } else {
                arrayList.add(p.val);
                p = p.next;
            }
        }
        return arrayList;
    }
}
