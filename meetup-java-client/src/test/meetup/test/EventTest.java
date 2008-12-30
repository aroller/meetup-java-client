
package meetup.test;

import meetup.*;
import java.util.*;

public class EventTest extends AbstractClientTest
{
	 

	public void testGetEventByZipCode() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setZipCode("97209");
		crit.setRadiusInMiles(2);
		
		List<Event> events = c.getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
		
	}
	
	public void testGetEventByLatLong() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
        // PGE Park in Portland Oregon:   45.521694,-122.691806
		
		crit.setLatitude("45.521694");
		crit.setLongitude("-122.691806");
		crit.setRadiusInMiles(2);
		
		List<Event> events = c.getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
	}
	
	public void testGetEventByCity() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setCity("Chicago");
		crit.setState("IL");
		crit.setCountry("US");
		
		List<Event> events = c.getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
	}
	
}
