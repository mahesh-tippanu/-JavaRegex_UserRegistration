package bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("enter 1 to check Firstname");
        System.out.println("enter 2 to check Lastname");
        System.out.println("enter 3 to check Email");
        System.out.println("enter 4 to check PhoneNumber");
        System.out.println("enter 5 to check Password");
        System.out.println("enter 6 to check uppercase password");
        System.out.println("enter 7 to check Numeric number password");
        Scanner sc = new Scanner(System.in);
        UserRegistration obj = new UserRegistration();
        int opition = sc.nextInt();
        switch (opition) {
            case 1:
                System.out.println(obj.isFirstName("mahesh"));
            case 2:
                System.out.println(obj.isLastName("tippanu"));
            case 3:
                System.out.println(obj.isEmail("abc@yahoo.com,abc-100@yahoo.com,abc.100@yahoo.com"));
            case 4:
                System.out.println(obj.isNumber("91 6303186275"));
            case 5:
                System.out.println(obj.password("maheshtp"));
            case 6:
                System.out.println(obj.password("Maheshtp"));
            case 7:
                System.out.println(obj.password("Mahesh8"));
            default:
                System.out.println("enter choice is invalid");
        }
    }
}

