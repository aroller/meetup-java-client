
package meetup;

import java.util.*;

public class Group
{
	private String name;
	private String longitude;
	private String latitude;
	private String state;
	private String id;
	private String zip;
	private String organizerProfileUrl;
	private String country;
	private String photoUrl;
	private Calendar created;
	private Calendar updated;
	private Integer members;
	private String link;
	private String city;
	private String description;
	private Integer daysLeft;
	
	public Group()
	{
		super();
	}

	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getLongitude()
	{
		return longitude;
	}


	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}


	public String getLatitude()
	{
		return latitude;
	}


	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}


	public String getState()
	{
		return state;
	}


	public void setState(String state)
	{
		this.state = state;
	}


	public String getId()
	{
		return id;
	}


	public void setId(String id)
	{
		this.id = id;
	}


	public String getZip()
	{
		return zip;
	}


	public void setZip(String zip)
	{
		this.zip = zip;
	}


	public String getOrganizerProfileUrl()
	{
		return organizerProfileUrl;
	}


	public void setOrganizerProfileUrl(String url)
	{
		this.organizerProfileUrl = url;
	}


	public String getCountry()
	{
		return country;
	}


	public void setCountry(String country)
	{
		this.country = country;
	}


	public String getPhotoUrl()
	{
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}


	public Calendar getCreated()
	{
		return created;
	}


	public void setCreated(Calendar created)
	{
		this.created = created;
	}


	public Calendar getUpdated()
	{
		return updated;
	}


	public void setUpdated(Calendar updated)
	{
		this.updated = updated;
	}


	public Integer getMembers()
	{
		return members;
	}


	public void setMembers(Integer members)
	{
		this.members = members;
	}


	public String getLink()
	{
		return link;
	}


	public void setLink(String link)
	{
		this.link = link;
	}


	public String getCity()
	{
		return city;
	}


	public void setCity(String city)
	{
		this.city = city;
	}


	public String getDescription()
	{
		return description;
	}


	public void setDescription(String description)
	{
		this.description = description;
	}


	public Integer getDaysLeft()
	{
		return daysLeft;
	}


	public void setDaysLeft(Integer daysLeft)
	{
		this.daysLeft = daysLeft;
	}


	public String toString()
	{
		return ToStringBuilder.build(this);
	}
}
