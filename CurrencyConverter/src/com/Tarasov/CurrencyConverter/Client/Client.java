package com.Tarasov.CurrencyConverter.Client;

import com.Tarasov.CurrencyConverter.Phone.Phone;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand.ExitCommand;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand.GetConvertValue;
import com.Tarasov.CurrencyConverter.RequestResponseCommand.ClientCommand.GetExchangeRates;

import java.io.IOException;

/**
 * Client
 * Client part of program
 * Ask user about actions
 * And send request to server
 */
public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone("127.0.0.1", 6868)) {
            boolean q = true;
            while (q) {
                Interviewer.getInterview();                                                 // Ask user
                int choice = Interviewer.getResult();

                switch (choice) {
                    case 1:
                        new GetConvertValue().executeRequest(phone);                        //Convert currency
                        break;
                    case 2:
                        new GetExchangeRates().executeRequest(phone);                       //Exchange rates
                        break;
                    case 3:
                        new ExitCommand().executeResponse(phone);                           //Exit
                        phone.close();                                                      //Close streams
                        q = false;
                        break;
                    default:
                        break;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
