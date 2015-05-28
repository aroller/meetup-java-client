package com.aawhere.meetup.model;

import java.net.URL;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the photo of a member, which is different than a {@link Photo}.
 * 
 * http://www.meetup.com/meetup_api/docs/2/members/
 * 
 * @author aroller
 *
 */
public class MemberPhoto {

	@SerializedName("photo_id")
	private Long id;

	@SerializedName("highres_link")
	private URL highResolutionUrl;

	@SerializedName("photo_link")
	private URL photoUrl;

	@SerializedName("thumb_link")
	private URL thumbnailPhoUrl;

	public Long getId() {
		return id;
	}

	public URL getHighResolutionUrl() {
		return highResolutionUrl;
	}

	public URL getPhotoUrl() {
		return photoUrl;
	}

	public URL getThumbnailPhoUrl() {
		return thumbnailPhoUrl;
	}

}
