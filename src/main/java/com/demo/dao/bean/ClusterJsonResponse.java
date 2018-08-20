package com.demo.dao.bean;

import java.util.Map;

public class ClusterJsonResponse {

	private Cluster cluster;
	private boolean validated;
	private Map<String, String> errorMessages;
	
	public Cluster getCluster() {
		return cluster;
	}
	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	
	
}
