package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.DataBase.TextFileDatabase;
import com.Tarasov.CurrencyConverter.Phone.Phone;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand.GiveConvertValue;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand.GiveExchangeRates;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(6868)) {
            //ArrayDataBase dataBase = new ArrayDataBase();
            TextFileDatabase dataBase = new TextFileDatabase();
            dataBase.initialize();
            System.out.println("Server started");
           while (true) {
                Phone phone = new Phone(serverSocket);


                    new Thread(() -> {
                     //   phone.openStream();
                        boolean q=true;
                        while (q) {

                            String stringResponse = phone.readLine();
                            switch (stringResponse) {

                                case "Give ConvertValue":
                                    new GiveConvertValue().executeResponse(phone);

                                    break;
                                case "Give ExchangeRates":
                                   new GiveExchangeRates().executeResponse(phone);

                                    break;
                                case "Exit":
                                    q=false;
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
                                        Converter converter = new Converter((UserRequest)response);
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

