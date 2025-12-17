public class PenDistribution{
 public static void main(String[] args){
   int numberOfStudents = 14;
   int numbersOfPens =3;
   int remaining = numberOfStudents % numbersOfPens;
   int penToDivide = numberOfStudents - remaining;
   penToDivide = penToDivide/numbersOfPens;
   System.out.println("The Pen Per Student is "+penToDivide + " and the remaining pen not distributed is "+ remaining);
    }
}
   