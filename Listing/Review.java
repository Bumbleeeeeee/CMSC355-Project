package Listing;

import java.util.regex.Pattern;

public class Review
{
    private static final int RATING_MAX = 5;
    private static final String[] FILTERED_STRINGS = {"fuck", "shit" };
    private static final String ALLOWED_SYMBOLS = "`~!@#$%^&*()_-+=[]{};:\'\"<>,./? ";

    private String username;
    private String description;
    private int performance;
    private int comfort;
    private int utilities;
    private int overall;
    private int votes;


    public Review()
    {
        this("userName123", 1, 2, 3, 4, "Lorem ipsum");
    }


    public Review(String username, int performance, int comfort, int utilities, int overall, String description)
    {

        if(containsFilteredWords(description)){throw new IllegalArgumentException("Description contains filtered words");}
        if(!containsValidCharacters(description)){throw new IllegalArgumentException("Description contains invalid characters");}
        if(!isValidRating(performance)){throw new IllegalArgumentException("Invalid performance rating");}
        if(!isValidRating(comfort)){throw new IllegalArgumentException("Invalid comfort rating");}
        if(!isValidRating(utilities)){throw new IllegalArgumentException("Invalid utilities rating");}
        if(!isValidRating(overall)){throw new IllegalArgumentException("Invalid overall rating");}

        this.username=username;
        this.performance=performance;
        this.comfort=comfort;
        this.utilities=utilities;
        this.overall=overall;
        this.description=description;

    }

    /**
     * Return a string of the format:
     *      "[username]: 
     *          [performance] [comfort] [utilities] [overall]
     *          [description]
     *      [votes]"
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return
        (
            username + ":\n\t" + 
            performance + ", " + comfort + ", " + utilities + ", " + overall + "\n\t" +
            description + "\n\t" +
            votes
        );
    }
    

    /**
     * validates rating values
     * @param rating to validate
     * @return true if rating value is between 0 and 5
     */
    private boolean isValidRating(int rating)
    {
        return rating>= 0 && rating <= RATING_MAX;
    }

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
        String escapedSymbols = Pattern.quote(ALLOWED_SYMBOLS);
        String regex = "[a-zA-Z0-9" + escapedSymbols + "]+";

        // Run regex
        return str.matches(regex);
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
        else if( str.equals(word) ){ return true; }

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
        for ( String word : FILTERED_STRINGS )
        {
            if( containsWord(str, word)){ return true; }
        }

        return false;
    }


    public void upvote()
    {
        votes += 1;
    }
    
    public void downvote()
    {
        votes -= 1;
    } 
    
    
    public String getDescription() { return description; }
    public int getComfort() { return comfort; }
    public int getPerformance() { return performance; }
    public int getUtilities() { return utilities; }
    public int getOverall() { return overall; }
    public int getVotes() { return votes; }
    public String getUsername() { return username; }
    
    public void setDescription(String description) { this.description = description; }
    public void setComfort(int comfort) { this.comfort = comfort; }
    public void setPerformance(int performance) { this.performance = performance; }
    public void setUtilities(int utilities) { this.utilities = utilities; }
    public void setOverall(int overall) { this.overall = overall; }
    public void setVotes(int votes) { this.votes = votes; }
    public void setUsername(String username) { this.username = username; }
}
