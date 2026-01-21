package com.generics.coursemanagementsystem;
import java.util.List;

abstract class CourseType {

    public abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    
    public String getEvaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    
    public String getEvaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType {
    
    public String getEvaluationType() {
        return "Research Based";
    }
}

class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course name=" + courseName + " , evaluation= " + courseType.getEvaluationType() ;
    }
}

class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courseTypes) {

        for (CourseType ct : courseTypes) {
            System.out.println("evaluation Type " + ct.getEvaluationType());
        }
    }
}
