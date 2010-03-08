
package meetup;

public class Member
{
	private String id;
	private String name;
	private String link;
	private String photoUrl;
	private String bio;
	
	private String latitude;
	
	private String longitude;
	
	private String country;
	private String city;
	private String state;

	
	public String getId()
	{
		return id;
	}


	public void setId(String id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getLink()
	{
		return link;
	}


	public void setLink(String link)
	{
		this.link = link;
	}


	public String getPhotoUrl()
	{
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}


	public String getBio()
	{
		return bio;
	}


	public void setBio(String bio)
	{
		this.bio = bio;
	}


	public String getLatitude()
	{
		return latitude;
	}


	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}


	public String getLongitude()
	{
		return longitude;
	}


	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}


	public String getCountry()
	{
		return country;
	}


	public void setCountry(String country)
	{
		this.country = country;
	}


	public String getCity()
	{
		return city;
	}


	public void setCity(String city)
	{
		this.city = city;
	}


	public String getState()
	{
		return state;
	}


	public void setState(String state)
	{
		this.state = state;
	}


	public String toString()
	{
		return ToStringBuilder.build(this);
	}
}
