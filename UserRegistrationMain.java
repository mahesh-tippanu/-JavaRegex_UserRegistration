package bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("enter 1 to check Firstname");
        System.out.println("enter 2 to check Lastname");
        System.out.println("enter 3 to check Email");
        System.out.println("enter 4 to check PhoneNumber");
        System.out.println("enter 5 to check Password");
        System.out.println("enter 6 to check Uppercase password");
        System.out.println("enter 7 to check Numeric number password");
        System.out.println("enter 8 to check At least one special character");
        Scanner sc = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();
        int opition = sc.nextInt();
        switch (opition) {
            case 1:
                System.out.println(obj.isFirstName("Mahesh"));
            case 2:
                System.out.println(obj.isLastName("TipPan"));
            case 3:
                System.out.println(obj.isEmail("mk@gmail.com"));
            case 4:
                System.out.println(obj.isNumber("91 6303186275"));
            case 5:
                System.out.println(obj.password("MaHeShTp"));
            case 6:
                System.out.println(obj.password("MaHeShTp"));
            case 7:
                System.out.println(obj.password("Mahesh8"));
            case 8:
                System.out.println(obj.password("Mahesh8*"));
            default:
                System.out.println("enter choice is invalid");
        }
    }
}

