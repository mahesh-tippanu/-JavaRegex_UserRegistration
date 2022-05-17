package bridgelabz;
import bridgelabz.*;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void Given_message_when_Proper_happyFirstName() {

         // user defined exception
        try {
            Assert.assertTrue(userRegistration.userValidate.validate("Mahesh"));
            System.out.println("FirstName is valid \n");
        }
        catch (InvalidFirstNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void Given_message_when_proper_happyLastName() {
        // user defined exception
        try {
            Assert.assertTrue(userRegistration.userValidate1.validate1("Tippanu"));
            System.out.println("LastName is valid \n");
        }
        catch (InvalidLastNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void Given_message_when_Proper_happyEmail() {
        // user defined exception
        try {
            Assert.assertTrue(userRegistration.userValidate2.validate2("abcd@gmail.com"));
            System.out.println("Email is valid \n");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void Given_message_when_Proper_happyPassword() {
        // user defined exception
        try {
            Assert.assertTrue(userRegistration.userValidate3.validate3("^&^%$#$jdnHkj8"));
            System.out.println("Password is valid \n");
        }
        catch (InvalidPasswordException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void Given_message_when_Proper_happyNumber() {
        // user defined exception
        try {
            Assert.assertTrue(userRegistration.userValidate4.validate4("91 6303186275"));
            System.out.println("PhoneNo is valid \n");
        }
        catch (InvalidPhoneNumberException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
}