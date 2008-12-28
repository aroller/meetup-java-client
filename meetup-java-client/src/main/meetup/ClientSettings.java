
package meetup;

@SuppressWarnings("serial")
public class ClientSettings implements java.io.Serializable
{
	private Token consumerToken;
	private Token userSpecificAccessToken;
	private Format format = Format.XML;
	private String oAuthCallbackUrl;
	private String meetupKey;
	
	public ClientSettings()
	{
		super();
	}
	
	public void setConsumerToken(Token t)
	{
		this.consumerToken = t;
	}
	
	public Token getConsumerToken()
	{
		return consumerToken;
	}

	public Token getUserSpecificAccessToken()
	{
		if (userSpecificAccessToken == null)
		{
			userSpecificAccessToken = new Token();
		}
		return userSpecificAccessToken;
	}

	public void setUserSpecificToken(Token t)
	{
		this.userSpecificAccessToken = t;
	}

	
	public void setFormat(Format f)
	{
		this.format = f;
	}
	
	public Format getFormat()
	{
		return format;
	}
	
	public void setOAuthCallbackUrl(String url)
	{
		this.oAuthCallbackUrl = url;
	}
	
	public String getOAuthCallbackUrl()
	{
		return oAuthCallbackUrl;
	}


	public String getMeetupKey()
	{
		return meetupKey;
	}

	public void setMeetupKey(String key)
	{
		this.meetupKey = key;
	}

	public void setUserSpecificAccessToken(Token userSpecificAccessToken)
	{
		this.userSpecificAccessToken = userSpecificAccessToken;
	}

	public String toString()
	{
		return "todo";
	}

}
