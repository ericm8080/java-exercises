package exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ericmueller on 6/6/17.
 * Write a static method to print out each word in a list that has exactly 5 letters.
 */
public class MyClass2Strings {
    // fields
    // methods
    public static void printWordsWith5letters(ArrayList<String> myList){
        for(String word: myList){
            if(word.length() == 5){
                System.out.println(word);
            }
        }

    }
    // main method
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String[] w = {"cat", "dog", "lizard", "whale", "snake", "chipmunk", "birds"};
        Collections.addAll(words, w);
        printWordsWith5letters(words);
        System.out.println("Completed Task");
    }
    // this program works
    // this program works twice
}
