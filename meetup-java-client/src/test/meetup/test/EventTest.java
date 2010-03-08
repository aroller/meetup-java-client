
package meetup.test;

import meetup.*;
import java.util.*;

public class EventTest extends AbstractClientTest
{
	 

	public void callGetEventByZipCode() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setZipCode("97209");
		crit.setRadiusInMiles(100);
		
		List<Event> events = getClient().getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
		
	}
	
	public void callGetEventByLatLong() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
        // PGE Park in Portland Oregon:   45.521694,-122.691806
		
		crit.setLatitude("45.521694");
		crit.setLongitude("-122.691806");
		crit.setRadiusInMiles(2);
		
		List<Event> events = getClient().getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
	}
	
	public void callGetEventByCity() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setCity("Chicago");
		crit.setState("IL");
		crit.setCountry("US");
		
		List<Event> events = getClient().getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
	}

	public void callBeforeAndAfter() throws Exception
	{
		EventSearchCriteria crit = new EventSearchCriteria();
		
		crit.setCity("Chicago");
		crit.setState("IL");
		crit.setCountry("US");
		
		Calendar after = Calendar.getInstance();
		after.add(Calendar.DAY_OF_YEAR, 1);
		
		Calendar before = Calendar.getInstance();
		before.add(Calendar.DAY_OF_YEAR, 5);

		crit.setBefore(before);
		crit.setAfter(after);
		
		List<Event> events = getClient().getEvents(crit);
		
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
	}
}
