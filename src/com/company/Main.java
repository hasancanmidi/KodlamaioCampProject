package com.company;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        Student student1 = new Student("Hasan Can","Midi","hasancanmidi@hotmail.com","6161");
        Student student2 = new Student("Mehmet","Can","mehmetcan@hotmail.com","6161");
        Student student3 = new Student("Yunus Emre","Şahin","karacasah@hotmail.com","6161");

        Student[] studentName = {student1,student2,student3};
        instructorManager.listUsers(studentName);



        Instructor instructor1 = new Instructor("Engin","Demiroğ","engindemiroğ@hotmail.com","0606",10.0);
        instructor1.showInfo();

        System.out.println("***********************************************");


        //Girilmiş öğrenci ve eğitmen bilgilerini değişmek için kullanılır

        /*
        studentManager.editProfile(student1);
        student1.showInfo();
        */


        //Tüm kodların çalıştıgını göstermek için hepsini yazdım.
    }
}
