package bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;
import java.util.Arrays;
import java.util.Collection;
public class ParameterizedEmailTest {
    @RunWith(Parameterized.class)
    public class EmailValidationTest {
        private final String emailId;
        private final boolean expectedResult;
        private ParameterizedEmail email;
        @Before
        public void initializeClass() {
            email = new ParameterizedEmail();
        }
        public EmailValidationTest(String emailId, boolean expected) {
            this.emailId = emailId;
            this.expectedResult = expected;
        }
        @Parameters
        public  Collection<Object> emailIds()
        {
            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true}, {"abc111@yahoo.com", true},
                    {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
                    {"abc@1.com", true}, {"abc@yahoo.com.com", true},
                    {"abc+100@yahoo.com", true}, {"abc", false}, {"abc@.com.my", false},
                    {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                    {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false},
                    {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false},
                    {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}
            });
        }
        @Test
        public void testEmail() {
            Assert.assertEquals(expectedResult, email.isEmail(emailId));
        }
    }

}