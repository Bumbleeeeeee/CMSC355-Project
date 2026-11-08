package Listing;

public class Address 
{
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address()
    {
        
    }
    
    public void displayAddress()
    {
        
    }
    
    public boolean isValidZip()
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
