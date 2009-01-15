
package meetup.test;

import junit.framework.TestCase;
import meetup.*;
import java.util.*;

public abstract class AbstractClientTest extends TestCase
{
	protected Client c;
	 
	public void setUp() 
	{
		
		ClientSettings settings = new ClientSettings();
		settings.setMeetupKey("116528185c6768552f13a6171217fb");
		
		// todo (?) Token userToken = new Token("", "");
		// settings.setUserSpecificAccessToken(userToken);
		
		c = new Client();
		c.setClientSettings(settings);
		
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
