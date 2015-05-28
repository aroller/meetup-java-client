
package meetup;

import java.util.HashMap;
import java.util.Map;

public class TopicSearchCriteria
{
	private String topic;
	private String name;
	private String search;
	
	public String getTopic()
	{
		return topic;
	}
	
	public void setTopic(String topic)
	{
		this.topic = topic;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSearch()
	{
		return search;
	}
	
	public void setSearch(String search)
	{
		this.search = search;
	}
	
	public Map<String, String> getParameterMap()
	{

		Map<String, String> m = new HashMap<String, String>();
		
		if (getSearch() != null)
		{
			m.put("search", getSearch());
		}
		
		if (getTopic() != null)
		{
			m.put("topic", getTopic());
		}
		
		if (getName() != null)
		{
			m.put("name", getName());
		}
		
		return m;
	}
	
	public String toString()
	{
		return ToStringBuilder.build(this);
	}
}
