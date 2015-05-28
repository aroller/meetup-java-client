
package meetup.test;

import meetup.*;
import java.util.*;

public class TopicTest extends AbstractClientTest
{
	 
	
	public void testTopicSearch() throws Exception
	{
		
		TopicSearchCriteria crit = new TopicSearchCriteria();
		
		crit.setSearch("photography");
		
		List<Topic> topics = getClient().getTopics(crit);
		
		assertTopics(topics);
	
		Topic t = topics.get(0);
		
		crit = new TopicSearchCriteria();
		crit.setName(t.getName());
		
		topics = getClient().getTopics(crit);
		
		assertTopics(topics);
		
	}
	
}
