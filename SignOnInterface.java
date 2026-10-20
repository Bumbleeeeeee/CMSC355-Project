import java.util.regex.Pattern;

public interface SignOnInterface 
{
    // Static Final Variables
    
    String allowedSymbols = "@#$_-!";
    
    // this can be a placeholder, I'm not sure I'm comfortable trying to actually add offensive language to this.
    // Also make sure anything added here is lowercase
    String[] FilteredWords = 
    {
        "fuck", 
        "shit"
    };
    
    
    // Required Functions
    
    String getUsername();
    String getPassword();
    boolean attemptLogin();
    
    
    // Default Functions
    
    /**
     * Determines if username is considered valid
     * @param username user specified username
     * @return true if username is valid, false otherwise.
     */
    default boolean validUsername(String username)
    {
        if ( containsFilteredWords(username) || !containsValidCharacters(username) )
        {
            return false;
        }
        
        return true;
    }
    
    /**
     * Determines if password is considered valid
     * @param password user specified password
     * @return true if password contains only valid characters, false otherwise
     */
    default boolean validPassword(String password)
    {
        if( !containsValidCharacters(password) )
        {
            return false;
        }
        
        return true;
    }
    
    /**
     * Determines if specified string is only alphanumeric or allowed symbols  
     * @param str Any string
     * @return true if str is only alphanumeric or if symbols are in allowed symbols  
     */
    default boolean containsValidCharacters(String str)
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
    default boolean containsFilteredWords(String str)
    {
        // Basic case
        if (str == null) 
        {
        return false;
        }
        
        // Actual check
        for ( String word : FilteredWords )
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
        for( int i = 0; i < str.length() - word.length(); i++ )
        {
            String curWord = str.substring( i, i+word.length() );
            
            if( curWord.equals(word) ){ return true; }
        }
        
        return false;
    }
}
