public class SignInPage extends SignOnAbstract
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
        if( this.username.equals("") )
            throw new IllegalArgumentException("Username field must be filled");
        else if( containsFilteredWords(this.username) ) 
            throw new IllegalArgumentException("Username contains filtered words");
        else if( !containsValidCharacters(this.username) )
            throw new IllegalArgumentException("Username contains invalid characters");
        else if( usernameExists(this.username) )
            throw new IllegalArgumentException("Username already exists");
        
        if( this.password.equals("") )
            throw new IllegalArgumentException("Password field must be filled");
        else if( !containsValidCharacters(this.password) ) 
            throw new IllegalArgumentException("Password contains invalid characters");
        
        return true;
    }
}
