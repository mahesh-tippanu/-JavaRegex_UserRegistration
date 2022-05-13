package bridgelabz;
import bridgelabz.*;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    @Test
    public void happyFirstName() {
        try {
            Assert.assertTrue(UserRegistration.checkFirstName("Mahesh"));
            System.out.println("FirstName is valid \n");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyLastName() {
        try {
            Assert.assertTrue(UserRegistration.checkLastName("TipPanu"));
            System.out.println("LastName is valid \n");
        }
        catch (InvalidNameException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyNumber() {
        try {
            Assert.assertTrue(UserRegistration.checkNumber("91 6303186275"));
            System.out.println("PhoneNo is valid \n");
        }
        catch (InvalidPhoneNumberException e) {
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyPassword() {
        try {
            Assert.assertTrue(UserRegistration.checkPassword("^&^%$#$jdnHkj8"));
            System.out.println("Password is valid \n");
        }
        catch (InvalidPasswordException e){
            System.out.println("A problem occurred: " + e);
        }
    }
    @Test
    public void happyEmail() {
        try {
            Assert.assertTrue(UserRegistration.checkEmail("mahesh..2929@gmail.com"));
            System.out.println("Email is valid \n");
        }
        catch (InvalidEmailException e){
            System.out.println("A problem occurred: " + e);
        }
    }
}