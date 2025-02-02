package com.podio.app;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect()
public class Application implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The id of the app
	 */
	private long id;

	/**
	 * The original app that this app was a copy of
	 */
	private Long original;

	/**
	 * The revision of the original app at the time of copy
	 */
	private Long originalRevision;

	/**
	 * The id of the space on which the app is placed
	 */
	private long spaceId;

	/**
	 * The owner of the app, which has special access to the app
	 */
	private long ownerId;

	/**
	 * The configuration of the app
	 */
	private ApplicationConfiguration configuration;

	private List<ApplicationField> fields;

	@JsonProperty("app_id")
	public long getId() {
		return id;
	}

	@JsonProperty("app_id")
	public void setId(long id) {
		this.id = id;
	}

	public Long getOriginal() {
		return original;
	}

	public void setOriginal(Long original) {
		this.original = original;
	}

	@JsonProperty("original_revision")
	public Long getOriginalRevision() {
		return originalRevision;
	}

	@JsonProperty("original_revision")
	public void setOriginalRevision(Long originalRevision) {
		this.originalRevision = originalRevision;
	}

	@JsonProperty("space_id")
	public long getSpaceId() {
		return spaceId;
	}

	@JsonProperty("space_id")
	public void setSpaceId(long spaceId) {
		this.spaceId = spaceId;
	}

	@JsonProperty("owner_id")
	public long getOwnerId() {
		return ownerId;
	}

	@JsonProperty("owner_id")
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	@JsonProperty("config")
	public ApplicationConfiguration getConfiguration() {
		return configuration;
	}

	@JsonProperty("config")
	public void setConfiguration(ApplicationConfiguration configuration) {
		this.configuration = configuration;
	}

	public List<ApplicationField> getFields() {
		return fields;
	}

	public void setFields(List<ApplicationField> fields) {
		this.fields = fields;
	}
}
