package com.podio.contact;


public class ProfileMini extends ProfileBase {

	private static final long serialVersionUID = 1L;

	private Long avatar;

	private String name;

	@Override
	public String toString() {
		return "ProfileMini [profileId=" + getProfileId() + ", avatar="
				+ avatar + ", name=" + name + "]";
	}

	public Long getAvatar() {
		return avatar;
	}

	public void setAvatar(Long avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
