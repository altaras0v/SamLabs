package com.Tarasov.CurrencyConverter.Server;

import com.Tarasov.CurrencyConverter.DataBase.ArrayDataBase;
import com.Tarasov.CurrencyConverter.DataBase.TextFileDatabase;
import com.Tarasov.CurrencyConverter.Phone.Phone;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand.GiveConvertValue;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ServerCommand.GiveExchangeRates;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Server
 * Server part of program
 * Accepts requests from the client and processes them
 * And send request to client
 */
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
                    boolean q = true;
                    while (q) {

                        String stringResponse = phone.readLine();                   //Request from client
                        switch (stringResponse) {

                            case "Give ConvertValue":
                                new GiveConvertValue().executeResponse(phone);      // Convert currency
                                break;
                            case "Give ExchangeRates":
                                new GiveExchangeRates().executeResponse(phone);     //Exchange rates
                                break;
                            case "Exit":
                                q = false;
                                break;
                            default:
                                break;
                        }
                    }
                    try {
                        phone.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }).start();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}

