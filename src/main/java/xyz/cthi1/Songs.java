package xyz.cthi1;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Songs {

    File folder;
    List<File> files = new ArrayList<File>();
    public Songs(Path base) {
        folder = base.toFile();
    }
    public List<File> Get() {
        Main.files = folder.listFiles().length;
        if(this.folder.isDirectory()) {
            for(File file : folder.listFiles()) {
                if(file.getName().endsWith(".mp3")) {
                    files.add(file);
                }

            }
        }
        return files;
    }

    public void FreeFiles() {
        files.clear();
    }
}
