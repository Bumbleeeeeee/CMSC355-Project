import java.util.ArrayList;
import java.util.regex.Pattern;

abstract class SignOnAbstract 
{
    // Static Final Variables
    public static final String allowedSymbols = "@#$_-!";
    
    // this can be a placeholder, I'm not sure I'm comfortable trying to actually add offensive language to this.
    // Also make sure anything added here is lowercase
    public static final String[] filteredWords = 
    {
        "fuck", 
        "shit"
    };
    
    //Static Mutable Variables
    private static ArrayList<String> existingUsernames = new ArrayList<>();
    
    
    // Required Functions
    
    abstract String getUsername();
    abstract String getPassword();
    abstract boolean attemptLogin();
    
    
    // Default Functions
    
    /**
     * Determines if specified string is only alphanumeric or allowed symbols  
     * @param str Any string
     * @return true if str is only alphanumeric or if symbols are in allowed symbols  
     */
    public boolean containsValidCharacters(String str)
    {
        // Error case, just return false
        if (str == null || str.isEmpty()) { return false; }
        
        // Escape regex characters, ensures that regex specific symbols wont mess up regex
        String escapedSymbols = Pattern.quote(allowedSymbols);
        String regex = "[a-zA-Z0-9" + escapedSymbols + "]+";
        
        // Run regex
        return str.matches(regex);
    }
    
    /**
     * Determines if specified string contains any filtered words
     * @param str Any string
     * @return true if the string contains a word in FilteredWords
     */
    public boolean containsFilteredWords(String str)
    {
        // Basic case
        if (str == null) 
        {
            return false;
        }
        
        // Actual check
        for ( String word : filteredWords )
        {
            if( containsWord(str, word)){ return true; }
        }
        
        return false;
    }
    
    /**
     * Determines if a string contains a word anywhere within
     * @param str Any string
     * @param word Any string
     * @return true if str contains word, false otherwise
     */
    private boolean containsWord(String str, String word)
    {
        // basic case ensuring str COULD contain word
        if( str.length() < word.length() ){ return false; }
        
        // making sure all letters are same case as filters
        str = str.toLowerCase();
        
        // Increment through every word length sequence of letters in str to see if it appears
        for( int i = 0; i < str.length() - word.length() - 1; i++ )
        {
            String curWord = str.substring( i, i+word.length()+1 );
            
            if( curWord.equals(word) ){ return true; }
        }
        
        return false;
    }
    
    public boolean usernameExists(String username)
    {
        for( String existingUser : existingUsernames )
        {
            if( username.equals(existingUser) ){ return true; }
        }
        
        return false;
    }
    
    public void addUser(String username, String password)
    {
        existingUsernames.add(username);
        
        // add logic to hash password and save it to another arraylist?
    }
}
