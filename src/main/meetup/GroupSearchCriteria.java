
package meetup;

import java.util.*;

public class GroupSearchCriteria
{
	private String zipCode;
	private String latitude;
	private String longitude;
	private String memberId;
	private String country;
	private String city;
	private String state;
	private String topic;
	private List<String> ids;
	private String groupNumber;
	private Integer radiusInMiles;
	private Boolean descendingOrder;
	private OrderBy orderBy;
	private String groupUrlName;
	
	
	public GroupSearchCriteria()
	{
		
	}

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

	public String getMemberId()
	{
		return memberId;
	}

	public void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}

	public String getCountry()
	{
		return country;
	}

	/**
	 * 
	 * @param country two letter country code
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

	public List<String> getIds()
	{
		if (ids == null)
		{
			ids = new ArrayList<String>();
		}
		return ids;
	}

	public void setIds(List<String> ids)
	{
		this.ids = ids;
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
		
		if (getIds().size() > 0)
		{
			m.put("id", Util.toString(getIds()));
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
		
		
		return m;
	}


	public String toString()
	{
		return ToStringBuilder.build(this);
	}
}
