package Listing;

import java.util.ArrayList;

public class PropertyListing 
{
    private String manager;
    private Address location;
    private ArrayList<Review> reviews;
    
    public PropertyListing()
    {
        
    }
    
    public static void createReview()
    {
        
    }
    
    public static void displayListing()
    {
        
    }
    
    
    public Address getLocation() { return location; }
    public String getManager() { return manager; }
    public ArrayList<Review> getReviews() { return reviews; }
    
    public void setLocation(Address location) { this.location = location; }
    public void setManager(String manager) { this.manager = manager; }
    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }
}
