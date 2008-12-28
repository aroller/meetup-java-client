
package meetup;

import java.util.*;
import java.math.*;

public class Event
{
	private String longitude;
	private String latitude;
	private Integer rsvpCount;
	private String groupName;
	private String feeCurrency;
	private Calendar time;
	private Calendar updated;
	private Boolean isMeetup;
	private String eventUrl;
	private Integer attendeeCount;
	private String id;
	private String venueLongitude;
	private String venueLatitude;
	private BigDecimal fee;
	private String venueName;
	private String description;
	private String photoUrl;
	private String feeDescription;
	private String questions;
	private String name;
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
	public Integer getRsvpCount()
	{
		return rsvpCount;
	}
	public void setRsvpCount(Integer rsvpCount)
	{
		this.rsvpCount = rsvpCount;
	}
	public String getGroupName()
	{
		return groupName;
	}
	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}
	public String getFeeCurrency()
	{
		return feeCurrency;
	}
	public void setFeeCurrency(String feeCurrency)
	{
		this.feeCurrency = feeCurrency;
	}
	public Calendar getTime()
	{
		return time;
	}
	public void setTime(Calendar time)
	{
		this.time = time;
	}
	public Calendar getUpdated()
	{
		return updated;
	}
	public void setUpdated(Calendar updated)
	{
		this.updated = updated;
	}
	public Boolean getIsMeetup()
	{
		return isMeetup;
	}
	public void setIsMeetup(Boolean isMeetup)
	{
		this.isMeetup = isMeetup;
	}
	public String getEventUrl()
	{
		return eventUrl;
	}
	public void setEventUrl(String eventUrl)
	{
		this.eventUrl = eventUrl;
	}
	public Integer getAttendeeCount()
	{
		return attendeeCount;
	}
	public void setAttendeeCount(Integer attendeeCount)
	{
		this.attendeeCount = attendeeCount;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getVenueLongitude()
	{
		return venueLongitude;
	}
	public void setVenueLongitude(String venueLongitude)
	{
		this.venueLongitude = venueLongitude;
	}
	public String getVenueLatitude()
	{
		return venueLatitude;
	}
	public void setVenueLatitude(String venueLatitude)
	{
		this.venueLatitude = venueLatitude;
	}
	public BigDecimal getFee()
	{
		return fee;
	}
	public void setFee(BigDecimal fee)
	{
		this.fee = fee;
	}
	public String getVenueName()
	{
		return venueName;
	}
	public void setVenueName(String venueName)
	{
		this.venueName = venueName;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getPhotoUrl()
	{
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}
	public String getFeeDescription()
	{
		return feeDescription;
	}
	public void setFeeDescription(String feeDescription)
	{
		this.feeDescription = feeDescription;
	}
	public String getQuestions()
	{
		return questions;
	}
	public void setQuestions(String questions)
	{
		this.questions = questions;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return this.name;
	}
	
}
