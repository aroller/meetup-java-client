
package meetup;

public class UserAuthorizationRequiredException extends RuntimeException
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
