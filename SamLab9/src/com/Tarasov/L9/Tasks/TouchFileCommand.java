package com.Tarasov.L9.Tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TouchFileCommand implements AbstractCommand {
    @Override
    public void execute(String name) {

    }
    public void execute(String[] arr) {
        File file = new File(FileManager.getDir().getAbsolutePath() + "\\" + arr[1]);
        try {
            if (file.createNewFile()) {
                System.out.println("File was created");
            } else {
                System.out.println("File was not created");
            }
            OutputStream outputStream = new FileOutputStream(file);
            for (int i = 2; i < arr.length; i++) {
                outputStream.write(arr[i].getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
