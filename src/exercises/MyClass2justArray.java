package exercises;

/**
 * Created by ericmueller on 6/6/17.
 * Create and initialize an array with the following values
 * in a single line: 1, 1, 2, 3, 5, 8. Then loop through the array and print out each value.
 */
public class MyClass2justArray {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,5,8};
        for(int a: numbers){
            System.out.print(" "+ a);
        }
        System.out.println();
    }
}
