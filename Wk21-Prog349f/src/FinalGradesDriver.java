/*
    Program 349f Final Grades
    Wesley Rogers 
    1/29/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gets the class's averages using two classes. The doc didn't say how many I ahd to use, so I used two for readabilities sake.

    What I learned: Not much, but it was good practice. Documenting takes ages though.
    
    Difficulties: None.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinalGradesDriver {
    
    public static void main(String args[]) {
        Scanner input = null;
        try {
            input = new Scanner(new File("Prog349f.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
        
        Student[] students = { //Input data
                new Student("Bob", input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()),
                new Student("Bobette", input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()),
                new Student("Bobby", input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()),
                new Student("Linda", input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt())
        };
        
        /*Student[] students = { //My data
                new Student("Billy", 10, 8, 89, 95),
                new Student("Bob", 8, 7, 70, 99),
                new Student("Janice", 5, 7, 68, 90),
                new Student("Bobby", 10, 10, 100, 100),
                new Student("Nemo", 5, 9, 85, 97),
                new Student("Jill", 6, 8, 85, 90),
                new Student("Jack", 0, 0, 100, 100),
                new Student("Lauren", 5, 5, 50, 100),
                new Student("William", 3, 6, 90, 100),
                new Student("Jackson", 1, 1, 23, 57),
        };*/
        FinalGrades grades = new FinalGrades(students);
        System.out.println(grades);
    }
}
/* Provided Data
Name    Quiz 1 Quiz 2 Midterm Final Exam Final % Final Grade
Bob          8      7     89     94      88.0      B
Bobette      9      6     77     90      83.0      B
Bobby       10     10     65     88      85.3      B
Linda        7      5     80     81      75.5      C
*/

/* My data
Name    Quiz 1 Quiz 2 Midterm Final Exam Final % Final Grade
Billy       10      8     89     95      92.3      A
Bob          8      7     70     99      85.8      B
Janice       5      7     68     90      77.0      C
Bobby       10     10    100    100      100.0      A
Nemo         5      9     85     97      87.3      B
Jill         6      8     85     90      83.8      B
Jack         0      0    100    100      75.0      C
Lauren       5      5     50    100      75.0      C
William      3      6     90    100      83.8      B
Jackson      1      1     23     57      36.8      F
*/