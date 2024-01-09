package xyz.cthi1;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sort {
    File source;
    File destination;
    Path completeDestination;
    public Sort(Path song, Path base) throws InvalidDataException, UnsupportedTagException, IOException {
        source = new File(song.toUri());
        Data data = new Data(song);

        destination = Paths.get(base.toString(), data.GetArtist(), data.GetAlbum()).toFile();
        completeDestination = Paths.get(String.valueOf(destination), data.GetSongNumber() + " - " + String.valueOf(song.getFileName()));
        Files.createDirectories(destination.toPath());
        if(!completeDestination.toFile().exists()) {
            Files.move(source.toPath(), completeDestination, StandardCopyOption.REPLACE_EXISTING);
        }
        Main.completed++;
    }
}
