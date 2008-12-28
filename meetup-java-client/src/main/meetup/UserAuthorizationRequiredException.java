
package meetup;

public class UserAuthorizationRequiredException extends Exception
{
	
	public UserAuthorizationRequiredException(String url)
	{
		super(url);
	}
	
	public String getUrl()
	{
		return this.getMessage();
	}

}
