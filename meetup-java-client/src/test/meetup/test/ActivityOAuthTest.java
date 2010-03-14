
package meetup.test;

import meetup.*;
import java.util.*;

public class ActivityOAuthTest extends AbstractClientTest
{
	 

	public void callGetActivities() throws Exception
	{
		ActivitySearchCriteria crit = new ActivitySearchCriteria();
		
		crit.setPageStart(1);
		
		List<Activity> acts = getClient().getActivities(crit);
		
		assertNotNull(acts);
		
		assertTrue(acts.size() > 0);
		
		for (Activity a : acts)
		{
			System.out.println(a.getGroupName() + ": " + a.getTitle());
		}
		
	}

}
