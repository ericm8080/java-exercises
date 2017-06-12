package exercises;
//package org.launchcode.java.demos.java4python;
/**
 * Created by ericmueller on 6/11/17.
 * similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
 * instead of names and grades. In this case, however, the keys should be integers (the IDs) and the values
 * should be strings (the names). Modify the roster printing code accordingly.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 Eric note that while we don't do so in this example, we may also access HashMap elements using the get method.
 If we had a key/value pair of "jesse"/4.0 in the students map, we could access
 the grade with Double jesseGrade = students.get("jesse").
 */
public class GradebookHashMap2 {

            public static void main(String[] args) {

                HashMap<Integer, String> students = new HashMap<>();
                Scanner in = new Scanner(System.in);
                String newStudent;

                System.out.println("Enter your students (or ENTER to finish):");

                // Get student names and grades
                do {

                    System.out.print("Student: ");
                    newStudent = in.nextLine();

                    if (!newStudent.equals("")) {
                        System.out.print("ID Number: ");
                        Integer newIDNum = in.nextInt();  // Change Double newGrade to Integer newIDNum
                        students.put(newIDNum, newStudent);

                        // Read in the newline before looping back
                        in.nextLine();
                    }

                } while(!newStudent.equals(""));

                // Print class roster
                System.out.println("\nClass roster:");
                //double sum = 0.0;

                for (Map.Entry<Integer, String> student : students.entrySet()) {
                    System.out.println(student.getKey() + " (" + student.getValue() + ")");
                    //sum += student.getValue();
                }

                //double avg = sum / students.size();
                //System.out.println("Average grade: " + avg);
            }
}
