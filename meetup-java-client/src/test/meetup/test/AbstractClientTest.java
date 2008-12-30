
package meetup.test;

import junit.framework.TestCase;
import meetup.*;
import java.util.*;

public abstract class AbstractClientTest extends TestCase
{
	protected Client c;
	 
	public void setUp() 
	{
		
		ClientSettings settings = new ClientSettings();
		settings.setMeetupKey("api-key");
		
		c = new Client();
		c.setClientSettings(settings);
		
	}

}
