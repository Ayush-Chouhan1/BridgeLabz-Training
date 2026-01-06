package com.edumentorapplication;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Ayush",
                "ayush@email.com",
                101,
                "FULL_TIME"
        );

        String[] questions = {
                "What is Java?",
                "What is OOP?"
        };

        int[] answers = {1, 2};

        Quiz quiz = new Quiz(questions, answers, true);

        int[] userAnswers = {1, 2};
        quiz.submitQuiz(userAnswers);

        System.out.println("Score Percentage: " + quiz.getPercentage());

        // Polymorphism
        learner.generateCertificate();
    }
}
