package Listing;

public class Review 
{
    private String username;
    
    private String description;
    
    private int performance;
    private int comfort;
    private int utilities;
    private int overall;
    
    private int votes;
    
    //-// TO DO //-//
    // just implement some default values
    public Review()
    {
        
    }
    
    //-// TO DO //-//
    // implement checks to validate inputs
    // should throw 2 different errors: 
    //      1, throw new IllegalArgumentException("Description contains filtered words");
    //      2. throw new IllegalArgumentException("Invalid rating values");
    public Review(String username, int performance, int comfort, int utilities, int overall, String description)
    {
        
    }
    
    /**
     * Return a string of the format:
     *      "[username]: 
     *          [performance][comfort][utilities][overall]
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
            description + "\n" +
            votes
        );
    }
    
    //-// TO DO //-//
    /**
     * validates rating values
     * @param rating to validate
     * @return true if rating value is between 0 and 5
     */
    private boolean isValidRating(int rating)
    {
        return false;
    }
    
    //-// TO DO //-//
    /**
     * Validates that a description follows business rules
     * @param str to validate
     * @return false if: 
     *          1. str contains banned words or 
     *          2. str contains banned characters.
     *              Valid characters are: alphanumeric or: `~!@#$%^&*()-_=+/?.>,<'"[]{}\| 
     */
    private boolean isValidDescription(String str)
    {
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
