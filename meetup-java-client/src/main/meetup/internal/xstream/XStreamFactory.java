
package meetup.internal.xstream;

import meetup.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ToStringConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamFactory
{

	
	public static XStream createXStream(Class clazz) 
	{
		
		XStream xstream;
		
		xstream = new XStream(new DomDriver());
		
 		xstream.registerConverter(new CalendarConverter(), XStream.PRIORITY_VERY_HIGH);
 		

		xstream.alias("results", Response.class);
		xstream.aliasField("head", Response.class, "header");
		
		xstream.alias("head", Response.Header.class);
		xstream.aliasField("lon", Response.Header.class, "longitude");
		xstream.aliasField("lat", Response.Header.class, "latitude");
		xstream.aliasField("total_count", Response.Header.class, "totalCount");
		
		
 		if (clazz == Group.class)
 		{
 			xstream.aliasField("items", Response.class, "groups");
 			xstream.alias("item", Group.class);
 			xstream.aliasField("lat", Group.class, "latitude");
 			xstream.aliasField("lon", Group.class, "longitude");
 			xstream.aliasField("organizerProfileURL", Group.class, "organizerProfileUrl");
 		}
 		else if (clazz == Topic.class)
 		{
 			xstream.aliasField("items", Response.class, "topics");
 			xstream.alias("item", Topic.class);
 			xstream.aliasField("lat", Topic.class, "latitude");
 			xstream.aliasField("lon", Topic.class, "longitude");
 		}
 		else if (clazz == Event.class)
 		{
 			xstream.alias("item", Event.class);
 			xstream.aliasField("items", Response.class, "events");
 			xstream.aliasField("ismeetup", Event.class,  "isMeetup");
 			xstream.aliasField("lat", Event.class, "latitude");
 			xstream.aliasField("lon", Event.class, "longitude");
 			xstream.aliasField("venue_lat", Event.class, "venueLatitude");
 			xstream.aliasField("venue_lon", Event.class, "venueLongitude");
 			xstream.aliasField("venue_name", Event.class, "venueName");
 			xstream.aliasField("group_name", Event.class, "groupName");
 			xstream.aliasField("attendee_count", Event.class, "attendeeCount");
 			xstream.aliasField("rsvpcount", Event.class, "rsvpCount");
 			xstream.aliasField("photo_url", Event.class, "photoUrl");
 			xstream.aliasField("event_url", Event.class, "eventUrl");
 			xstream.aliasField("feedesc", Event.class, "feeDescription");
 			xstream.aliasField("feecurrency", Event.class, "feeCurrency");
 		}
 		else
 		{
 			throw new IllegalArgumentException("unexpected class: " + clazz.getName());
 		}
 		
		return xstream;
		
	}
}
