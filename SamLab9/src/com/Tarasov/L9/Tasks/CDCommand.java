package com.Tarasov.L9.Tasks;

import java.io.File;

public class CDCommand implements AbstractCommand {
    @Override
    public void execute(String name) {
        File file= new File(name);
        FileManager.setDir(file);
    }
}
