package com.aawhere.meetup.model;

import java.net.URL;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Member {

	private Long id;
	/**
	 * id name used when member is embedded
	 * 
	 * @see #getId()
	 */
	@SerializedName("member_id")
	private Long memberId;
	private String name;
	private String bio;
	private URL link;
	private MemberPhoto photo;
	private Double latitude;
	private Double longitude;
	private String country;
	private String city;
	private String state;

	private Date visited;
	private Date joined;

	@Override
	public String toString() {
		return ToStringBuilder.build(this);
	}

	public String getName() {
		return name;
	}

	public String getBio() {
		return bio;
	}

	public URL getLink() {
		return link;
	}

	public MemberPhoto getPhoto() {
		return photo;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Date getVisited() {
		return visited;
	}

	public Date getJoined() {
		return joined;
	}

	public Long getId() {
		return (id != null) ? id : memberId;
	}

	public static class Builder {
		private Member member;

		public Builder() {
			this.member = new Member();
		}

		public Builder id(Long id) {
			this.member.id = id;
			return this;
		}

		public Builder id(String id) {
			return id(Long.parseLong(id));
		}

		public Member build() {
			Member built = member;
			this.member = null;
			return built;
		}
	}

}
