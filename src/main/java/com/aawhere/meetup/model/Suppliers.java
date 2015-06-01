package com.aawhere.meetup.model;

/**
 * Simple interface declarations allowing retrieval of common items across objects for use in
 * utilities for your application.
 * 
 * @author aroller
 *
 */
public class Suppliers {

	/**
	 * <code>	
	  public DateTimeZone timeZone(UtcOffsetSupplier supplier) {
		return DateTimeZone.forOffsetMillis(supplier.getUtcOffsetMillis());
	  }
	 * </code>
	 * 
	 * @author aroller
	 *
	 */
	public static interface UtcOffsetSupplier {
		Integer getUtcOffsetMillis();
	}

}
