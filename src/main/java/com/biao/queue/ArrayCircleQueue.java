package com.biao.queue;

/**
 * 数组环形队列。
 */
public class ArrayCircleQueue implements Queue {
    /**
     * 头部，初始值为0。
     */
    private int front = 0;
    /**
     * 尾部，初始值为0。
     */
    private int rear = 0;
    /**
     * 最大长度。
     */
    private final int maxSize;
    /**
     * 数据。
     */
    private final int[] queue;

    /**
     * 初始化环形队列。
     *
     * @param maxSize 队列最大长度。
     */
    public ArrayCircleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize ];
    }

    @Override
    public boolean isEmpty() {
        return this.rear == this.front;
    }

    @Override
    public boolean isFull() {
        return (this.rear + this.maxSize - this.front + 1) % maxSize == 0;
    }

    @Override
    public void addQueue(int value) {
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加！");
        }
        queue[this.rear] = value;
        this.rear = (this.rear + 1) % this.maxSize;
        System.out.println("添加数据成功！");
    }

    @Override
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法获取数据！");
        }
        int frontIndex = this.front;
        this.front = (this.front + 1) % this.maxSize;
        return queue[frontIndex];
    }

    @Override
    public int getHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法获取数据！");
        }
        return queue[this.front];
    }
}
