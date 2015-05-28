
package meetup;

import java.util.*;

/**
 * 
 * Meetup API response
 * 
 * In Meetup's API, this is known as the "results" element
 *
 */
public class Response
{
	private transient String rsp;
	
	private List<Group> groups;
	private List<Event> events;
	private List<Topic> topics;
	
	private List<Activity> activities;
	
	private Header header;

	
	public Response()
	{
		super();
	}
	

	
	public String getRsp()
	{
		return rsp;
	}



	public void setRsp(String rsp)
	{
		this.rsp = rsp;
	}

	public List<Activity> getActivities()
	{
		if (activities == null)
		{
			activities = new ArrayList<Activity>();
		}

		return activities;
	}
	

	public List<Group> getGroups()
	{
		if (groups == null)
		{
			groups = new ArrayList<Group>();
		}

		return groups;
	}



	public void setGroups(List<Group> groups)
	{
		this.groups = groups;
	}



	public List<Event> getEvents()
	{
		if (events == null)
		{
			events = new ArrayList<Event>();
		}
		
		return events;
	}



	public void setEvents(List<Event> events)
	{
		this.events = events;
	}



	public List<Topic> getTopics()
	{
		if (topics == null)
		{
			topics = new ArrayList<Topic>();
		}
		
		return topics;
	}



	public void setTopics(List<Topic> topics)
	{
		this.topics = topics;
	}



	public String toString()
	{
		return String.valueOf(this.rsp);
	}
	
	/**
	 * 
	 * this class encapsulates the "head" element in Meetup's API
	 *
	 */
	public static class Header
	{
		private String title;
		private String link;
		private String url;
		private String id;
		private String latitude;
		private String longitude;
		private String description;
		private Calendar updated;
		private String method;
		private Integer count;
		private Integer totalCount;
		private String next;
		
		public String getTitle()
		{
			return title;
		}
		
		public void setTitle(String title)
		{
			this.title = title;
		}
		
		public String getLink()
		{
			return link;
		}
		
		public void setLink(String link)
		{
			this.link = link;
		}
		
		public String getUrl()
		{
			return url;
		}
		
		public void setUrl(String url)
		{
			this.url = url;
		}
		
		public String getId()
		{
			return id;
		}
		public void setId(String id)
		{
			this.id = id;
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
		public String getDescription()
		{
			return description;
		}
		public void setDescription(String description)
		{
			this.description = description;
		}
		public Calendar getUpdated()
		{
			return updated;
		}
		public void setUpdated(Calendar updated)
		{
			this.updated = updated;
		}
		public String getMethod()
		{
			return method;
		}
		public void setMethod(String method)
		{
			this.method = method;
		}
		public Integer getCount()
		{
			return count;
		}
		public void setCount(Integer count)
		{
			this.count = count;
		}
		public Integer getTotalCount()
		{
			return totalCount;
		}
		public void setTotalCount(Integer totalCount)
		{
			this.totalCount = totalCount;
		}
		public String getNext()
		{
			return next;
		}
		public void setNext(String next)
		{
			this.next = next;
		}
		
		public String toString()
		{
			return ToStringBuilder.build(this);
		}

		
	} // end Header class

} // end Response class
