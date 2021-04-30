package com.company;

public class InstructorManager extends UserManager{
    @Override
    public void editProfile(User user) {
        super.editProfile(user);
    }
    public void addUser(User user){
        System.out.println("Öğrenci eklendi kodları");
    }
    public void deleteUser(User user){
        System.out.println("Öğrenci çıkarıldı kodları");
    }
    public void updateUser(User user){
        System.out.println("Öğrenci güncellendi kodları");
    }
    public void listUsers(Student[] students){
        for (Student student : students){
            System.out.println(student.getName());
            System.out.println(student.getLastName());
            System.out.println(student.getEmail());
            System.out.println(student.getChooseLesson());
            System.out.println("**********************");
        }
    }
}