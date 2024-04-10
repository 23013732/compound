package com.mycompany.compound;

import java.util.Scanner;
public class Compound{




    public static void main(String [] args){
    Scanner compound=new Scanner (System.in);
    
    double A,P,I,N;
    
    System.out.println("Enter the principle amount");
    P=compound.nextDouble();
            
    System.out.println("enter the annual interest");
    I=compound.nextDouble();
    
    System.out.println("enter the period");
    N=compound.nextDouble();
    
    A=P*Math.pow((1+I),N);
    
    System.out.println("the final amount"+A);
           
}
}


