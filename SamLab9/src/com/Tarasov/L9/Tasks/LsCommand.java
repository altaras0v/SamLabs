package com.Tarasov.L9.Tasks;

import java.io.File;

public class LsCommand implements AbstractCommand {
    @Override
    public void execute(String name) {
        File file = new File(name);
        File files[] =  file.listFiles();
        for (File f:files){
            System.out.println(f);
        }
    }
    public void execute() {
        File files[] =  FileManager.getDir().listFiles();
        for (File f:files){
            System.out.println(f);
        }
    }
}
