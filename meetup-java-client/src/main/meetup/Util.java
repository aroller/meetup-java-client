
package meetup;

import java.util.*;

public class Util
{
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
