package com.atguigu.springcloud.alibaba.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/6/11 13:07
 */
class MyTest {

    private volatile Map<String, Object> map = new HashMap<>();

    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key, Object value){
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在写入："+key);
            Thread.sleep(300);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName()+"正在完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }


    public void get(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"正在读取");
            Thread.sleep(300);
            Object result =  map.get(key);
            System.out.println(Thread.currentThread().getName()+"读取完成"+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }

    }
}


class Demo{
    /*public static void main(String[] args) {
        MyTest myTest = new MyTest();
        for (int i=0;i<5;i++) {
            final int tempInt = i;
            new Thread(() ->{
                myTest.put(tempInt+"", tempInt);
            },String.valueOf(i)).start();
        }


        for (int i=0;i<5;i++) {
            final int tempInt = i;
            new Thread(() ->{
                myTest.get(tempInt+"");
            },String.valueOf(i)).start();
        }
    }*/

    public static void main(String[] args) {

    }
}
