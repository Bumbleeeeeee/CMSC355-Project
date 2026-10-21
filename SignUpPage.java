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
        if( containsFilteredWords(this.username) ) 
            throw new IllegalArgumentException("Username contains filtered words");
        else if( !containsValidCharacters(this.username) )
            throw new IllegalArgumentException("Username contains invalid characters");
        else if( usernameExists(this.username) )
            throw new IllegalArgumentException("Username already exists");
        
        if( !containsValidCharacters(this.password1) ) 
            throw new IllegalArgumentException("Password contains invalid characters");
        else if( !this.password1.equals(this.password2) )
            throw new IllegalArgumentException("Passwords must match");
        
        addUser(username, password1);
        
        return true;
    }
}
