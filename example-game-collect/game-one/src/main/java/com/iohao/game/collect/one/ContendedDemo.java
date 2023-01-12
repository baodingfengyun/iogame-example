package com.iohao.game.collect.one;

/**
 * 使用@Contended来保证被标识的字段或类不与其他字段出现内存竞争
 */
public class ContendedDemo {

    public volatile long x;
    public volatile long y;

    public static void main(String[] args) throws InterruptedException {

        ContendedDemo demo = new ContendedDemo();

        Thread thread1 = new Thread(() -> {
           for (int i = 0; i < 1_0000_0000L; i++) {
               demo.x = i;
           }
        });

        Thread thread2 = new Thread(() -> {
           for (int i = 0; i < 1_0000_0000L; i++) {
               demo.y = i;
           }
        });

        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(System.currentTimeMillis() - start);
    }
}
