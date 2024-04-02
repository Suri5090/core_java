package com.multithread;

public class OddEvenThread extends Thread{

    private final int limit;
    private final boolean isEven;

    public OddEvenThread(int limit, boolean isEven) {
        this.limit = limit;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        synchronized (OddEvenThread.class){
            int start = isEven ? 2 : 1;
            for (int i = start; i <= limit; i += 2) {
                if (isEven) {
                    System.out.println("Thread -1: " +i);
                } else {
                    System.out.println("Thread -2: " +i);
                }
            }
        }
    }

    public static void main(String[] args) {

        int limit = 10; // Adjust the limit as needed

        // Creating threads
        Thread t1 = new OddEvenThread(limit, true);
        Thread t2 = new OddEvenThread(limit, false);

        // Starting threads
        t1.start();
        t2.start();
    }
}
