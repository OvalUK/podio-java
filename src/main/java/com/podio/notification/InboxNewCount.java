package com.podio.notification;

import org.codehaus.jackson.annotate.JsonProperty;

public class InboxNewCount {

	private int newNotifications;

	public long getNewNotifications() {
		return newNotifications;
	}

	@JsonProperty("new")
	public void setNewNotifications(int newNotifications) {
		this.newNotifications = newNotifications;
	}
}
