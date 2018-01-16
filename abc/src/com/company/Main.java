package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
     // int a=0; int b=9;
        Scanner ab=new Scanner(System.in);
       /* a=ab.nextInt();
        b=ab.nextInt();*/

        //System.out.println(add(a,b));
        String a=ab.next();
        String b=ab.next();

        System.out.println(add(Integer.valueOf(a)  , Integer.valueOf(b)));

    }
   static int add(int a,int b){
        return a+b;
    }
}
