package org.example;

class Demo{
    int x;
    int y;
    Demo(){
        x=5;
        y=6;
    }
    void display(){
        System.out.println("value of x="+x+" and y="+y);
    }
}
public class DefaultConstructorDemo {
    public static void main(String[] args){
        Demo demo=new Demo();
        demo.display();

    }
}
