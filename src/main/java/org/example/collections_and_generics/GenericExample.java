package org.example.collections_and_generics;


import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
Counter<Integer>iCounter=new Counter<>(1);
iCounter.print();

Counter<Double>dCounter=new Counter<>(2.8);
dCounter.print();

//String cant be passed here as counter class has extended Number class
//        means only within the number range like integer,float,number and double
//        can be passed
//Counter<String>sCounter=new Counter<>("hello");
//sCounter.print();

        ArrayList<Integer>intList=new ArrayList<>();
        intList.add(1);

    }
}
