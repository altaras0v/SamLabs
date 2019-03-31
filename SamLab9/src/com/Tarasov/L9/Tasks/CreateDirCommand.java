package com.Tarasov.L9.Tasks;

import java.io.File;

public class CreateDirCommand implements AbstractCommand {
    @Override
    public void execute(String name) {
        File newDir = new File(name);
        newDir.mkdir();
    }
}
