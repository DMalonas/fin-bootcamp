package org.example;

public class Threads2c {
    public static void main(String[] args) {
        Thread t0 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException iex) {
                System.out.println("Thread was interrupted while sleeping");
            }
        });
        t0.start();

        // Interrupt the thread. Since the thread is sleeping, this will cause
        // the InterruptedException to be thrown in the thread
        t0.interrupt();
    }
}
