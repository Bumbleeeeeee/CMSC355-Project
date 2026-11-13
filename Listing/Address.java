package Listing;

import java.util.Arrays;

public class Address
{
    private static final String[] SUPPORTED_CITIES = {"Richmond"};
    private static final String[] SUPPORTED_STATES = {"Virginia"};
    private static final String[] SUPPORTED_ZIP = {"23225", "23221", "23220","23284", "23219", "23298"};
    private String street;
    private String city;
    private String state;
    private String zip;
    
    //-// TO DO //-//
    // Just implement default values
    public Address()
    {
        this("123 Main St", "Richmond", "Virginia","23219");
    }
    
    //-// TO DO //-//
    // implement checks to validate inputs
    // should throw 3 different errors: 
    //      1, throw new IllegalArgumentException("Invalid city");
    //      2. throw new IllegalArgumentException("Invalid state");
    //      3. throw new IllegalArgumentException("Invalid zip");
    public Address(String street, String city, String state, String zip)
    {
        if(!Arrays.asList(SUPPORTED_CITIES).contains(city)){throw new IllegalArgumentException("Invalid city");}
        if(!Arrays.asList(SUPPORTED_ZIP).contains(zip)){throw new IllegalArgumentException("Invalid ZIP code");}
        if(!Arrays.asList(SUPPORTED_STATES).contains(state)){throw new IllegalArgumentException("Invalid state");}

        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
    
    /**
     * Returns a string representing the address, of the format:
     *      "[street], [city], [state] [zip]"
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return street + ", " + city + ", " + state + " " + zip;
    }
    
    
    //-// TO DO //-//
    // Just follow the javadoc comment below, you know what to do
    /**
     * Private function for the purpose of validating zip codes
     * @param zip to validate
     * @return true if the zip code is a valid richmond zip code, false otherwise
     */
    private boolean isValidZip(String zip)
    {
        return Arrays.asList(SUPPORTED_ZIP).contains(zip);
    }
    
    
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getStreet() { return street; }
    public String getZip() { return zip; }
    
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setStreet(String street) { this.street = street; }
    public void setZip(String zip) { this.zip = zip; }
}
