package Listing;

import java.util.ArrayList;

public class Area 
{
    static ArrayList<PropertyListing> propertyListings = new ArrayList<PropertyListing>();
    
    public static void createPropertyListing(String manager, Address location)
    {
        propertyListings.add(
            new PropertyListing(manager, location)
        );
    }
}
