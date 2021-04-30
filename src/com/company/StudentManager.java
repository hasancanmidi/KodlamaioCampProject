package com.company;

public class StudentManager extends UserManager{
    @Override
    public void editProfile(User user) {
        super.editProfile(user);
    }
    public void manageSubscriptions(){
        System.out.println("Üyelikleri ekle çıkar kodları");
    }
    public void addCardInformation(){
        System.out.println("Kart bilgileri ekleme değiştirme kodları");
    }
    public void contact(){
        System.out.println("Siteye mesaj gönderme alanın kodları");
    }
}
