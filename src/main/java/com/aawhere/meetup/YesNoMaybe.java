package com.aawhere.meetup;

public enum YesNoMaybe {
	YES, NO, MAYBE;

	public String getLowerCaseName() {
		return this.name().toLowerCase();
	}
}
