package com.biao.queue;


import java.util.Scanner;

/**
 * 数组队列的测试类。
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        System.out.println("a : 增添数据， g: 获取数据，h:获取头部数据，e: 退出程序");
        boolean flag = true;
        char code;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            code = scanner.next().charAt(0);

            switch (code) {
                case 'a' -> {
                    System.out.println("请输入一个整数");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                }
                case 'g' -> System.out.printf("获取的数据为：%d", arrayQueue.getQueue());
                case 'h' -> System.out.printf("队列头部数据为：%d", arrayQueue.getHead());
                case 'e' -> {
                    scanner.close();
                    flag = false;
                }
            }
        }
        System.out.println("程序已退出！");
    }
}
