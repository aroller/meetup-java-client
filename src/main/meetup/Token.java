
package meetup;

/**
 * 
 *  OAuth token
 *
 */
public class Token
{
	private String publicToken;
	private String secret;
	

	public Token(String publicValue, String secretValue)
	{
		setPublicToken(publicValue);
		setSecret(secretValue);
	}

	public Token()
	{
		super();
	}

	public String getPublicToken()
	{
		return publicToken;
	}


	public void setPublicToken(String pub)
	{
		this.publicToken = pub;
	}


	public String getSecret()
	{
		return secret;
	}


	public void setSecret(String s)
	{
		this.secret = s;
	}


	public boolean isValid()
	{
		if (this.getPublicToken() == null)
		{
			return false;
		}
		else if (this.getPublicToken().trim().length() == 0)
		{
			return false;
		}
		else if (this.getSecret() == null)
		{
			return false;
		}
		else if (this.getSecret().trim().length() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	public String toString()
	{
		return "public='" 
				+ this.getPublicToken()
				+ "',   secret='" + this.getSecret() + "'";
	}
	
}
