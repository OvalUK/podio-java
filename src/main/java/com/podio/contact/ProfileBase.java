package com.podio.contact;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class ProfileBase implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The id of the profile
	 */
	private Long profileId;

	/**
	 * The id of the user
	 */
	private Long userId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + profileId.intValue();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileBase other = (ProfileBase) obj;
		if (profileId != other.profileId)
			return false;
		return true;
	}

	@JsonProperty("profile_id")
	public Long getProfileId() {
		return profileId;
	}

	@JsonProperty("profile_id")
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	@JsonProperty("user_id")
	public Long getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
