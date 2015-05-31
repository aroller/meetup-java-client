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

	public enum Status {

		/** */
		@SerializedName("cancelled")
		CANCELLED,
		/** */
		@SerializedName("upcoming")
		UPCOMING,

		/** */
		@SerializedName("past")
		PAST,

		/** */
		@SerializedName("proposed")
		PROPOSED,

		/** */
		@SerializedName("suggested")
		SUGGESTED,

		/** */
		@SerializedName("draft")
		DRAFT;
	}

	private Long id;
	private String name;
	private String description;
	private Date time;
	@SerializedName("event_url")
	private URL eventUrl;

	private Visibility visibility;
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
	private URL photoUrl;

	private Status status;

	private Date updated;

	public Long getId() {
		return id;
	}

	public Date getTime() {
		return time;
	}

	public Venue getVenue() {
		return venue;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public Status getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public URL getEventUrl() {
		return eventUrl;
	}

	public Long getGroupId() {
		return groupId;
	}

	public String getGroupUrlName() {
		return groupUrlName;
	}

	public Boolean getVenueVisibility() {
		return venueVisibility;
	}

	public Integer getRsvpCount() {
		return rsvpCount;
	}

	public Integer getMaybeRsvpCount() {
		return maybeRsvpCount;
	}

	public Integer getRsvpLimit() {
		return rsvpLimit;
	}

	public URL getPhotoUrl() {
		return photoUrl;
	}

	public Date getUpdated() {
		return updated;
	}

}
