package bridgelabz;
import bridgelabz.InvalidEmailException;
import bridgelabz.InvalidNameException;
import bridgelabz.InvalidPasswordException;
import bridgelabz.InvalidPhoneNumberException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters and throws custom exception if not valid
     * @param firstName is used for comparing with regex
     */
    static boolean checkFirstName(String firstName) throws InvalidNameException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        if (!matcher.matches()) {
            throw new InvalidNameException("\n Invalid firstName.....firstName should start with a Cap and should have minimum 3 chars \n");
        } else return true;
    }
    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters and throws custom exception if not valid
     * @param lastName is used for comparing with regex
     */
    public static boolean checkLastName(String lastName) throws InvalidNameException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (!matcher.matches()) {
            throw new InvalidNameException("\n Invalid LastName.....LastName should start with a Cap and should have minimum 3 chars \n");
        } else return true;
    }
    /**
     * This method checks if the entered number is valid or not and throws custom exception if not valid
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public static boolean checkNumber(String Number) throws InvalidPhoneNumberException {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(Number);
        if (!matcher.matches()) {
            throw new InvalidPhoneNumberException("\n Invalid PhoneNo.....PhoneNo should start with country code followed by space and 10 digit number \n");
        } else return true;
    }
    /**
     * Method to check if the password is valid or not and throws custom exception if not valid
     * @param passcode takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public static boolean checkPassword(String passcode) throws InvalidPasswordException {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");
        Matcher matcher = pattern.matcher(passcode);
        if (!matcher.matches()) {
            throw new InvalidPasswordException("\n Invalid Password.....Password should Contain min 8 chars with at least: 1 capital letter, 1 numeric and exactly 1 special character  \n");
        } else return true;
    }
    public static boolean checkEmail(String email) throws InvalidEmailException {
        Pattern pattern = Pattern.compile("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("\n Invalid Email.....enter a valid email - E.g. abc.xyz@bl.co.in \n Email has 3 mandatory parts \n" +
                    " (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions  \n");
        } else return true;
    }
        public static void main(String[] args) {
            try {
                checkFirstName("Mahesh");
                System.out.println("First Name is valid");
            }
            catch (InvalidNameException e){
                System.out.println("A problem occurred: " + e);
            }
            try {
                checkEmail("mahesh..2929@gmail.com");
                System.out.println("Email is valid");
            }
            catch (InvalidEmailException e){
                System.out.println("A problem occurred: " +e);
            }
        }
    }


