package com.Tarasov.L9.Tasks;

import java.io.File;

import java.util.Scanner;

public class FileManager {
    public String currentDir = "";
    public static File dir = new File("C:\\Programs");
    private static AbstractCommand lsCommand = new LsCommand();
    private static AbstractCommand touchCommand = new TouchFileCommand();


    public static void inputter() {
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


