public class SignUpPage extends SignOnAbstract
{
    String username;
    String password1;
    String password2;
    
    public SignUpPage()
    {
        this.username = getUsername();
        this.password1 = getPassword();
        this.password2 = getPassword();
    }
    
    public SignUpPage(String username, String password1, String password2)
    {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
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
        
        else if( !validPassword(password1) ) 
            throw new IllegalArgumentException("Password is Invalid");
        
        else if( !password1.equals(password2) )
            throw new IllegalArgumentException("Passwords must Match");
        return true;
    }
}
