
package meetup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Util
{
	public static final String DATE_PATTERN = "EEE MMM dd HH:dd:mm zzz yyyy";
	
	static public String toString(List<String> listOfStrings)
	{
		StringBuilder sb = new StringBuilder();
		
		for (String s : listOfStrings)
		{
			sb.append(s);
			sb.append(",");
		}
		
		return sb.toString();
	}
	
	static public Calendar toCalendar(String s)
	{
		
		SimpleDateFormat fmt = new SimpleDateFormat(Util.DATE_PATTERN);
		
		try
		{
			Date d = fmt.parse(s);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			
			return c;
		} 
		catch (ParseException e)
		{
			throw new RuntimeException(e);
		}
	}

	static public String toString(Calendar c)
	{
		
		SimpleDateFormat fmt = new SimpleDateFormat(Util.DATE_PATTERN);
		
		return fmt.format(c.getTime());
	}

}
