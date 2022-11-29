package org.example.thread_multithread;

public class SynchronizationDemo {
    public static void main(String[] args){
        MathUtils obj=new MathUtils();

        Thread1 thread1=new Thread1(obj);
        Thread thread2=new Thread(new Thread2(obj));
        thread1.start();
        thread2.start();

    }
}
