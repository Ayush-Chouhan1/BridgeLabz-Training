package com.generics.coursemanagementsystem;

	import java.util.ArrayList;
	import java.util.List;

	public class Main {

	    public static void main(String[] args) {

	        // creating courses
	        Course<ExamCourse> math =  new Course<>("Mathematics", new ExamCourse());

	        Course<AssignmentCourse> java = new Course<>("Java Programming", new AssignmentCourse());

	        Course<ResearchCourse> ai = new Course<>("Artificial Intelligence", new ResearchCourse());

	        // displaying individual courses
	        System.out.println("Course Details  ");
	        System.out.println(math);
	        System.out.println(java);
	        System.out.println(ai);

	        List<CourseType> courseTypes = new ArrayList<>();
	        courseTypes.add(new ExamCourse());
	        courseTypes.add(new AssignmentCourse());
	        courseTypes.add(new ResearchCourse());

	        System.out.println("\n Evaluation Types  ");
	        CourseUtil.displayCourses(courseTypes);
	    }
	}


