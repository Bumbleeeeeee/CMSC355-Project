public class SignInPage implements SignOnInterface
{
    String username;
    String password;
    
    public SignInPage()
    {
        this.username = getUsername();
        this.password = getPassword();
    }
    
    public SignInPage(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername()
    {
        return "username";
    }
    
    public String getPassword()
    {
        return "password";
    }
    
    public boolean attemptLogin()
    {
        if( !validUsername(username) ) 
            throw new IllegalArgumentException("Username is Invalid");
        
        if( !validPassword(password) ) 
            throw new IllegalArgumentException("Password is Invalid");
        
        return true;
    }
}
