package Listing;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListingTest 
{
    /**
     * Preconditions:
     *      User is signed in
     *      User is on area overview screen
     * 
     * Test Steps:
     *      User clicks “Create new listing”
     *      User inputs defined Manager value
     *      User inputs defined Address value
     *      User clicks “finish”
     * 
     * Input Values: 
     *      Manager: “Sally Fourth”
     *      Address: 123 E. Main St., Richmond, VA, 23219
     * 
     * Expected Results:
     *      Defined property appears in Property Listings 

     */
    @Test
    public void TC01_PropertyCreation()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on area overview screen
     * 
     * Test Steps:
     *      User clicks “Create new listing”
     *      User inputs defined Manager value
     *      User inputs defined Address value
     *      User clicks “finish”
     * 
     * Input Values: 
     *      Manager: John Doe
     *      Address: 321 Main St, Richmond, VA, 12345
     * 
     * Expected Results:
     *      Text appears saying that the zip code is invalid
     */
    @Test
    public void TC02_ImproperAddress()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page
     * 
     * Test Steps:
     *      User clicks “Write review”
     *      User inputs defined Review Body
     *      User inputs defined Ratings
     *      User clicks “Post”
     * 
     * Input Values: 
     *      Review Body: This place was great!
     *      Ratings: 5, 4, 4, 0 
     * 
     * Expected Results:
     *      The post button works, and the rating appears on the listing
     */
    @Test
    public void TC03_ReviewCreation()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page
     * 
     * Test Steps:
     *      User clicks “Write review”
     *      User inputs defined Review Body
     *      User inputs defined Ratings
     *      User clicks “Post”
     * 
     * Input Values: 
     *      Review Body: “Fuck this shit”
     *      Ratings: 1, 1, 1, 1
     * 
     * Expected Results:
     *      Text appears saying that the review must follow community guidelines
     */
    @Test
    public void TC04_IllegalLanguage()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page
     * 
     * Test Steps:
     *      User clicks “Write review”
     *      User inputs defined Review Body
     *      User inputs defined Ratings
     *      User clicks “Post”
     * 
     * Input Values: 
     *      Review Body: “         ‌‍‎‏‪ ⁤⁣⁡”
     *      Ratings: 1, 1, 1, 1
     * 
     * Expected Results:
     *      Text appears saying that the review contains invalid characters
     */
    @Test
    public void TC05_IllegalCharacters()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page
     * 
     * Test Steps:
     *      User clicks “Write review”
     *      User inputs defined Review Body
     *      User inputs defined Ratings
     *      User clicks “Post”
     * 
     * Input Values: 
     *      Rating Body: Truly terrible. Awful
     *      Ratings: -1, -1, -1, -10
     * 
     * Expected Results:
     *      Text appears saying the ratings must be between 0 and 5 inclusive
     */
    @Test
    public void TC06_MinRating()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page
     * 
     * Test Steps:
     *      User clicks “Write review”
     *      User inputs defined Review Body
     *      User inputs defined Ratings
     *      User clicks “Post”
     * 
     * Input Values: 
     *      Rating Body: Truly wonderful. Amazing
     *      Ratings: 6, 6, 6, 20
     * 
     * Expected Results:
     *      Text appears saying the ratings must be between 0 and 5 inclusive
     */
    @Test
    public void TC07_MaxRating()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      The listing has a review
     * 
     * Test Steps:
     *      User clicks on the listing to open its page
     * 
     * Input Values: 
     * 
     * Expected Results:
     *      Review is displayed as expected
     */
    @Test
    public void TC08_DisplayListingWithReviews()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      The listing does not have any reviews
     * 
     * Test Steps:
     *      User clicks on the listing to open its page
     * 
     * Input Values: 
     * 
     * Expected Results:
     *      Review space is replaced with text saying “No reviews here”
     */
    @Test
    public void TC09_DisplayListingWithoutReviews()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page with reviews
     * 
     * Test Steps:
     *      User clicks on upvote button on a review
     * 
     * Input Values: 
     * 
     * Expected Results:
     *      Review’s vote counter is increased by 1
     */
    @Test
    public void TC10_Upvote()
    {
        
    }
    
    /**
     * Preconditions:
     *      User is signed in
     *      User is on a listing page with reviews
     * 
     * Test Steps:
     *      User clicks on the downvote button on a review
     * 
     * Input Values: 
     * 
     * Expected Results:
     *      Review’s vote counter is decreased by 1
     */
    @Test
    public void TC11_Downvote()
    {
        
    }
}
