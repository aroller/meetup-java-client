package com.aawhere.meetup.model;

import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * Event
 *
 */
public class Event {
	private Long id;
	private String longitude;
	private String latitude;

	@SerializedName("rsvpcount")
	private Integer rsvpCount;

	@SerializedName("maybe_rsvpcount")
	private Integer maybeRsvpCount;

	private String groupName;

	private String groupId;

	@SerializedName("feecurrency")
	private String feeCurrency;
	private Date time;
	private Date updated;

	@SerializedName("ismeetup")
	private Boolean isMeetup;

	private Boolean allowMaybeRsvp;

	@SerializedName("no_rsvpcount")
	private Boolean noRsvpCount;

	@SerializedName("event_url")
	private String eventUrl;

	private Integer attendeeCount;

	private Integer rsvpLimit;

	private String organizerId;
	private String organizerName;

	@SerializedName("venue_lon")
	private String venueLongitude;
	@SerializedName("venue_lat")
	private String venueLatitude;
	private BigDecimal fee;

	private Venue venue;
	private String description;
	private String photoUrl;

	private String groupPhotoUrl;

	@SerializedName("feedesc")
	private String feeDescription;
	private String questions;
	private String name;

	@SerializedName("myrsvp")
	private String myRsvp;

	private String status;

	private Boolean rsvpClosed;

	public Long getId() {
		return id;
	}

	public Date getTime() {
		return time;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public Integer getRsvpCount() {
		return rsvpCount;
	}

	public Integer getMaybeRsvpCount() {
		return maybeRsvpCount;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getFeeCurrency() {
		return feeCurrency;
	}

	public Date getUpdated() {
		return updated;
	}

	public Boolean getIsMeetup() {
		return isMeetup;
	}

	public Boolean getAllowMaybeRsvp() {
		return allowMaybeRsvp;
	}

	public Boolean getNoRsvpCount() {
		return noRsvpCount;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public Integer getAttendeeCount() {
		return attendeeCount;
	}

	public Integer getRsvpLimit() {
		return rsvpLimit;
	}

	public String getOrganizerId() {
		return organizerId;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public String getVenueLongitude() {
		return venueLongitude;
	}

	public String getVenueLatitude() {
		return venueLatitude;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public Venue getVenue() {
		return venue;
	}

	public String getDescription() {
		return description;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public String getGroupPhotoUrl() {
		return groupPhotoUrl;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public String getQuestions() {
		return questions;
	}

	public String getName() {
		return name;
	}

	public String getMyRsvp() {
		return myRsvp;
	}

	public String getStatus() {
		return status;
	}

	public Boolean getRsvpClosed() {
		return rsvpClosed;
	}

}
