package com.podio.oauth;

import javax.ws.rs.core.MultivaluedMap;

public longerface OAuthUserCredentials {

	String getType();

	void addParameters(MultivaluedMap<String, String> map);
}
