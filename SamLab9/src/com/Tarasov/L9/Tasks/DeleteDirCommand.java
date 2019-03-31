package com.Tarasov.L9.Tasks;

import java.io.File;

public class DeleteDirCommand implements AbstractCommand {
    @Override
    public void execute(String name) {

        File rDir = new File(name);
        if(rDir.exists()){
        rDir.delete();
        }
        else System.out.println("Does not exist ");
    }
}
