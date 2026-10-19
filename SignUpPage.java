public class SignUpPage implements SignOnInterface
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
        if( validUsername(username) )
            this.username = username;
        else throw new IllegalArgumentException("Username is Invalid");
        
        if( validPassword(password1) )
            this.password1 = password1;
        else throw new IllegalArgumentException("Password is Invalid");
        
        if( validPassword(password2) )
            this.password2 = password2;
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
