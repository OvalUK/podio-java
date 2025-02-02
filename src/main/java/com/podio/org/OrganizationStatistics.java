package com.podio.org;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

public class OrganizationStatistics {

	/**
	 * The id of the org
	 */
	private long id;

	/**
	 * number of all items in all apps in all spaces
	 */
	private long itemsCount;

	/**
	 * time when a user last logged in
	 */
	private DateTime lastActivityOn;

	/**
	 * number of all invitations
	 */
	private int availableInvitations;

	/**
	 * number of all apps in all spaces
	 */
	private int appsCount;

	/**
	 * number of spaces
	 */
	private int spacesCount;

	/**
	 * number of users in this org
	 */
	private int usersCount;

	public long getId() {
		return id;
	}

	@JsonProperty("org_id")
	public void setId(long id) {
		this.id = id;
	}

	public long getItemsCount() {
		return itemsCount;
	}

	@JsonProperty("items_count")
	public void setItemsCount(long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public DateTime getLastActivityOn() {
		return lastActivityOn;
	}

	@JsonProperty("last_activity_on")
	public void setLastActivityOn(DateTime lastActivityOn) {
		this.lastActivityOn = lastActivityOn;
	}

	public long getAvailableInvitations() {
		return availableInvitations;
	}

	@JsonProperty("available_invitations")
	public void setAvailableInvitations(int availableInvitations) {
		this.availableInvitations = availableInvitations;
	}

	public long getAppsCount() {
		return appsCount;
	}

	@JsonProperty("apps_count")
	public void setAppsCount(int appsCount) {
		this.appsCount = appsCount;
	}

	public long getSpacesCount() {
		return spacesCount;
	}

	@JsonProperty("spaces_count")
	public void setSpacesCount(int spacesCount) {
		this.spacesCount = spacesCount;
	}

	public long getUsersCount() {
		return usersCount;
	}

	@JsonProperty("users_count")
	public void setUsersCount(int usersCount) {
		this.usersCount = usersCount;
	}
}
