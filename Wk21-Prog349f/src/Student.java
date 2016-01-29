/**
 * An immutable student class.
 * @author Wesley Rogers
 *
 */
public class Student {
    private final String name;
    private final int firstQuiz;
    private final int secondQuiz;
    private final int midterm;
    private final int finalExam;
    
    /**
     * Creates a student object.
     * @param name        The name of the student.
     * @param firstQuiz   Their grade on the first quiz.
     * @param secondQuiz  Their grade on the second quiz.
     * @param midterm     Their grade on the midterm.
     * @param finalExam   Their grade on the Final Exam.
     */
    public Student(String name, int firstQuiz, int secondQuiz, int midterm, int finalExam){
        this.name = name;
        this.firstQuiz = firstQuiz;
        this.secondQuiz = secondQuiz;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }
    
    /**
     * Gets the name of the Student
     * @return the name of the student
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets the grade on the first quiz.
     * @return the grade on the first quiz.
     */
    public int getFirstQuiz(){
        return firstQuiz;
    }
    
    /**
     * Gets the grade on the second quiz.
     * @return the grade on the second quiz.
     */
    public int getSecondQuiz(){
        return secondQuiz;
    }
    
    /**
     * Gets the grade on the midterm.
     * @return the midterm grade.
     */
    public int getMidterm(){
        return midterm;
    }
    
    /**
     * Gets the grade on the final exam.
     * @return the final exam grade.
     */
    public int getFinalExam(){
        return finalExam;
    }
    
    /**
     * Gets the numeric grade of the student.
     * @return the numeric grade of the student.
     */
    public double getNumGrade(){
        double grade = (firstQuiz + secondQuiz) * 5; //The first 25%, divied by 2 and multiplied by ten to be in the correct order of magnitude.
        grade = (grade + midterm) / 2; //Add in the midterm, average the two. 50%.
        grade = (grade + finalExam) / 2; //Add in the last 50% and average.
        return grade;
    }
    
    /**
     * Gets the letter grade of the student.
     * @return the letter grade of the student.
     */
    public char getLetterGrade(){
        double grade = this.getNumGrade();
        
        if (grade >= 90){
            return 'A';
        } else if (grade >= 80){
            return 'B';
        } else if (grade >= 70){
            return 'C';
        } else if (grade >= 60){
            return 'D';
        } else {
            return 'F'; //Oh no!
        }
        
    }
    
}
