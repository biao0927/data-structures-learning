package com.biao.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        Solution s = new Solution();
        final int[] ints = s.reversePrint(l1);
        System.out.println(Arrays.toString(ints));
    }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        if(head == null){
            return new int[0];
        }
        ListNode node = head;
        List<Integer> arr = new ArrayList<>();

        while (node != null) {
            arr.add(node.val);
            node = node.next;
        }

        int[] revArr = new int[arr.size()];
        for (int j = arr.size(); j > 0; j--) {
            revArr[arr.size() - j] = arr.get(j-1);
        }
        return revArr;
    }
}
