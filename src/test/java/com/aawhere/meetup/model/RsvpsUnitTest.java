package com.aawhere.meetup.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class RsvpsUnitTest {

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
		assertEquals(689963, venue.getId().intValue());
	}

}
