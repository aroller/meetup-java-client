
package meetup.test;

import meetup.*;
import java.util.*;

public class GroupTest extends AbstractClientTest
{
	 
	
	public void testGetGroupsByZipCode() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setZipCode("97203");
		List<Group> groups = c.getGroups(crit);
		
		assertNotNull(groups);
		
		assertTrue(groups.size() > 0);
		
	}
	
}
