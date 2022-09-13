package com.biao.queue;

/**
 * 使用数组模拟队列。
 */
public class ArrayQueue {
    /**
     * 队列前端。
     */
    private int front;
    /**
     * 队列后端。
     */
    private int rear;
    /**
     * 队列大小。
     */
    private final int maxSize;
    /**
     * 队列数据。
     */
    private final int[] queueData;

    /**
     * 初始化队列。
     *
     * @param maxSize 初始化队列大小
     */
    public ArrayQueue(int maxSize) {
        this.front = 0;
        this.rear = 0;
        this.maxSize = maxSize;
        this.queueData = new int[maxSize];
    }

    /**
     * 判断队列是否为空。
     *
     * @return true is empty,false is not empty
     */
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    /**
     * 判断队列是否已满。
     *
     * @return true is full.
     */
    public boolean isFull() {
        return this.rear == maxSize;
    }

    /**
     * 向队列里面增加数据。
     *
     * @param value 增加的值
     */
    public void addQueue(int value) {
        if (isFull()) {
            throw new RuntimeException("队列已满，增加失败！");
        }
        queueData[this.rear++] = value;
    }

    /**
     * 从队列里面获取数据。
     * @return 获取的数值
     */
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，获取数据失败！");
        }
        return queueData[front++];
    }

    /**
     * 获取队列头部的数据，不会出队列。
     * @return 头部数据的值。
     */
    public int getHead(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，获取头部数据失败！");
        }
        return queueData[front];
    }
}
