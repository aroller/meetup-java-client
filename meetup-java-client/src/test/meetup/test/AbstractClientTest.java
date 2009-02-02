
package meetup.test;

import junit.framework.TestCase;
import meetup.*;

import java.lang.reflect.Method;
import java.util.*;

import javax.swing.JOptionPane;

public abstract class AbstractClientTest extends TestCase
{
	private Client c;
	protected boolean oauth = false;
	
	public void setUp() 
	{
		
		ClientSettings settings = new ClientSettings();
		
		settings.setMeetupKey("116528185c6768552f13a6171217fb");
		settings.setConsumerToken(new Token("verb.for.shoe", "f5281e69ea6b3c14399b67b8"));
		settings.setOAuthCallbackUrl("x-meetup-demo://app");
		
		c = new Client();
		c.setClientSettings(settings);
	}
	
	public Client getClient()
	{
		c.setUseOAuth(oauth);
		return c;
	}
	
	
	public void assertEvents(List<Event> events)
	{
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
		for (Event e : events)
		{
			assertTrue(e);
		}
	}
	
	public void assertTrue(Event e)
	{
		assertNotNull(e);
		
	}

	public void test() throws Exception
	{
		String className = this.getClass().getName().toLowerCase();
		
		if (className.indexOf("oauth") != -1)
		{
			oauth = true;
		}
		else
		{
			oauth = false;
		}
		
		Method[] allMethods = this.getClass().getMethods();
	
		
		for (Method m : allMethods)
		{
			if (m.getName().startsWith("call"))
			{
				try
				{
					invokeMethod(m);
				}
				catch (Exception ex)
				{
					Throwable cause = ex.getCause();
					
					if (cause instanceof UserAuthorizationRequiredException)
					{
						String url = ((UserAuthorizationRequiredException) cause).getUrl();
						
						JOptionPane.showInputDialog(null, "URL:  " + url, url);
						
						getClient().fetchAccessToken();
						
						invokeMethod(m);
					}
				}
			}
		}
		
	}
	
	public void invokeMethod(Method m) throws Exception
	{
		m.invoke(this, new Object[0]);
	}
}
