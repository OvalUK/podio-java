package com.podio.item;

import org.codehaus.jackson.annotate.JsonProperty;

import com.podio.common.CreatedBase;

public class ItemRevision extends CreatedBase {

	private static final long serialVersionUID = 1L;

	/**
	 * The revision number
	 */
	private long revision;

	/**
	 * The revision of the app at the time this item revision was made
	 */
	private int appRevision;

	public long getRevision() {
		return revision;
	}

	public void setRevision(long revision) {
		this.revision = revision;
	}

	@JsonProperty("app_revision")
	public long getAppRevision() {
		return appRevision;
	}

	@JsonProperty("app_revision")
	public void setAppRevision(int appRevision) {
		this.appRevision = appRevision;
	}
}
