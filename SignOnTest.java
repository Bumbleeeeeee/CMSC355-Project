import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SignOnTest 
{
    /**
     * Logging in works as expected
     * 
     * Preconditins: 
     *      The user is on the login screen
     *      Defined account is already created
     * Defined Fields:
     *      Username: 'userName'
     *      Password: 'Password123'
     * Expected Result:
     *      User is properly logged on
     */     
    @Test
    public void TC01_LogOnGeneral()
    {
        
    }
    
    /**
     * Checks that username field must be filled
     * 
     * Preconditions:
     *      The user is on the login screen
     * Defined Fields:
     *      Password: '12345'
     * Expected Result:
     *      Error is thrown, username is required
     */
    @Test
    public void TC02_UserFilled()
    {
        String password = "12345";
        
        SignInPage test = new SignInPage("", password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { test.attemptLogin(); } );
        
        assertEquals("Username field must be filled", exception.getMessage());
    }
    
    /**
     * Checks that password field must be filled
     * 
     * Preconditions:
     *      The user is on the login screen
     * Defined Fields:
     *      Username: 'test'
     * Expected Result:
     *      Error is thrown, password is required
     */
    @Test
    public void TC03_PassFilled()
    {
        String username = "test";
        
        SignInPage test = new SignInPage(username, "");
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { test.attemptLogin(); } );
        
        assertEquals("Password field must be filled", exception.getMessage());
    }
    
    /**
     * Checks new username cannot be identical to existing username
     * 
     * Preconditions:
     *      The user is on the sign up page
     *      A user named 'test' already exists
     * Defined Fields:
     *      Username: 'test'
     *      Password: 67890
     * Expected Result:
     *      Error is thrown, username exists
     */
    @Test
    public void TC04_ExistingUser()
    {
        String username = "test";
        
        String password1 = "12345";
        String password2 = "67890";
        
        SignUpPage test1 = new SignUpPage(username, password1, password1);
        assertDoesNotThrow( () -> test1.attemptLogin() );
        
        SignUpPage test2 = new SignUpPage(username, password2, password2);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test2.attemptLogin() );
        
        assertEquals("Username already exists", exception.getMessage());
    }
    
    /**
     * Checks that “New Password” and “Same Password” fields match
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: 'test'
     *      Password 1: '12345'
     *      Password 2: '67890'
     * Expected Result:
     *      Error is thrown, passwords do not match
     */
    @Test
    public void TC05_PassMatch()
    {
        String username = "test1";
        
        String password1 = "12345";
        String password2 = "67890";
        
        SignUpPage test1 = new SignUpPage(username, password1, password2);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Passwords must match", exception.getMessage());
    }
    
    /**
     * Check username maximum characters
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: test123456.test123456.
     *      Password: '12345'
     * Expected Result:
     *      Error is thrown, username is too long
     */
    @Test
    public void TC06_UserMaxChars()
    {
        String username = "test123456.test123456.";
        String password = "12345";
        
        SignUpPage test1 = new SignUpPage(username, password, password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Username is too long", exception.getMessage());
    }
    
    /**
     * Check password maximum characters
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: 'test'
     *      Password: '12345678901234567890123456789012345678901234567890!'
     * Expected Result:
     *      Error is thrown, password is too long
     */
    @Test
    public void TC07_PassMaxChars()
    {
        String username = "test";
        String password = "12345678901234567890123456789012345678901234567890!";
        
        SignUpPage test1 = new SignUpPage(username, password, password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Password is too long", exception.getMessage());
    }
    
    /**
     * Checks unconventional or invisible characters are disallowed for username
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: '         ‌‍‎‏‪ ⁤⁣⁡'
     *      Password: '12345'
     * Expected Result:
     *      Error is thrown, Username contains invalid characters
     */
    @Test
    public void TC08_UserIllegalChars()
    {
        String username = "         ‌‍‎‏‪ ⁤⁣⁡";
        String password = "12345";
        
        SignUpPage test1 = new SignUpPage(username, password, password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Username contains invalid characters", exception.getMessage());
    }
    
    /**
     * Checks unconventional or invisible characters are disallowed for password
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: 'test'
     *      Password: '         ‌‍‎‏‪ ⁤⁣⁡'
     * Expected Result:
     *      Error is thrown, Password contains invalid characters
     */
    @Test
    public void TC09_PassIllegalChars()
    {
        String username = "test2";
        String password = "         ‌‍‎‏‪ ⁤⁣⁡";
        
        SignUpPage test1 = new SignUpPage(username, password, password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Password contains invalid characters", exception.getMessage());
    }
    
    /**
     * Checks usernames fulfill community guidelines on language
     * 
     * Preconditions:
     *      The user is on the sign up screen
     * Defined Fields:
     *      Username: fuck
     *      Password: 12345
     * Expected Result:
     *      Error is thrown, Username must follow community guidelines
     */
    @Test
    public void TC10_Guidelines()
    {
        String username = "fuck";
        String password = "12345";
        
        SignUpPage test1 = new SignUpPage(username, password, password);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test1.attemptLogin() );
        
        assertEquals("Username contains filtered words", exception.getMessage());
    }
}
