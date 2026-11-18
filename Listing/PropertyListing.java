package Listing;

import java.util.ArrayList;

public class PropertyListing 
{
    private String manager;
    private Address location;
    private ArrayList<Review> reviews;


    public PropertyListing()
    {
        this("John Doe", new Address());
    }
    
    public PropertyListing(String manager, Address location)
    {
        setManager(manager);
        setLocation(location);
    }
    

    /**
     * Returns a String of the format:
     *      "
     *       Manager: [manager]
     *       Address: [address]
     *       Reviews: 
     *          [reviews/"None"]
     *      "
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String output = "Manager: " + this.manager + "\nAddress: " + this.location.toString() + "\nReviews:";
        if(this.reviews.isEmpty()){return output+"None";}

        for(Review review:this.reviews){
            output += "\n" +review.toString();
        }
        return output;
    }
    
    public void createReview(String username, int performance, int comfort, int utilities, int overall, String description)
    {
        reviews.add
        (
            new Review(username, performance, comfort, utilities, overall, description)
        );
    }
    
    public void createReview(Review review)
    {
        if( !reviews.contains(review) )
        {
            reviews.add( review );
        }
        
        else
        {
            throw new IllegalArgumentException("Item already exists");
        }
    }
    
    
    public Address getLocation() { return location; }
    public String getManager() { return manager; }
    public ArrayList<Review> getReviews() { return reviews; }
    
    public void setLocation(Address location) { this.location = location; }
    public void setManager(String manager) { this.manager = manager; }
    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }
}
