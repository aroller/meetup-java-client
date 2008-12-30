
package meetup.internal.xstream;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

public class IntConverter extends AbstractSingleValueConverter
{

	@Override
	public boolean canConvert(Class clazz)
	{
		return (clazz.equals(int.class) || clazz.equals(Integer.class));
	}

	@Override
	public Object fromString(String s)
	{
		if (s == null)
		{
			return null;
		}
		else if (s.trim().length() == 0)
		{
			return null;
		}
		else
		{
			return new Integer(Integer.parseInt(s));
		}
	}

}
