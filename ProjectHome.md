Java client library for the [Meetup API](http://www.meetup.com/meetup_api/)

### Features ###
  * compatible with Java 5 and Java 6
  * compatible with Android 1.0
  * supports OAuth
  * supports HTTP compression (gzip)

### Example code ###
```

   import meetup.*;

   ClientSettings settings = new ClientSettings();
   settings.setMeetupKey("foo");   

   Client c = new Client();
   c.setClientSettings(settings);

   EventSearchCriteria criteria = new EventSearchCriteria();
   criteria.setZipCode("97201");
   criteria.setRadiusInMiles(2);

   List<Event> events = c.getEvents(criteria);

   for (Event e : events) 
   {
       System.out.println(e.getName());
   }

```