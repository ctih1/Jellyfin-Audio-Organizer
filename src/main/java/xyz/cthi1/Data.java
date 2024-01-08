package xyz.cthi1;

import com.mpatric.mp3agic.*;

import java.io.IOException;
import java.nio.file.Path;

public class Data {
    Mp3File file;
    ID3v1 tagv1;
    ID3v2 tagv2;
    String number;
    public Data(Path path) throws InvalidDataException, UnsupportedTagException, IOException {
        this.file = new Mp3File(path);
        tagv1 = file.getId3v1Tag();
        tagv2 = file.getId3v2Tag();
    }

    public String GetAlbum() {
        if(tagv1!=null) {
            return tagv1.getAlbum();
        }
        if(tagv2!=null) {
            return tagv2.getAlbum();
        }
        else {
            return "Unknown";
        }
    }
    public String GetArtist() {
        if(tagv1!=null) {
            return tagv1.getArtist();
        }
        if(tagv2!=null) {
            return tagv2.getAlbumArtist();
        }
        else {
            return "Unknown";
        }
    }
    public String GetSongNumber() {
        if(tagv1!=null) {
            number = tagv1.getTrack().split("/")[0];
            if(number.length() < 10) {
                number = "0"+number;
            }
            return number;
        }
        if(tagv2!=null) {
            number = tagv2.getTrack().split("/")[0];
            if(number.length() < 10) {
                number = "0"+number;
            }
            return number;
        }
        else {
            return "Unknown";
        }
    }
}
