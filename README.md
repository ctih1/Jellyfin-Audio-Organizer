# Jellyfin-Audio-Organizer
A simple program that organizes files in the "jellyfin" way.

The songs will be organized like this:
(note: /Music (aka base path) should be the directory where the mp3 files are stored.)
```
/Music
    /Artist
        /Album
            01 - Song.mp3
            02 - Song.mp3
```

(aka):

```
/Music
  /Kanye West
    /The Life Of Pablo
      02 - Kanye West - Father Stretch My Hands Pt. 1.mp3
      ...
```

if the programs fails to detect something it will default to "Unknown".

```
/Music
  /Unknown
    /Unknown
      Unknown - (song name).mp3
```

Built with Java 11 (corretto)
