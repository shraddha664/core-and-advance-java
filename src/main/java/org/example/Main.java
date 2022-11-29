package org.example;

import java.io.*;
import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("hi");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        long num=sc.nextInt();
        int count=0;
        while(num>0){
            long rem=num%10;
            if(rem==0){
                count++;
            }
            num=num/10;
        }
        System.out.println("Number of zeros:"+count);



//        Employee e=new Employee();
//        e.setId(1);
//        e.setName("Serialization");
//
//        FileOutputStream fileOutputStream=new FileOutputStream("F:\\serialize.ser");
//      ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
//
//      objectOutputStream.writeObject(e);
//
//      objectOutputStream.close();
//      fileOutputStream.close();

//      Deserialization
//        FileInputStream fileInputStream=new FileInputStream("F:\\serialize.ser");
//        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//
//       Employee  reCreatedObj =(Employee)objectInputStream.readObject();
//        System.out.println("name is:"+reCreatedObj.getName());
//        objectInputStream.close();
//        fileOutputStream.close();

//        Student student=new Student("John",25,"23 east,california");
//
//        String filename="C:\\Users\\HP\\Desktop\\CoreJava(Simplilearn)";
//
//        FileOutputStream fileOut=null;
//        ObjectOutputStream objOut=null;
//        serialization
//        try{
//            fileOut=new FileOutputStream(filename);
//            objOut=new ObjectOutputStream(fileOut);
//            objOut.writeObject(student);
//            objOut.close();
//            fileOut.close();
//            System.out.println("object has been serialized:"+student);
//        }catch (IOException ex){
//            System.out.println("exception caught");
//        }

        //deserialzation
//        FileInputStream fileIn=null;
//        ObjectInputStream objIn=null;
//try {
//    fileIn=new FileInputStream(filename);
//    objIn=new ObjectInputStream(fileIn);
//    Student object=(Student) objIn.readObject();
//    System.out.println("object has been deserialized:"+object);
//    objIn.close();
//    fileIn.close();
//}catch (IOException ex){
//    System.out.println("exception is caught");
//
//}catch (ClassNotFoundException ex){
//    System.out.println("ClassNotFoundException"+"is caught");
//}
        //Color c1=Color.RED;
//
//        System.out.println("Red enum name:"+c1.name());
//        System.out.println("red enum value:"+c1.getValue());
//
//        for (Color color:Color.values()){
//            System.out.println("enum name:"+color);
//            System.out.println("ENUM value:"+color.getValue());
//        }


        //        Student saru=new Student("Shraddha",23,"Michigan");

//        System.out.println(saru.getAge());
//        System.out.println(saru.getName());
//        System.out.println(saru.getAddress());
//        saru.age=34;
//        System.out.println(saru.getAge());
//
//        Cuboid stdCuboid=new Cuboid(2,3,5);
//        System.out.println("Standard volume is :"+stdCuboid.volume());
//
//        Cuboid CuboidV2=new Cuboid(2,3);
//        System.out.println("Standard volume is :"+CuboidV2.volume());
//
//        Cuboid CuboidV3=new Cuboid(2);
//        System.out.println("Standard volume is :"+CuboidV3.volume());
//
//        Cuboid CuboidV4=new Cuboid();
//        System.out.println("Standard volume is :"+CuboidV4.volume());
//
//        List<Integer> numberList=new ArrayList<>();
//        numberList.add(10);
//        numberList.add(20);
//        numberList.add(30);

//        List<Integer>squareList=numberList.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println("List of squared numbers:"+squareList);


//       Set<Integer>squareSet=numberList.stream().map(x->x*x).collect(Collectors.toSet());
//        System.out.println("Set of squared numbers:"+squareSet);

//        List<String>languages=new ArrayList<>();
//        languages.add("php");
//        languages.add("java");
//        languages.add("js");

//        List<String>filterResult=languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//        System.out.println("Languages starting with p:"+filterResult);

//        List<String>sortedList=languages.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);
//
//        System.out.println("printing all the elements one by one");
//        sortedList.stream().forEach(y-> {
//            System.out.println("hey");
//            System.out.println("element is:"+y);
//        });

//        int sum=numberList.stream().reduce(0,(ans,i)->ans+i);
//        System.out.println("sum of all elements in the numberlist:"+sum);
//
//
//        MountainBike mBike=new MountainBike(20,10,10);
//        System.out.println("Mountain bike info: gear:"+mBike.getGear()+"speed"+mBike.getSpeed()+"seatheight:"+mBike.getSeatHeight());
//    mBike.applyBrake(2);
//
//
//        System.out.println("final speed after brake:"+mBike.getSpeed());
//        mBike.speedUp(1);
//        System.out.println("final speed after speeding up:"+mBike.getSpeed());
//   mBike.canDrive();
//mBike.canRotateTwoWheels();
//
//
//MethodOverloadingDemo over=new MethodOverloadingDemo();
//        System.out.println("First value:"+over.multiply(2,3));
//        System.out.println("second value:"+over.multiply(1,2,3));

    }



    }
