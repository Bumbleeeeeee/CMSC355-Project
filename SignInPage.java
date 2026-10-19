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
        if( validUsername(username) )
            this.username = username;
        else throw new IllegalArgumentException("Username is Invalid");
        
        if( validPassword(password) )
            this.password = password;
        else throw new IllegalArgumentException("Password is Invalid");
        
    }
    
    public String getUsername()
    {
        return "username";
    }
    
    public String getPassword()
    {
        return "password";
    }
}
