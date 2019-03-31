package com.Tarasov.L9.Tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DispalyFileCommand implements AbstractCommand {
    @Override
    public void execute(String name) {
        try {
            FileReader fileReader = new FileReader(name);
            int c;
            while((c=fileReader.read())!=-1){

                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
