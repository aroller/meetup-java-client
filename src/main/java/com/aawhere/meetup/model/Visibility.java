package com.aawhere.meetup.model;

import com.google.gson.annotations.SerializedName;

/**
 * General visibility that describes access control of a resource like {@link Event}.
 * 
 * @author aroller
 *
 */
public enum Visibility {

	/** */
	@SerializedName("public")
	PUBLIC,
	/** */
	@SerializedName("members")
	MEMBERS,
	/** */
	@SerializedName("public_limited")
	PUBLIC_LIMITED;
}
