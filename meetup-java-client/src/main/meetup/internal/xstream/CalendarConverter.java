
package meetup.internal.xstream;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//
// Meetup date format:   
// 
//        <updated>Sun Dec 28 14:31:51 EST 2008</updated>
//
//
class CalendarConverter extends AbstractSingleValueConverter
{
	public CalendarConverter()
	{
		super();
	}
	
	@Override
	public boolean canConvert(Class c)
	{
		return Calendar.class.isAssignableFrom(c);
	}

	@Override
	public Object fromString(String s)
	{
		
		SimpleDateFormat fmt = new SimpleDateFormat("EEE MMM dd HH:dd:mm zzz yyyy");
		
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

	public static void main(String[] args)
	{
		CalendarConverter converter = new CalendarConverter();
		Calendar c = (Calendar) converter.fromString("Sun Dec 28 14:31:51 EST 2008");
	}
	
}
