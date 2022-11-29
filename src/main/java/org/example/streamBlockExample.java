package org.example;

class DemoStatic{
    static {
        System.out.println("this is static block");
    }

}
public class streamBlockExample {
    static {
        System.out.println("this is static block 2");
    }
    public static void main(String[] args){

        new DemoStatic();
        System.out.println("this is main method");
        new DemoStatic();//donot prints anything because static method is executed only
//        once when the class is loaded
    }

}

