package com.aawhere.meetup.model;

import com.google.gson.annotations.SerializedName;

public class Venue {

	private Long id;
	private Integer zip;
	private String country;
	private String phone;
	@SerializedName("address_1")
	private String address1;
	private String name;
	private Double lat;
	private Double lon;
	private String state;
	private Boolean repinned;

	public Long getId() {
		return id;
	}

	public Integer getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress1() {
		return address1;
	}

	public String getName() {
		return name;
	}

	public Double getLat() {
		return lat;
	}

	public Double getLon() {
		return lon;
	}

	public String getState() {
		return state;
	}

	public Boolean getRepinned() {
		return repinned;
	}

}
