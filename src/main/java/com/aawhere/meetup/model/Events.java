package com.aawhere.meetup.model;

import java.util.List;

/**
 * https://secure.meetup.com/meetup_api/console/?path=/2/events
 * 
 * @author aroller
 *
 */
public class Events {

	private List<Event> results;

	public List<Event> getResults() {
		return results;
	}
}
