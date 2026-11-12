package Listing;

import java.util.ArrayList;

public class PropertyListing 
{
    private String manager;
    private Address location;
    private ArrayList<Review> reviews;
    
    //-// TO DO //-//
    // just implement some default values
    public PropertyListing()
    {
        
    }
    
    public PropertyListing(String manager, Address location)
    {
        setManager(manager);
        setLocation(location);
    }
    
    
    //-// TO DO //-//
    // implement some way to itterate through reviews list and append them to output
    /**
     * Returns a String of the format:
     *      "
     *       Manager: [manager]
     *       Address: [address]
     *       Reviews: 
     *       [reviews/"No Reviews"]
     *      "
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return "";
    }
    
    public void createReview(String username, int performance, int comfort, int utilities, int overall, String description)
    {
        reviews.add
        (
            new Review(username, performance, comfort, utilities, overall, description)
        );
    }
    
    
    public Address getLocation() { return location; }
    public String getManager() { return manager; }
    public ArrayList<Review> getReviews() { return reviews; }
    
    public void setLocation(Address location) { this.location = location; }
    public void setManager(String manager) { this.manager = manager; }
    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }
}
