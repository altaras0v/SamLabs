package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.Client.ClientRequest;
import com.Tarasov.CurrencyConverter.Client.Interviewer;
import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.Phone.Phone;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.ServerSocket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(6868)) {
            ArrayDataBase dataBase = new ArrayDataBase();
            dataBase.initialize();
            System.out.println("Server started");
           while (true) {
                Phone phone = new Phone(serverSocket);
                int choice = Interviewer.getResult();


                    new Thread(() -> {
                     //   phone.openStream();
                        boolean q=true;
                        while (q==true) {

                            String stringResponse = phone.readLine();
                            switch (stringResponse) {

                                case "Get currency map":
                                    Object request = ArrayDataBase.getCurrencyMap();
                                    phone.writeObject(request);
                                    String stringRespose1 = phone.readLine();
                                    System.out.println(stringRespose1);
                                    Object response = phone.readObject();
                                    Converter converter = new Converter((ClientRequest) response);
                                    converter.convert();

                                    request = converter.getResult();
                                    phone.writeObject(request);

                                    break;
                                case "Give me DataBase":
                                    Object request1 = ArrayDataBase.getCurrencyMap();
                                    phone.writeObject(request1);
                                    Object response1 = phone.readObject();
                                    Object request2 = (ArrayDataBase.toList(response1));
                                    phone.writeObject(request2);

                                    break;
                                case "q":
                                    q = false;
                                    break;
                                default:
                                    break;
/*
                                //ДЛЯ ВТОРОГО КЕЙСА
                                String stringResponse2 = phone.readLine();
                                System.out.println(stringResponse2);


                                                //ДЛЯ ПЕРВОГО КЕЙСА
                                     /*  String stringResponse = phone.readLine();
                                        System.out.println(stringResponse);
                                        Object request = ArrayDataBase.getCurrencyMap();
                                        phone.writeObject(request);
                                        String stringRespose1 = phone.readLine();
                                        System.out.println(stringRespose1);
                                        Object response = phone.readObject();
                                        Converter converter = new Converter((ClientRequest)response);
                                        converter.convert();

                                        request = converter.getResult();
                                        phone.writeObject(request);*/
                            }
                        }
                         try {
                                phone.close();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }

                    }).start();
                }

            }  catch(NullPointerException e){
                e.printStackTrace();
            }
            System.out.println("1");
        }

}

