package org.example;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID=1L;
    String name;
    int age;
    String address;

//Parameterized constructors
    public Student(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }


    //Getter and Setter Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public String getAddress() {
        return address;
    }


}
