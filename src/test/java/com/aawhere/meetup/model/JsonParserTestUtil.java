package com.aawhere.meetup.model;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.aawhere.meetup.Util;
import com.google.gson.Gson;

public class JsonParserTestUtil {

	/**
	 * GIve the local filename stored in the folder with other meetup json and this will return you
	 * the object parsed from JSON.
	 * 
	 * @param filename
	 * @param type
	 * @return
	 */
	public static final <T> T read(String filename, Class<T> type) {
		InputStream inputStream = ClassLoader.getSystemResourceAsStream(filename);
		Gson gson = Util.gson();
		return gson.fromJson(new InputStreamReader(inputStream), type);
	}

}
