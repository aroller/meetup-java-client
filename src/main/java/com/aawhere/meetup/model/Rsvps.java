package com.aawhere.meetup.model;

import java.util.Iterator;
import java.util.List;

public class Rsvps
		implements Iterable<Rsvp> {

	private List<Rsvp> results;

	public List<Rsvp> getResults() {
		return results;
	}

	@Override
	public Iterator<Rsvp> iterator() {
		return results.iterator();
	}

}
