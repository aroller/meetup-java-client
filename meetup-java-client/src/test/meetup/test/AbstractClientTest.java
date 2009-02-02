
package meetup.test;

import junit.framework.TestCase;
import meetup.*;
import java.util.*;

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

}
