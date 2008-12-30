
package meetup.test;

import meetup.*;
import java.util.*;

public class TopicTest extends AbstractClientTest
{
	 
	
	public void testTopicSearchByKeyword() throws Exception
	{
		TopicSearchCriteria crit = new TopicSearchCriteria();
		
		crit.setSearch("photography");
		List<Topic> topics = c.getTopics(crit);
		
		assertNotNull(topics);
		
		assertTrue(topics.size() > 0);
		
	}
	
}
