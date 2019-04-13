package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.com.Tarasov.CurrencyConverter.Phone.Phone;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            //изб от srversocket.close
            System.out.println("Server started");
            while (true){
               Phone phone = new Phone(serverSocket);

                    new Thread(()-> {
                       String request = phone.readLine();
                       System.out.println("Request: " + request); // то, что придёт
                       String response = (int) (Math.random() * 30 - 10) + "";
                       try {
                           Thread.sleep(4000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       phone.writeLine(response); //то, что отправится
                       System.out.println("Response: " + response);
                        try {
                            phone.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }).start();
               }

                }  catch (NullPointerException e) {
                   e.printStackTrace();
                }

        }
}

