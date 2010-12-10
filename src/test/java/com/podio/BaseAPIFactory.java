package com.podio;

import java.util.HashMap;
import java.util.Map;

import com.podio.oauth.OAuthClientCredentials;
import com.podio.oauth.OAuthUserCredentials;
import com.podio.oauth.OAuthUsernameCredentials;

public class BaseAPIFactory {

	// Username and password for the test database
	// Don't bother trying it against api.podio.com, it won't work :)
	private static final Map<Integer, OAuthUserCredentials> CREDENTIALS_MAP = new HashMap<Integer, OAuthUserCredentials>();
	static {
		CREDENTIALS_MAP.put(1, new OAuthUsernameCredentials("dev@hoisthq.com",
				"AARehARgE1NFPQUv"));
		CREDENTIALS_MAP.put(2, new OAuthUsernameCredentials(
				"haugstrup@hoisthq.com", "bar"));
	}

	private static final Map<Integer, BaseAPI> API_MAP = new HashMap<Integer, BaseAPI>();

	public static BaseAPI get(int userId) {
		BaseAPI api = API_MAP.get(userId);
		if (api != null) {
			return api;
		}

		api = new BaseAPI("localhost", "localhost", 9090, false, true,
				new OAuthClientCredentials("dev@hoisthq.com",
						"CmACRWF1WBOTDfOa20A"), CREDENTIALS_MAP.get(userId));

		API_MAP.put(userId, api);

		return api;
	}

	public static BaseAPI get() {
		return get(1);
	}
}
