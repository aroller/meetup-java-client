
package meetup;

public enum OrderBy
{
	CREATION_TIME("ctime"), 
	NAME("name"),
	LOCATION("location"),
	NUMBER_OF_MEMBERS("members"),
	TIME("time"),
	GROUP("group"),
	TOPIC("topic");
	
	private String value;
	
	OrderBy(String val) 
	{
		value = val;
	}
	
	public String getValue()
	{
		return this.value;
	}
	
}
