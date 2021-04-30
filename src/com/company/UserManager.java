package com.company;

import java.util.Scanner;

public class UserManager {
    public void editProfile(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new name : ");
        String newName = scanner.nextLine();
        user.setName(newName);

        System.out.print("Enter your new last name : ");
        String newLastName = scanner.nextLine();
        user.setLastName(newLastName);

        System.out.print("Enter your new password : ");
        String newPassword = scanner.nextLine();
        user.setPassword(newPassword);
    }
}
