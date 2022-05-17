package bridgelabz;
import bridgelabz.InvalidEmailException;
import bridgelabz.InvalidFirstNameException;
import bridgelabz.InvalidLastNameException;
import bridgelabz.InvalidPasswordException;
import bridgelabz.InvalidPhoneNumberException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
interface UserValidate {
    boolean validate(String message) throws InvalidFirstNameException;
 }
interface UserValidate1 {
    boolean validate1(String message) throws InvalidLastNameException;
}
interface UserValidate2 {
    boolean validate2(String message) throws InvalidEmailException;
}
interface UserValidate3{
    boolean validate3(String message) throws InvalidPasswordException;
}
interface UserValidate4{
    boolean validate4(String message) throws InvalidPhoneNumberException;
 }
public class UserRegistration {

    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters and throws custom exception if not valid
     * @param firstName is used for comparing with regex
     */
    UserValidate userValidate = firstName -> {
        if (firstName == null) {
            throw new InvalidFirstNameException("Null Pointer Exception");
        } else if (firstName.length() == 0) {
            throw new InvalidFirstNameException("Empty Exception ");
        }
        System.out.println();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        if (!matcher.matches()) {
            throw new InvalidFirstNameException("\n Invalid firstName.....firstName should start with a Cap and should have minimum 3 chars \n");
        } else return true;
    };
    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters and throws custom exception if not valid
     * @param lastName is used for comparing with regex
     */
    UserValidate1 userValidate1 = lastName -> {
        if (lastName == null) {
            throw new InvalidLastNameException("Null Pointer Exception");
        } else if (lastName.length() == 0) {
            throw new InvalidLastNameException("Empty Exception ");
        }
        System.out.println();
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (!matcher.matches()) {
            throw new InvalidLastNameException("\n Invalid LastName.....LastName should start with a Cap and should have minimum 3 chars \n");
        } else return true;
    };
    UserValidate2 userValidate2 = email -> {
        if (email == null) {
            throw new InvalidEmailException("Null Pointer Exception");
        } else if (email.length() == 0) {
            throw new InvalidEmailException("Empty Exception ");
        }
        System.out.println();
        Pattern pattern = Pattern.compile("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("\n Invalid Email.....enter a valid email - E.g. abc.xyz@bl.co.in \n Email has 3 mandatory parts \n" +
                    " (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions  \n");
        } else return true;
    };
    /**
     * Method to check if the password is valid or not and throws custom exception if not valid
     * @param passcode takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    UserValidate3 userValidate3 = Password -> {
        if (Password == null) {
            throw new InvalidPasswordException("Null Pointer Exception");
        } else if (Password.length() == 0) {
            throw new InvalidPasswordException("Empty Exception ");
        }
        System.out.println();
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");
        Matcher matcher = pattern.matcher(Password);
        if (!matcher.matches()) {
            throw new InvalidPasswordException("\n Invalid Password.....Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character  \n");
        } else return true;
    };
    /**
     * This method checks if the entered number is valid or not and throws custom exception if not valid
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
        UserValidate4 userValidate4 = PhoneNumber -> {
            if (PhoneNumber == null) {
                throw new InvalidPhoneNumberException("Null Pointer Exception");
            } else if (PhoneNumber.length() == 0) {
                throw new InvalidPhoneNumberException("Empty Exception ");
            }
            System.out.println();
            Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
            Matcher matcher = pattern.matcher(PhoneNumber);
            if (!matcher.matches()) {
                throw new InvalidPhoneNumberException("\n Invalid PhoneNo.....PhoneNo should start with country code followed by space and 10 digit number \n");
            } else return true;
        };
    }

