package com.aawhere.meetup.model;

import com.google.gson.annotations.SerializedName;

public class Rsvp {
	public Long getId() {
		return id;
	}

	@SerializedName("rsvp_id")
	private Long id;
	private String name;
	private String link;
	private String comment;
	private String latitude;
	private String longitude;
	private String city;
	private String country;
	private String state;
	private String answers;

	private Venue venue;
	private Event event;
	private Member member;
	private MemberPhoto memberPhoto;

	public Event getEvent() {
		return event;
	}

	public Venue getVenue() {
		return venue;
	}

	public String getName() {
		return name;
	}

	public String getLink() {
		return link;
	}

	public String getComment() {
		return comment;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getAnswers() {
		return answers;
	}

	@Override
	public String toString() {
		return ToStringBuilder.build(this);
	}

	public Member getMember() {
		return member;
	}

	public MemberPhoto getMemberPhoto() {
		return memberPhoto;
	}
}
