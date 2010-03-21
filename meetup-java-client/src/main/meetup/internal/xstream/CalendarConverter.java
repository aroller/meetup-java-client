
package meetup.internal.xstream;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import meetup.Util;

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
		return Util.toCalendar(s);
	}

	public static void main(String[] args)
	{
		CalendarConverter converter = new CalendarConverter();
		Calendar c = (Calendar) converter.fromString("Sun Dec 28 14:31:51 EST 2008");
	}
	
}
