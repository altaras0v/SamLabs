package com.Tarasov.L9.Tasks;

import java.io.File;

public class RemoveFileCommand implements AbstractCommand {

    @Override
    public void execute(String name) {
        File f = new File(name  );
        f.delete();
    }
}
