# Jellyfin-Audio-Organizer
A simple program that organizes files in the "jellyfin" way.

# Structure
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

# Usage
- Run the program.
- Enter the path to your MP3 files.
- The program will generate the correct folders in the same path (cannot be changed at the moment)

# Dependencies
- mp3agic (com.mpatric) version 0.9.1

# Download instructions
Using the Jar:
Download the jar-file from releases.
Run the said jar-file like this:
```
java -jar path\to\jar
```

Built with Java 11 (corretto)
