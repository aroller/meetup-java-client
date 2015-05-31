package com.aawhere.meetup.model;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

public class EventUnitTest {

	private static final Long UPCOMING_ID = new Long(222366956);
	public static final String UPCOMING_EVENT_FILENAME = "meetup-event-upcoming-222366956.json";
	public static final String UPCOMING_EVENTS_FILENAME = "meetup-events-upcoming-member-187678769.json";

	@Test
	public void testUpcomingEvent() {
		Event event = JsonParserTestUtil.read(UPCOMING_EVENT_FILENAME, Event.class);
		assertNotNull(event);
		assertEquals("id", UPCOMING_ID, event.getId());
		assertEquals("time", new Date(1439046000000l), event.getTime());
		assertNotNull("venue", event.getVenue());
		assertEquals("visibility", Visibility.PUBLIC_LIMITED, event.getVisibility());
		assertEquals("status", Event.Status.UPCOMING, event.getStatus());
	}

	/**
	 * Expecting a limited version of the event found in {@link #UPCOMING_EVENT_FILENAME}
	 */
	@Test
	public void testUpcomingEvents() {
		Events events = JsonParserTestUtil.read(UPCOMING_EVENTS_FILENAME, Events.class);
		final List<Event> results = events.getResults();
		assertNotNull(results);
		assertEquals("even count", 1, results.size());
		assertEquals("event id", UPCOMING_ID, results.get(0).getId());

	}
}
