package com.podio.app;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Dependencies implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Application> apps;

	private Map<Long, List<Long>> dependencies;

	public List<Application> getApps() {
		return apps;
	}

	public void setApps(List<Application> apps) {
		this.apps = apps;
	}

	public Map<Long, List<Long>> getDependencies() {
		return dependencies;
	}

	public void setDependencies(Map<Long, List<Long>> dependencies) {
		this.dependencies = dependencies;
	}
}
