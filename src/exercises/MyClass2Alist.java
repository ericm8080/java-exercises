package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ericmueller on 6/6/17.
 *
 * Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */
public class MyClass2Alist {

    static int myReturnEvenSum(ArrayList<Integer> nums){
        int sumOfEvens = 0;
        for(int number:nums) {
            if(number % 2 == 0){
                sumOfEvens += number;
            }
        }
        return sumOfEvens;
    }
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        int[] numbers = {1, 2, 6, 9, 10, 14, 17, 20, 24, 42, 45, 85, 12};
        ArrayList<Integer> bunchOfNums = new ArrayList<>();
        for (int a:numbers) {
            bunchOfNums.add(a);
        }
        int sum = myReturnEvenSum(bunchOfNums);
        long t2 = System.currentTimeMillis();
            System.out.println("Total of even numbers: " + sum);
            System.out.println(t2 - t1);

        //

    }
}
