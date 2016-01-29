import java.util.ArrayList;
/* Holy crap I overdid this.*/
/**
 * A class (literally!) that calculates everyone's final grades.
 * @author Wesley Rogers
 *
 */
public class FinalGrades {
    private ArrayList<Student> students = new ArrayList<Student>(); //This makes everything easier to keep track of.
    
    /**
     * Creates a FinalGrades object and adds Student s to it.
     * @param s The student to be added.
     */
    public FinalGrades(Student s){
        students.add(s);
    }
    
    /**
     * Creates a FinalGrades object and adds all of the students in s to itself.
     * @param s
     */
    public FinalGrades(Student[] s){
        for (Student student : s){
            students.add(student);
        }
    }
    
    /**
     * Adds Dtudent s.
     * @param s  The student to be added.
     */
    public void addStudent(Student s){
        students.add(s);
    }
    
    /**
     * Adds a Student given all of the information about them.
     * @param name
     * @param firstQuiz
     * @param secondQuiz
     * @param midterm
     * @param finalExam
     */
    public void addStudent(String name, int firstQuiz, int secondQuiz, int midterm, int finalExam){
        students.add(new Student(name, firstQuiz, secondQuiz, midterm, finalExam));
    }
    
    /**
     * Gets the student in the given position
     * @param pos  The position to get the student from.
     * @return     The given student in the position provided.
     */
    public Student getStudent(int pos){
        return students.get(pos);
    }
    
    /**
     * Gets the final grade number of Student s.
     * @param s  The student to get a grade from.
     * @return   The numerical grade of the student
     */
    public double getFinalGradeNum(Student s){
        return s.getNumGrade();
    }
    
    /**
     * Gets the final grade number of the Student in the given position.
     * @param pos  The position to get the student from.
     * @return     The numerical grade of the student.
     */
    public double getFinalGradeNum(int pos){
        return getFinalGradeNum(students.get(pos));
    }
    
    /**
     * Returns the letter grade of the student, with >=90 being an A, >=80 being a B, >=70 being a C, >=60 being a D, and <60 being an F
     * @param s  The student to be graded.
     * @return   The grade of the student.
     */
    public char getLetterGrade(Student s){
        return s.getLetterGrade();
    }
    
    /**
     * Gets the letter grade from the student in the pos provided.
     * @param pos
     * @return
     */
    public char getLetterGrade(int pos){
        return getLetterGrade(students.get(pos));
    }
    
    /**
     * Removes the Student provided from the Grade documents
     * @param s The student object to be removed
     */
    public void remove(Student s){
        students.remove(s);
    }
    
    /**
     * Removes a student from the pos provided.
     * @param pos The position to remove a Student from.
     */
    public void remove(int pos){
        students.remove(pos);
    }
    
    @Override
    public String toString(){
        String out = "Name    Quiz 1 Quiz 2 Midterm Final Exam Final % Final Grade\n";
        for (int i=0; i<students.size(); i++){
            out +=  lss(students.get(i).getName(), 8, false) + lss(students.get(i).getFirstQuiz() + "", 6, true) + 
                    lss(students.get(i).getSecondQuiz() + "", 7, true) + 
                    lss(students.get(i).getMidterm() + "", 7, true) +
                    lss(students.get(i).getFinalExam() + "", 7, true) +
                    "      "+round(students.get(i).getNumGrade(), 1) +
                    lss(students.get(i).getLetterGrade() + "", 7, true) + "\n";
        }
        return out;
    }
    
    private static String lss(String string, int size, boolean isRightPadded){ //Limit String Size. Shortened for convenience.
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
    
    private static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
}
