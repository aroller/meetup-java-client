
package meetup;

import java.text.SimpleDateFormat;
import java.util.*;

public class EventSearchCriteria
{
	private String zipCode;
	private String country;
	private String city;
	private String state;
	private String topic;
	private List<String> eventIds;
	private List<String> groupIds;
	private String groupUrlName;
	private String groupNumber;
	private Calendar after;
	private Calendar before;
	private String latitude;
	private String longitude;
	private Integer radiusInMiles;
	private Boolean descendingOrder;
	private OrderBy orderBy;
	
	

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
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

	/**
	 * 
	 * @param country  two letter country code
	 * 
	 */
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

	public String getTopic()
	{
		return topic;
	}

	public void setTopic(String topic)
	{
		this.topic = topic;
	}


	public String getGroupNumber()
	{
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber)
	{
		this.groupNumber = groupNumber;
	}

	public Integer getRadiusInMiles()
	{
		return radiusInMiles;
	}

	public void setRadiusInMiles(Integer radius)
	{
		this.radiusInMiles = radius;
	}

	public Boolean getDescendingOrder()
	{
		return descendingOrder;
	}

	public void setDescendingOrder(Boolean descendingOrder)
	{
		this.descendingOrder = descendingOrder;
	}

	public OrderBy getOrderBy()
	{
		return orderBy;
	}

	public void setOrderBy(OrderBy orderBy)
	{
		this.orderBy = orderBy;
	}

	public String getGroupUrlName()
	{
		return groupUrlName;
	}

	public void setGroupUrlName(String name)
	{
		this.groupUrlName = name;
	}

	public List<String> getEventIds()
	{
		if (eventIds == null)
		{
			eventIds = new ArrayList<String>();
		}
		
		return eventIds;
	}

	public void setEventIds(List<String> eventIds)
	{
		this.eventIds = eventIds;
	}

	public List<String> getGroupIds()
	{
		if (groupIds == null)
		{
			groupIds = new ArrayList<String>();
		}
		
		return groupIds;
	}

	public void setGroupIds(List<String> groupIds)
	{
		this.groupIds = groupIds;
	}

	public Calendar getAfter()
	{
		return after;
	}

	public void setAfter(int month, int day, int year)
	{
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, day);
		c.set(Calendar.YEAR, year);
		
		setAfter(c);
	}
	
	public void setAfter(Calendar after)
	{
		this.after = after;
	}

	public Calendar getBefore()
	{
		return before;
	}

	public void setBefore(int month, int day, int year)
	{
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, day);
		c.set(Calendar.YEAR, year);
		
		setBefore(c);
	}
	
	public void setBefore(Calendar before)
	{
		this.before = before;
	}


	public Map<String, String> getParameterMap()
	{
		

		Map<String, String> m = new HashMap<String, String>();
		
		if (getZipCode() != null)
		{
			m.put("zip", getZipCode());
		}
		
		if (getCountry() != null)
		{
			m.put("country", getCountry());
		}
		
		if (getCity() != null)
		{
			m.put("city", getCity());
		}
		
		if (getState() != null)
		{
			m.put("state", getState());
		}
		
		if (getRadiusInMiles() != null)
		{
			m.put("radius", getRadiusInMiles().toString());
		}
		
		if (getLatitude() != null)
		{
			m.put("lat", getLatitude());
		}
		
		if (getLongitude() != null)
		{
			m.put("lon", getLongitude());
		}
		
		if (getTopic() != null)
		{
			m.put("topic", getTopic());
		}
		
		if (getEventIds().size() > 0)
		{
			m.put("id", Util.toString(getEventIds()));
		}
		
		if (getGroupIds().size() > 0)
		{
			m.put("group_id", Util.toString(getGroupIds()));
		}
		
		if (getTopic() != null)
		{
			m.put("topic", getTopic());
		}
		
		if (getGroupNumber() != null)
		{
			m.put("groupnum", getGroupNumber());
		}
		
		if (getGroupUrlName() != null)
		{
			m.put("group_urlname", getGroupUrlName());
		}
		
		if (this.getAfter() != null)
		{
			m.put("after", getMonthDayYear(getAfter()));
		}
		
		if (this.getBefore() != null)
		{
			m.put("before", getMonthDayYear(getBefore()));
		}
		
		return m;
	}

	static String getMonthDayYear(java.util.Calendar c)
	{
		SimpleDateFormat format = new SimpleDateFormat("MMddyyyy");
		String s = format.format(c.getTime());
		return s;
		
	}
}
