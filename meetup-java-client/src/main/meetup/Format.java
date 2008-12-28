
package meetup;

public enum Format
{
	XML("xml"),
	
	JSON("json");
	
	private String type;
	
	Format(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return this.type;
	}
	
}
