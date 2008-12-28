
package meetup.test;

import junit.framework.TestCase;
import meetup.*;
import java.util.*;

public class MeetupClientTest extends TestCase
{
	protected Client c;
	 
	public void setUp() 
	{
		
		ClientSettings settings = new ClientSettings();
		settings.setMeetupKey("your-api-key");
		
		c = new Client();
		c.setClientSettings(settings);
		
	}

	public void testGetEvent() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setZipCode("97209");
		crit.setRadiusInMiles(2);
		
		List<Event> events = c.getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
	}
	
	public void testGetGroups() throws Exception
	{
		/*
		List<Group> groups = c.getGroups();
		
		assertNotNull(groups);
		
		assertTrue(groups.size() > 0); */
		
	}
	
	/*
	public void testGetTopics() throws Exception
	{
		// c.getTopics();
	} */
	
}
