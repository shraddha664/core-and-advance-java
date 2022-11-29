package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
    public @interface MarkerAnnotation{

    class ThreadingDemo {
        public static void main(String[] args) {

    //int n=10;
    //for (int i=0;i<n;i++){
    ////    Initializing the thread of a thread class which extends thread
    //    Thread t1=new Thread1();
    //    t1.start();
    //
    ////    initializing the thread of a thread class which implements runnalbe
    ////    i.e by passing object of that thread class as an argument
    //    Thread t2=new Thread(new Thread2());
    //    t2.start();
    //}
        }
    }
}

