package com.Tarasov.L9.Tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class GrepCommand implements AbstractCommand,Runnable{

    public static Exchanger<List<String>> ex=new Exchanger<>();

        private String name;
        public static List<String> myNames = new ArrayList<>();

    public GrepCommand(String name) {
        this.name = name;
    }

    public List<String> getMyNames() {
        return myNames;
    }

    @Override
    public synchronized void execute(String name) {
        File files[] =  FileManager.getDir().listFiles();
        for(File file:files){
            StringBuilder sb = new StringBuilder();


            try {
                //Объект для чтения файла в буфер
                BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
                try {
                    //В цикле построчно считываем файл
                    String s;
                    while ((s = in.readLine()) != null) {
                        if(s.contains(name)){
                            myNames.add(file.getName());
                            //System.out.println(file.getName());
                        }
                    }
                    ex.exchange(myNames);
                    RuntimeException e = new RuntimeException();
                    throw e;
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван");
                    //e.printStackTrace();

                } finally {
                    //Также не забываем закрыть файл
                    in.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }


        }

    }

    @Override
    public void run() {
        execute(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
            //  e.printStackTrace();
        }
    }
}
