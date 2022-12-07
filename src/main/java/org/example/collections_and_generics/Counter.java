package org.example.collections_and_generics;

public class Counter<T extends Number> {
    T t;
        Counter(T t){
        this.t=t;
    }
    public void print(){
        System.out.println(t);
    }
}
