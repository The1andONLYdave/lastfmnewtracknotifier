#Dagger2
#Modular App (App and ApiWrapper)
#Android 5+
#moshi for json->kotlin objects

gets all last fm played tracks on first run like
http://ws.audioscrobbler.com/2.0/?method=user.getrecenttracks&user=the1andonlydave&format=json&limit=200

   "page": "1",
            "total": "10616",
            "user": "The1andONLYdave",
            "perPage": "200",
            "totalPages": "54"

for each page get every
track->artist->#text, if nowplaying=false, album, medium/small image and name(of track)
put them sorted by oldest first inside a sort of database (sqlite?)
only insert if not duplicate (by name,track) (not album so you dont get duplicates on different album/single etc
then start a check (first on button later in background service) to search for new entries, add them to DB and show android notification for each

so you can for example link spotify and get a notification if a new song was played (e.g. listing to new playlists/radio stations/suggestions) so you dont miss how the track was called if you like it




Please use an identifiable User-Agent header on all requests. This helps our logging and reduces the risk of you getting banned.
Use common sense when deciding how many calls to make. For example, if you're making a web application, try not to hit the API on page load. Your account may be suspended if your application is continuously making several calls per second. See our terms of service for more.


fastlane


https://github.com/square/moshi/blob/master/kotlin/reflect/src/main/resources/META-INF/proguard/moshi-kotlin.pro

https://github.com/square/moshi/blob/master/moshi/src/main/resources/META-INF/proguard/moshi.pro

https://github.com/square/moshi

https://github.com/The1andONLYdave/lastfmnewtracknotifier

https://www.last.fm/api/intro

https://www.last.fm/api/show/user.getRecentTracks

https://github.com/fastlane/fastlane


