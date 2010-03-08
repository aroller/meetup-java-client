
package meetup.internal.xstream;

/**
 * 
 * handle <rsvp_cutoff> elements
 *
 */
public class RsvpCutoffConverter extends CalendarConverter
{
	@Override
	public Object fromString(String s)
	{
		if (s == null)
		{
			return null;
		}
		else if (s.equalsIgnoreCase("None"))
		{
			return null;
		}
		else
		{
			return super.fromString(s);
		}
	}
}
