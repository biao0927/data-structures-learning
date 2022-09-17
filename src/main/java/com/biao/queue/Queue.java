package com.biao.queue;

/**
 * 队列。
 */
public interface Queue {
    /**
     * 队列是否为空。
     * @return 队列为空返回true
     */
    boolean isEmpty();

    /**
     * 队列是否已满。
     * @return 队列已满返回true
     */
    boolean isFull();

    /**
     * 向队列里面添加数据。
     * @param value 添加的值
     */
    void addQueue(int value);

    /**
     * 从队列里面获取数据。
     * @return 获取的值。
     */
    int getQueue();

    /**
     * 获取队列头部的值，不会出队列。
     * @return 队列头部值
     */
    int getHead();

}
