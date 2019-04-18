package com.Tarasov.CurrencyConverter.Client;

import com.Tarasov.CurrencyConverter.Command.ChooserCommand;
import com.Tarasov.CurrencyConverter.Phone.Phone;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        //Object request;
        //Object response;
      //  String stringRequest;
        try(Phone phone = new Phone("127.0.0.1",6868)) {

            while (true) {
                Interviewer.getInterview();
                int choice = Interviewer.getResult();

                switch (choice) {
                    case 1:

                        String stringRequest = "Get currency map";
                        phone.writeLine(stringRequest);
                        Object response = phone.readObject();
                        System.out.println(response);

                        stringRequest = "Get convert value";
                        phone.writeLine(stringRequest);
                        ChooserCommand command = new ChooserCommand();
                        Object request1 = command.chooseCommand(1, response);
                        phone.writeObject(request1);
                        Object response1 = phone.readObject();
                        System.out.println(response1);
                        ChooserCommand command1 = new ChooserCommand();
                        command1.chooseCommand(3,response1,request1);

                        break;
                    case 2:
                        String stringRequest2 = "Give me DataBade";
                        phone.writeLine(stringRequest2);
                        Object response2 = phone.readObject();
                        System.out.println(response2);
                        ChooserCommand command2 = new ChooserCommand();
                        Object request2 = command2.chooseCommand(2, response2);
                        String s = request2.toString();
                        phone.writeObject(request2); //отпр строку с выбр валютой
                        ChooserCommand command3 = new ChooserCommand();
                        Object response3 = phone.readObject();
                        command3.chooseCommand(3,response3,null);
                        //phone.writeLine(request);// то, что отправится
                        //String response = phone.readLine();
                        //System.out.println(response);
                        break;
                    default:
                        break;
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
