
package meetup.internal.xstream;

import com.thoughtworks.xstream.mapper.MapperWrapper;
import java.util.*;

public class CustomMapper extends MapperWrapper
{
	public CustomMapper(MapperWrapper wrapped)
	{
		super(wrapped);
	}

    public String realMember(Class type, String originalNodeName) 
    {
    		String result = null;
    		
        String fieldName = super.realMember(type, originalNodeName);
        
        if (fieldName == null)
        {
        		result = null;
        }
        else if (originalNodeName.equals("lat"))
        {
        		result = "latitude";
        }
        else if (originalNodeName.equals("lon"))
        {
        		result = "longitude";
        }
        else if (hasUnderscore(fieldName))
        {
        		result = calculateFieldName(fieldName);
        }
        else
        {
        		result = fieldName;
        }
        
        System.out.println(originalNodeName + "|" + fieldName + "|" + result);
        
        return result;
    }
    
    protected boolean hasUnderscore(String s)
    {
    		return (s.indexOf('_') != -1);
    }
    
    protected String calculateFieldName(String fieldName)
    {
        StringBuilder result = new StringBuilder();
        
        StringTokenizer tokenizer = new StringTokenizer(fieldName, "_");
        
        boolean firstToken = true;
        
        while (tokenizer.hasMoreTokens())
        {
        		String token = tokenizer.nextToken();
        		
    			char firstChar = token.charAt(0);
    			
    			if (firstToken)
    			{
    				firstChar = Character.toLowerCase(firstChar);
    			}
    			else
    			{
    				firstChar = Character.toUpperCase(firstChar);
    			}
    			
			token = firstChar + token.substring(1);
        		
        		result.append(token);
        		
        		firstToken = false;
        }
        
        return result.toString();
    }

	
}
