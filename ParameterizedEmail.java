package bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ParameterizedEmail {

    public boolean isEmail(String email) {
        Pattern pattern = Pattern.compile("^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ParameterizedEmail email = new ParameterizedEmail();
        System.out.println(email.isEmail("abc@yahoo.com"));
        System.out.println(email.isEmail("abc-100@yahoo.com"));
        System.out.println(email.isEmail("abc.100@yahoo.com"));
        System.out.println(email.isEmail("abc111@abc.com"));
        System.out.println(email.isEmail("abc-100@abc.net"));
        System.out.println(email.isEmail("abc.100@abc.com.au"));
        System.out.println(email.isEmail("abc@1.com"));
        System.out.println(email.isEmail("abc@yahoo.com.com"));
        System.out.println(email.isEmail("abc+100@yahoo.com"));
        System.out.println(email.isEmail("abc"));
        System.out.println("-------------------------------------------------------");

       System.out.println(email.isEmail("abc"));
        System.out.println(email.isEmail("abc@.com.my"));
        System.out.println(email.isEmail("abc123@gmail.a"));
        System.out.println(email.isEmail("abc123@.com"));
        System.out.println(email.isEmail("abc123@.com.com"));
        System.out.println(email.isEmail(".abc@abc.com"));
        System.out.println(email.isEmail("abc()*@gmail.com"));
        System.out.println(email.isEmail("abc@%*.com"));
        System.out.println(email.isEmail("abc..2002@gmail.com"));
        System.out.println(email.isEmail("abc.@gmail.com"));
        System.out.println(email.isEmail("abc@abc@gmail.com"));
        System.out.println(email.isEmail("abc@gmail.com.1a"));
        System.out.println(email.isEmail("abc@gmail.com.aa.au"));
    }
}

