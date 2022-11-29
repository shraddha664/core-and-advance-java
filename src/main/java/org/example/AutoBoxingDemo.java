package org.example;

public class AutoBoxingDemo {
    public static  void  main(String[] args){
        int i=10;
//        Autobox
        Integer iObj=Integer.valueOf(i);
        System.out.println("value of object integer"+iObj);

//        auto-unbox
        int i1=iObj;
        System.out.println("value of i1:"+i1);

        Character charObj='a';
        char ch=charObj;
        System.out.println("character is:"+ch);
        System.out.println("character is:"+charObj);
    }
}
