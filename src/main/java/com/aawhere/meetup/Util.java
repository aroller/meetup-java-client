package com.aawhere.meetup;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class Util {
	public static final String DATE_PATTERN = "EEE MMM dd HH:dd:mm zzz yyyy";

	static public String toString(List<String> listOfStrings) {
		StringBuilder sb = new StringBuilder();

		for (String s : listOfStrings) {
			sb.append(s);
			sb.append(",");
		}

		return sb.toString();
	}

	static public Calendar toCalendar(String s) {

		SimpleDateFormat fmt = new SimpleDateFormat(Util.DATE_PATTERN);

		try {
			Date d = fmt.parse(s);
			Calendar c = Calendar.getInstance();
			c.setTime(d);

			return c;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	static public String toString(Calendar c) {

		SimpleDateFormat fmt = new SimpleDateFormat(Util.DATE_PATTERN);

		return fmt.format(c.getTime());
	}

	/**
	 * {@link Gson} ready to parse the standard response values into pojos.
	 * 
	 * @return
	 */
	static public Gson gson() {
		GsonBuilder

		builder = new GsonBuilder();
		// Register an adapter to manage the date types as long values
		// http://stackoverflow.com/questions/5671373/unparseable-date-1302828677828-trying-to-deserialize-with-gson-a-millisecond
		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {

			@Override
			public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
					throws JsonParseException {
				return new Date(json.getAsJsonPrimitive().getAsLong());
			}

		});

		return builder.create();
	}

}
