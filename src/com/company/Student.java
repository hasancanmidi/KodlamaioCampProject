package com.company;

import java.util.Scanner;

public class Student extends User{
    private String address;
    private String chooseLesson;

    public Student(String name, String lastName, String email, String password) {
        super(name, lastName, email, password);
        this.address = address;
        this.chooseLesson = setChooseLesson();
        //System.out.println("Lesson : " + this.chooseLesson);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("LESSON: " + this.chooseLesson);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChooseLesson() {
        System.out.print("Lesson : ");
        return chooseLesson;
    }

    public String setChooseLesson() {
        System.out.print("New student: "+ getName() + " LESSON CODES\n1 C#\n2 JAVA\n3 BASİC KNOWLEDGE\nEnter department code : ");
        Scanner scanner = new Scanner(System.in);
        int lessonChoice = scanner.nextInt();
        if (lessonChoice == 1){
            return "C#";
        }
        else if (lessonChoice == 2){
            return "JAVA";
        }
        else if(lessonChoice == 3){
            return "BASİC KNOWLEDGE";
        }
        else {
            return " ";
        }
    }
}
