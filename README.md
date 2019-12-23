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

