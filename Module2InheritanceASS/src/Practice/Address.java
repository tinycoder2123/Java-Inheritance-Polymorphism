package Practice;

public class Address 
{
	String locality;
	String city;
	String state;
	int zipcode;
	
	public Address(String lovality, String city, String state, int zipcode)
	{
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	@Override
	public String toString()
	{
		return "locality= " + locality + ", city= " + 
				city + ", state= " + state + ", zipcode= " + zipcode;
	}
}
