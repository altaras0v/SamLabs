package com.Tarasov.CurrencyConverter.Client;

import com.Tarasov.CurrencyConverter.com.Tarasov.CurrencyConverter.Phone.Phone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        try(Phone phone = new Phone("127.0.0.1",8000))
        {
            System.out.println("Connected");
            String request = "Minsk";
            phone.writeLine(request); // то, что отправится


            String response = phone.readLine(); //то, что придёт
            System.out.println("Response" + response);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
