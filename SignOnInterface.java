public interface SignOnInterface 
{
    String IllegalChars = "";
    String[] FilteredWords = 
    {
        "FUCK", "SHIT", "FAGGOT"
    };
    
    default boolean validUsername(String username)
    {
        return true;
    }
    
    default boolean validPassword(String password)
    {
        return true;
    }
    
    default boolean containsIllegalChars(String str)
    {
        return false;
    }
    
    default boolean containsFilteredWords(String str)
    {
        return false;
    }
    
    String getUsername();
    String getPassword();
}
