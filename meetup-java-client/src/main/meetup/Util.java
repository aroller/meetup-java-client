
package meetup;

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
	
}
