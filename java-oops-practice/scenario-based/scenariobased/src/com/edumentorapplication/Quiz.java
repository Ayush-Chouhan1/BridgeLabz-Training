package com.edumentorapplication;

public class Quiz {

    private String[] questions;

    private final int[] correctAnswers;

    private int score;

    public Quiz(String[] questions, int[] correctAnswers) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
    }

    public Quiz(String[] questions, int[] correctAnswers, boolean isHard) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        if (isHard) {
            System.out.println("Hard level quiz created");
        }
    }

    public void submitQuiz(int[] userAnswers) {
        score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            score += (userAnswers[i] == correctAnswers[i]) ? 1 : 0;
        }
    }

    public double getPercentage() {
        return (score * 100.0) / correctAnswers.length; 
    }
}
