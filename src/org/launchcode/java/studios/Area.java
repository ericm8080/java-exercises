package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Created by ericmueller on 6/1/17.
 */
public class Area {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double pi = Math.PI;
        float num = 0;
        do{
            System.out.print("Enter a radius: ");
            num = s.nextFloat();
            double answer = pi * num * num;
            System.out.printf("\n The area of a circle of radius %f is: %f",num,answer);
            System.out.println("");
        } while(num != 1);
    }
}
