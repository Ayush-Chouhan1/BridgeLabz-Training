import java.util.Scanner;
  public class averageMarks{
    public static void main(String [] args){
       String name = "sam"; 
       int marksMath = 94;
       int marksPhysics = 95;
       int marksChemistry = 96;
       int totalSubjects = 3;
       int totalMarks = marksMath + marksPhysics + marksChemistry;
        double averageMark =(double) totalMarks/totalSubjects;
        System.out.println("Sam’s average mark in PCM is " + averageMark);
       }
 }