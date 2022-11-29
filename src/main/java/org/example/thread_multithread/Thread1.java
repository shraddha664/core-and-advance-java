package org.example.thread_multithread;

public class Thread1 extends Thread {
    MathUtils mu;

    public Thread1(MathUtils mu){
        this.mu=mu;
    }

    @Override
    public void run() {
        try{
            mu.getMultiples(2);
        }catch (Exception e){
            System.out.println("exception raised"+e);
        }
    }

    //   @Override
//    public void run(){
//        try{
//            System.out.println("Thread1 is running");
//        }catch(Exception e){
//            System.out.println();
//            System.out.println("exception raised"+e);
//        }
//    }

}
