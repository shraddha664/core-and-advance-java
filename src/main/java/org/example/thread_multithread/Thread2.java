package org.example.thread_multithread;

public  class Thread2 implements Runnable{

    MathUtils mu;

    public Thread2(MathUtils mu){
        this.mu=mu;
    }

    @Override
    public void run(){
        try{
            mu.getMultiples(3);
        }catch(Exception e){
            System.out.println("Exception is caught");

        }

    }
//    public void run(){
//        try{
// System.out.println("thread 2 is running");
//        }catch(Exception e){
//System.out.println("exception is caught");
//        }
//        }
}
