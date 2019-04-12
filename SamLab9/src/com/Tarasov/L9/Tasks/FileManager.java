package com.Tarasov.L9.Tasks;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class FileManager {

    public String currentDir = "";
    public static File dir = new File("C:\\test");
    private static AbstractCommand lsCommand = new LsCommand();
    private static AbstractCommand touchCommand = new TouchFileCommand();

    public List<String> mainNames = new ArrayList<>();

    public static void inputter() throws InterruptedException {
  //      Exchanger<List<String>> ex=new Exchanger<>();
        System.out.println("Введите данные");
        Scanner sc = new Scanner(System.in);
        String userData = "";
        boolean f = true;
        while (f == true) {
            userData = sc.nextLine();
            String[] commands = userData.split(" ");
            switch (commands[0]) {
                case "q":
                    System.exit(0);
                    break;
                case "findFile":
                    new FindFileCommand().execute(commands[1]);
                    break;

                case "ls":
                    if (commands.length == 1) {
                        new LsCommand().execute();
                    } else new FindFileCommand().execute(commands[1]);
                    break;

                case "createDir":
                    new CreateDirCommand().execute(commands[1]);
                    break;

                case "deleteDir":
                    new DeleteDirCommand().execute(commands[1]);
                    break;

                case "removeFile":
                    new RemoveFileCommand().execute(commands[1]);
                    break;

                case "displayFile":
                    new DispalyFileCommand().execute(commands[1]);
                    break;

                case "cd":
                    new CDCommand().execute(commands[1]);
                    break;

                case "touchFile":
                    new TouchFileCommand().execute(commands);
                    break;
                case "grep":
                    Thread th = new Thread(new GrepCommand("hello"));
                    th.start();
                    List<String> mainNames=GrepCommand.ex.exchange(null);
                    System.out.println(mainNames.toString());
                    System.out.println(mainNames.size());
                    //Thread.UncaughtExceptionHandler handler = (t, e) -> System.out.println("ewe");
                    //th.setUncaughtExceptionHandler(handler);


                    long StartTime = System.currentTimeMillis();

                    long total = 0;
                    long TotalTime;

//                    TimeUnit.MILLISECONDS.sleep(100);
//                    if(th.isAlive()){
//                        th.interrupt();
//                    }

                    break;

                default:
                    break;
            }

        }
    }


    public static File getDir() {
        return dir;
    }

    public static void setDir(File dir) {
        FileManager.dir = dir;
    }

}


