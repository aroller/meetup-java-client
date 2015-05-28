
package meetup.internal.xstream;

import meetup.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ToStringConverter;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class XStreamFactory
{

	
	public static XStream createXStream(Class<?> clazz) 
	{
		
		// todo (future) : use XppDriver instead of DomDriver
		
	    XStream xstream = new XStream(new PureJavaReflectionProvider(), new DomDriver())
		{
			protected MapperWrapper wrapMapper(MapperWrapper next)
			{
				return new CustomMapper(next);
			}
		};
		
		xstream.autodetectAnnotations(true);
		
 		xstream.registerConverter(new CalendarConverter(), XStream.PRIORITY_VERY_HIGH);
 		xstream.registerConverter(new IntConverter(), XStream.PRIORITY_VERY_HIGH);
 		
		xstream.alias("results", Response.class);
		xstream.aliasField("head", Response.class, "header");
		
		xstream.alias("head", Response.Header.class);
		
		if (clazz == null)
		{
			throw new NullPointerException("clazz parameter is null");
		}
		else if (clazz == Group.class)
 		{
 			xstream.aliasField("items", Response.class, "groups");
 			xstream.alias("item", Group.class);
 			xstream.aliasField("topics", Group.class, "topics");
 			xstream.alias("topics_item", Topic.class);
 		}
 		else if (clazz == Topic.class)
 		{
 			xstream.aliasField("items", Response.class, "topics");
 			xstream.alias("item", Topic.class);
 		}
 		else if (clazz == Event.class)
 		{
 	 		// xstream.registerLocalConverter(Event.class, "rsvpCutoff", new RsvpCutoffConverter());
 			xstream.aliasField("items", Response.class, "events");
 			xstream.alias("item", Event.class);
 		}
 		else if (clazz == Activity.class)
 		{
 			xstream.aliasField("items", Response.class, "activities");
 			xstream.alias("item", Activity.class);
 		}
 		else
 		{
 			throw new IllegalArgumentException("unexpected class: " + clazz.getName());
 		}
 		
		return xstream;
		
	}
}
