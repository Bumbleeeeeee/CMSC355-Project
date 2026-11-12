package Listing;

public class Review 
{
    private String description;
    
    private int performance;
    private int comfort;
    private int utilities;
    private int overall;
    
    private int votes;
    
    public Review()
    {
        
    }
    
    public String toString()
    {
        return "";
    }
    
    public boolean isValidReview()
    {
        return false;
    }
    
    public boolean isValidDescription()
    {
        return false;
    }
    
    public void upvote()
    {
        
    }
    
    public void downvote()
    {
        
    } 
    
    
    public String getDescription() { return description; }
    public int getComfort() { return comfort; }
    public int getPerformance() { return performance; }
    public int getUtilities() { return utilities; }
    public int getOverall() { return overall; }
    public int getVotes() { return votes; }
    
    public void setDescription(String description) { this.description = description; }
    public void setComfort(int comfort) { this.comfort = comfort; }
    public void setPerformance(int performance) { this.performance = performance; }
    public void setUtilities(int utilities) { this.utilities = utilities; }
    public void setOverall(int overall) { this.overall = overall; }
    public void setVotes(int votes) { this.votes = votes; }
}
