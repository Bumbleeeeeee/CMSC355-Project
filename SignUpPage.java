import java.util.Scanner;

public class SignUpPage extends SignOnAbstract
{
    String username;
    String password1;
    String password2;
    
    public SignUpPage()
    {
        
        boolean flag = true;
        while( flag )
        {
            this.username = getUsername();
            this.password1 = getPassword();
            this.password2 = getPassword();
            
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
    
    public SignUpPage(String username, String password1, String password2)
    {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
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
        
        else if( usernameExists(this.username) )
            throw new IllegalArgumentException("Username already exists");
        
        
        if( this.password1.equals("") )
            throw new IllegalArgumentException("Password field must be filled");
        
        else if( this.password2.equals("") )
            throw new IllegalArgumentException("Password field must be filled");
        
        else if( this.password1.length() > 50)
            throw new IllegalArgumentException("Password is too long");
        
        else if( !containsValidCharacters(this.password1) ) 
            throw new IllegalArgumentException("Password contains invalid characters");
        
        else if( !this.password1.equals(this.password2) )
            throw new IllegalArgumentException("Passwords must match");
        
        
        return addUser(username, password1);
    }
}
