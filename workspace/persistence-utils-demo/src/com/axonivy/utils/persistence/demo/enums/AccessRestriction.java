package com.axonivy.utils.persistence.demo.enums;

/** 
 * Specify access restrictions. Refer to AccessMarker
 */
public enum AccessRestriction {
	/**
	 * Access all objects (i.e. switch off access check).
	 */
	ALL,
	/**
	 * Access only authorized objects.
	 */
	AUTHORIZED,
	/**
	 * The DAO decides whether ALL or AUTHORIZED is default..
	 */
	DEFAULT;
}