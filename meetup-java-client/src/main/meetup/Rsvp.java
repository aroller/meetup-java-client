
package meetup;

import java.util.*;

public class Rsvp
{
	private String name;
	private String link;
	private String comment;
	private String latitude;
	private String longitude;
	private String city;
	private String country;
	private String state;
	private String answers;
	private Calendar created;
	private Calendar updated;

	
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


	public String getComment()
	{
		return comment;
	}


	public void setComment(String comment)
	{
		this.comment = comment;
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


	public String getCity()
	{
		return city;
	}


	public void setCity(String city)
	{
		this.city = city;
	}


	public String getCountry()
	{
		return country;
	}


	public void setCountry(String country)
	{
		this.country = country;
	}


	public String getState()
	{
		return state;
	}


	public void setState(String state)
	{
		this.state = state;
	}


	public String getAnswers()
	{
		return answers;
	}


	public void setAnswers(String answers)
	{
		this.answers = answers;
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


	public String toString()
	{
		return ToStringBuilder.build(this);
	}
}
