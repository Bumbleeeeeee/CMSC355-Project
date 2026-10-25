import java.util.Scanner;

public class SignInPage extends SignOnAbstract
{
    String username;
    String password;
    
    public SignInPage()
    {
        boolean flag = true;
        while( flag )
        {
            this.username = getUsername();
            this.password = getPassword();
            
            try
            {
                this.attemptLogin();
                flag = false;
            }
            
            catch( IllegalArgumentException e )
            {
                System.out.println("Error!\n" + e.getMessage());
            }
        }
        
        System.out.println("Success!\nLogged in as: " + this.username);
    }
    
    public SignInPage(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");
        String out = scan.nextLine();
        scan.close();
        return out;
    }
    
    public String getPassword()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password: ");
        String out = scan.nextLine();
        scan.close();
        return out;
    }
    
    public boolean attemptLogin()
    {
        if( this.username.equals("") )
            throw new IllegalArgumentException("Username field must be filled");
        
        else if( this.username.length() > 20)
            throw new IllegalArgumentException("Username is too long");
        
        else if( containsFilteredWords(this.username) ) 
            throw new IllegalArgumentException("Username contains filtered words");
        
        else if( !containsValidCharacters(this.username) )
            throw new IllegalArgumentException("Username contains invalid characters");
        
        
        
        if( this.password.equals("") )
            throw new IllegalArgumentException("Password field must be filled");
        
        else if( this.password.length() > 50)
            throw new IllegalArgumentException("Password is too long");
        
        else if( !containsValidCharacters(this.password) ) 
            throw new IllegalArgumentException("Password contains invalid characters");
        
        
        return userCredentialsValid(username, password);
    }
}
