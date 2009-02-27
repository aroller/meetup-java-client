
package meetup.test;

import junit.framework.TestCase;
import meetup.*;

import java.lang.reflect.Method;
import java.util.*;

import javax.swing.JOptionPane;

public abstract class AbstractClientTest extends TestCase
{
	private MeetupClient c;
	protected boolean oauth = false;
	
	public void setUp() 
	{
		
		ClientSettings settings = new ClientSettings();
		
		settings.setMeetupKey("116528185c6768552f13a6171217fb");
		settings.setConsumerToken(new Token("verb.for.shoe", "f5281e69ea6b3c14399b67b8"));
		settings.setOAuthCallbackUrl("x-meetup-demo://app");
		
		c = new MeetupClient();
		c.setClientSettings(settings);
	}
	
	public MeetupClient getClient()
	{
		c.setUseOAuth(oauth);
		return c;
	}
	
	
	public void assertEvents(List<Event> events)
	{
		assertNotNull(events);
		
		assertTrue(events.size() > 0);
		
		for (Event e : events)
		{
			assertValid(e);
		}
	}
	
	public void assertValid(Event e)
	{
		assertNotNull(e);
	
		assertNotNull(e.getDescription());
		
		assertNotNull(e.getEventUrl());
		
		assertNotNull(e.getId());
		
		assertNotNull(e.getTime());
		
		assertNotNull(e.getUpdated());
		
		assertNotNull(e.getName());
		
		assertNotNull(e.getGroupName());
		
		assertNotNull(e.getAttendeeCount());
	}

	public void assertTopics(List<Topic> topics)
	{
		assertNotNull(topics);
		
		assertTrue(topics.size() > 0);
		
		for (Topic t : topics)
		{
			assertValid(t);
		}
	}
	
	public void assertValid(Topic t)
	{
		assertNotNull(t);
		assertNotNull(t.getDescription());
		assertNotNull(t.getId());
		assertNotNull(t.getUpdated());
		assertNotNull(t.getLink());
		assertNotNull(t.getMembers());
	}

	protected void assertGroups(List<Group> groups)
	{
		assertNotNull(groups);
		
		assertTrue(groups.size() > 0);
		
		for (Group g : groups)
		{
			assertValid(g);
		}
	}
	
	protected void assertValid(Group g)
	{
		
		assertNotNull(g);
		
		assertNotNull(g.getId());
		
		assertNotNull(g.getCreated());
		
		assertNotNull(g.getDescription());
		
		assertNotNull(g.getUpdated());
		
		assertNotNull(g.getCountry());
		
		assertNotNull(g.getName());
		
	}
	
	public void test() throws Exception
	{
		String className = this.getClass().getName().toLowerCase();
		
		if (className.indexOf("oauth") != -1)
		{
			oauth = true;
		}
		else
		{
			oauth = false;
		}
		
		Method[] allMethods = this.getClass().getMethods();
	
		
		for (Method m : allMethods)
		{
			if (m.getName().startsWith("call"))
			{
				try
				{
					invokeMethod(m);
				}
				catch (Exception ex)
				{
					Throwable cause = ex.getCause();
					
					if (cause instanceof UserAuthorizationRequiredException)
					{
						String url = ((UserAuthorizationRequiredException) cause).getUrl();
						
						JOptionPane.showInputDialog(null, "URL:  " + url, url);
						
						getClient().fetchAccessToken();
						
						invokeMethod(m);
					}
					else
					{
						throw ex;
					}
				}
			}
		}
		
	}
	
	public void invokeMethod(Method m) throws Exception
	{
		m.invoke(this, new Object[0]);
	}
}
