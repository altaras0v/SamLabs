package com.Tarasov.L9.Tasks;

import java.io.File;

public class FindFileCommand implements AbstractCommand {
    @Override
    public void execute(String name) {
        File file = new File(FileManager.getDir().getAbsolutePath() + "\\" + name);
        if (file.exists()) {
            System.out.println("File was founded: " + file.getName());
        } else {
            System.out.println("File was not founded: ");
        }

    }
}

