package com.aawhere.meetup.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventUnitTest {

	public static final String UPCOMING_EVENT_FILENAME = "meetup-event-upcoming-222366956.json";

	@Test
	public void testUpcomingEvent() {
		Event event = JsonParserTestUtil.read(UPCOMING_EVENT_FILENAME, Event.class);
		assertNotNull(event);
	}
}
