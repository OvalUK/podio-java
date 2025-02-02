package com.podio.space;

import org.codehaus.jackson.annotate.JsonProperty;

public class SpaceCreate extends SpaceUpdate {

	private long orgId;

	public SpaceCreate(String name, boolean postOnNewApp,
			boolean postOnNewMember, long orgId) {
		super(name, postOnNewApp, postOnNewMember);
		this.orgId = orgId;
	}

	@JsonProperty("org_id")
	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
}
