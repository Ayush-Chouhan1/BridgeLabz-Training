package com.sorting.eduresult;

public class Student {
	
	private int roll;
	private String name;
	 double marks;
	
   public Student(int roll, String name, double marks) {
	   setRoll(roll);
	   this.name = name;
	   this.marks = marks;
   }
   
   public void setRoll(int roll) {
	   this.roll = roll;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public void setMarks(double marks) {
	   this.marks = marks;
   }
   
   @Override
   public String toString() {
	   return "\n Roll number - " + roll +" Name - "+ name +" Marks - "+ marks;
   }
   

}
