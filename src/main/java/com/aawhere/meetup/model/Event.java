package com.aawhere.meetup.model;

import java.net.URL;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * The main entity at Meetup.
 * 
 * https://secure.meetup.com/meetup_api/console/?path=/2/event/:id
 * 
 * @see Events
 *
 */
public class Event {

	private Long id;
	private String name;
	private String description;
	private Date time;
	@SerializedName("event_url")
	private URL eventUrl;

	private String visibility;
	@SerializedName("group_id")
	private Long groupId;

	@SerializedName("group_urlname")
	private String groupUrlName;

	private Venue venue;
	@SerializedName("venue_visibility")
	private Boolean venueVisibility;

	@SerializedName("yes_rsvp_count")
	private Integer rsvpCount;

	@SerializedName("maybe_rsvpcount")
	private Integer maybeRsvpCount;

	@SerializedName("rsvp_limit")
	private Integer rsvpLimit;

	@SerializedName("photo_url")
	private String photoUrl;

	@SerializedName("feedesc")
	private String feeDescription;

	private String status;

	private Boolean rsvpClosed;
	private Date updated;

	public Long getId() {
		return id;
	}

	public Date getTime() {
		return time;
	}
}
