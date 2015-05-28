
package meetup.test;

import meetup.*;
import java.util.*;

public class GroupTest extends AbstractClientTest
{
	 
	
	public void testGetGroupsByZipCode() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setZipCode("97203");
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}
	
	public void testGetGroupsBoston() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setCity("Boston");
		crit.setState("MA");
		crit.setCountry("US");
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}
	
	public void testGetGroupsLondon() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setCity("London");
		crit.setState("Greater London");
		crit.setCountry("GB");
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}


	public void testGetGroupsRio() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();

		crit.setCity("Rio de Janeiro");
		crit.setState("Rio de Janeiro");
		crit.setCountry("BR"); // BR == Brazil
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	} 
}
