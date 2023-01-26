/*
 * Name: Kennedy Keyes
 * Date: March 23, 2021
 * Name of Program: Student.java
 * Description: This program will store student names and averages.
 */
package student;

/**
 *
 * @author codingken
 */
public class Student {
    private String name;
    private double average;
    
    // constuctor initializes instance variables
    public Student(String name, double average) {
        this.name = name;
        
        //validate that average is > 0.0 and <= 100.0; otherwise, keep instance
        // variable average's default value (0.0)
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average; // assign to instance variable
            }
        }
    }

    // sets the Student's name
    public void setName(String name) {
        this.name = name;
    }
    
    // retrieves the Student's name
    public String getName() {
        return name;
    }
    
    // sets the Student's average
    public void setAverage(double studentAverage) {
        // validate that average is > 0.0 and <= 100.0; otherwise, keep instance
        // varaiable average's current value
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average; // assign to instance variable
            }
                    
        }
    }
    
    // retrieves the Student's average
    public double getAverage() {
        return average;
    }
    
    // determines and returns the Student's letter grade
    public String getLetterGrade() {
        String letterGrade = ""; // intialized to empty String
        
        if (average >= 90.0) {
            letterGrade = "A";
        }
        else if (average >= 80.0) {
            letterGrade = "B";
        }
        else if (average >= 70.0) {
            letterGrade = "C";
        }
        else if (average >= 60.0) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        
        return letterGrade;
        
    }
}
