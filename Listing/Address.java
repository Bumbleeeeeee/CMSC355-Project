package Listing;

public class Address 
{
    private String street;
    private String city;
    private String state;
    private String zip;
    
    //-// TO DO //-//
    // Just implement default values
    public Address()
    {
        
    }
    
    //-// TO DO //-//
    // implement checks to validate inputs
    // should throw 3 different errors: 
    //      1, throw new IllegalArgumentException("Invalid city");
    //      2. throw new IllegalArgumentException("Invalid state");
    //      3. throw new IllegalArgumentException("Invalid zip");
    public Address(String street, String city, String state, String zip)
    {
        
    }
    
    /**
     * Returns a string represending the address, of the format:
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
        return false;
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
