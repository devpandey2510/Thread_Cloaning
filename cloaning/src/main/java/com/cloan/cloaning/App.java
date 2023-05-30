package com.cloan.cloaning;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )throws CloneNotSupportedException
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the employee name");
       String name = s.nextLine();
       System.out.println("Enter the employee id");
       String id = s.nextLine();
       employee obj1 = new employee(name,id);
       System.out.println("Diplay data of object1");
       System.out.println(obj1);
       System.out.println("hashcode of obj1="+obj1.hashCode());
       employee obj2 = obj1.clone();
       System.out.println("Diplay data of object2");
       System.out.println(obj2);
       System.out.println("hashcode of obj1="+obj2.hashCode());
    }
}
