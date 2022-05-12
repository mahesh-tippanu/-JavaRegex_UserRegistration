package bridgelabz;
import org.junit.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
public class UserRegistrationTest {
    @Test
    public void isFirstName() {
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.isFirstName("Mahesh"));
        System.out.println();
    }
    @Test
    public void isLastName(){
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.isLastName("TipPanu"));
        System.out.println();
    }
    @Test
    public void isEmail(){
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.isEmail("abcd@gmail.com"));
        System.out.println();
    }
    @Test
    public void isNumber(){
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.isNumber("91 6303186275"));
        System.out.println();
    }
    @Test
    public void password(){
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.password("MaHeShTp"));
        System.out.println();
    }
    @Test
    public void password1() {
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.password("MaHeShTp"));
        System.out.println();
    }
    @Test
    public void password2() {
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.password("mahesh8"));
        System.out.println();
    }
    @Test
    public void password3() {
        UserRegistration obj = new UserRegistration();
        Assert.assertTrue(obj.password("mahesh8*"));
        System.out.println();
    }
}

