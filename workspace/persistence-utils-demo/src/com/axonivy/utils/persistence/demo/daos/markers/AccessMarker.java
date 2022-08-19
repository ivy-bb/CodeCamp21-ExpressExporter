package com.axonivy.utils.persistence.demo.daos.markers;

import com.axonivy.persistence.dao.markers.QueryMarker;
import com.axonivy.utils.persistence.demo.enums.AccessRestriction;

/**
 * Switch access restrictions on or off.
 */
public class AccessMarker implements QueryMarker {
	private final AccessRestriction accessRestriction;

	public static final AccessMarker AUTHORIZED = new AccessMarker(AccessRestriction.AUTHORIZED);
	public static final AccessMarker ALL = new AccessMarker(AccessRestriction.ALL);

	private AccessMarker(AccessRestriction accessRestriction) {
		this.accessRestriction = accessRestriction;
	}

	public AccessRestriction getAccessRestriction() {
		return accessRestriction;
	}
}
