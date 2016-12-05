import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cm63 on 05/12/16.
 */
public class PasswordCheckerTest {

    @Test
    public void passCheckLength(){
        boolean testTrue = PasswordChecker.checkLength("Pa55-word");
        assertTrue("password requires more characters.", testTrue);
    }

    @Test
    public void failCheckLength(){
        boolean testFalse = PasswordChecker.checkLength("pasword");
        assertFalse("password meets the minimum character requirement.", testFalse);
    }

    @Test
    public void passCheckDigits(){
        boolean testTrue = PasswordChecker.checkDigits("Pa55-word");
        assertTrue("password requires more digits.", testTrue);
    }

    @Test
    public void failCheckDigits(){
        boolean testFalse = PasswordChecker.checkDigits("pasword");
        assertFalse("password meets the minimum digit requirement.", testFalse);
    }

    @Test
    public void passCheckUppercase(){
        boolean testTrue = PasswordChecker.checkUppercase("Pa55-word");
        assertTrue("password requires at least one uppercase character.", testTrue);
    }

    @Test
    public void failCheckUppercase(){
        boolean testFalse = PasswordChecker.checkUppercase("pasword");
        assertFalse("password meets the minimum uppercase character requirement.", testFalse);
    }

    @Test
    public void passCheckSymbol() {
        boolean testTrue = PasswordChecker.checkSymbol("Pa55-word");
        assertTrue("password requires at least one non-alphanumeric character.", testTrue);
    }

    @Test
    public void failCheckSymbol(){
        boolean testFalse = PasswordChecker.checkSymbol("pasword");
        assertFalse("password meets the minimum non-alphanumeric character requirement.", testFalse);
    }
}