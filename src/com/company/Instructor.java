package com.company;

public class Instructor extends User{
    private double score;

    public Instructor(String name, String lastName, String email, String password, double score) {
        super(name, lastName, email, password);
        this.score = score;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("YOUR SCORE: " + score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}