/**
 * ContainerProxy
 *
 * Copyright (C) 2016-2019 Open Analytics
 *
 * ===========================================================================
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License as published by
 * The Apache Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program.  If not, see <http://www.apache.org/licenses/>
 */
package eu.openanalytics.containerproxy.service;

import java.util.Map;

import com.spotify.docker.client.messages.PortBinding;

public class ExistingContaienrInfo {
		
	public ExistingContaienrInfo(String containerId, String proxyId, String proxySpecId, String image, String userId, Map<Integer, Integer>  portBindings, long startupTimestamp, boolean running) {
		this.containerId = containerId;
		this.proxyId = proxyId;
		this.proxySpecId = proxySpecId;
		this.image = image;
		this.userId = userId;
		this.portBindings = portBindings;
		this.startupTimestamp = startupTimestamp;
		this.running = running;
	}
	
	private String containerId;
	private String proxyId;
	private String proxySpecId;
	private String image;
	private String userId;
	private Map<Integer, Integer> portBindings;
	private long startupTimestamp;
	private boolean running;
	
	public String getContainerId() {
		return containerId;
	}
	
	public String getProxyId() {
		return proxyId;
	}

	public String getProxySpecId() {
		return proxySpecId;
	}

	public String getImage() {
		return image;
	}

	public String getUserId() {
		return userId;
	}
	
	public Map<Integer, Integer> getPortBindings() {
		return portBindings;
	}
	
	public long getStartupTimestamp() {
		return startupTimestamp;
	}
	
	public boolean getRunning() {
		return running;
	}
	
	// TODO copy?
}