package com.aawhere.meetup.model;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

public class RsvpsUnitTest {

	public static final Long MEMBER_ID = new Long(187678769);
	public static final Long VENUE_ID = new Long(689963);
	public static final Date EVENT_START = new Date(1432825200000l);
	public static final Long EVENT_ID = new Long(222835109);
	public static final String RSVPS_FILENAME = "meetup-rsvps-222835109.json";

	@Test
	public void testEvent222835109Rsvps() {
		Rsvps rsvps = JsonParserTestUtil.read(RSVPS_FILENAME, Rsvps.class);

		final List<Rsvp> results = rsvps.getResults();
		assertNotNull(results);
		assertEquals(2, results.size());

		Rsvp rsvp = results.iterator().next();
		assertEquals("rsvp_id", new Long(1553124106), rsvp.getId());

		Venue venue = rsvp.getVenue();
		assertNotNull(venue);
		assertEquals(VENUE_ID, venue.getId());

		Event event = rsvp.getEvent();
		assertNotNull(event);
		assertEquals(EVENT_ID, event.getId());
		assertEquals(EVENT_START, event.getTime());

		assertNotNull(rsvp.getMember());
		assertEquals(MEMBER_ID, rsvp.getMember().getId());
	}

}
