package com.biao.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack;
    private Stack<Integer> queue;

    public CQueue() {
        this.stack = new Stack<>();
        this.queue = new Stack<>();
    }

    public void appendTail(int value) {
        this.stack.push(value);
    }

    public int deleteHead() {
        if(!this.queue.isEmpty()) return queue.pop();
        if(stack.isEmpty()) return -1;
        while(!stack.isEmpty()){
            queue.push(stack.pop());
        }
        return queue.pop();
    }
}
