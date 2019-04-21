package com.Tarasov.CurrencyConverter.UserCommand;

import com.Tarasov.CurrencyConverter.Client.UserRequest;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Save data to text file
 */
public class SaveToTextFileCommand implements AbstractCommand {
    Date date = new Date();

    /**
     * Save result of conversion to text file
     * @param convertValues - list of convert currency
     * @param userRequest   - data that user entered
     */
    public void execute(Object convertValues, Object userRequest) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createFile());
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            Writer writer = new BufferedWriter(outputStreamWriter);
            writer.write((String.format("Текущая дата и время: %tc", date)) + "\r\n\r\n" + "Результат конвертации" + "\r\n\r\n");
            ArrayList arrayList = (ArrayList) convertValues;
            for (int i = 0; i < arrayList.size(); i = i + 3) {
                writer.write(((UserRequest) userRequest).getValueOfCurrency() + " " + arrayList.get(i) + " = "
                        + arrayList.get(i + 2) + " " + arrayList.get(i + 1) + "\r\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file .txt");
        }

    }

    /**
     * Save exchange rates to text file
     * @param convertValues - list of exchange rates
     */
    public void execute(Object convertValues) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createFile());
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            Writer writer = new BufferedWriter(outputStreamWriter);
            ArrayList arrayList = (ArrayList) convertValues;
            writer.write((String.format("Текущая дата и время: %tc", date)) + "\r\n\r\n" + "Курс " + arrayList.get(0) + "\r\n\r\n");
            for (int i = 0; i < arrayList.size(); i = i + 3) {
                writer.write("1 " + arrayList.get(i) + " = " + arrayList.get(i + 2) + " " + arrayList.get(i + 1) + "\r\n");
            }

            writer.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file .txt");
        }

    }

    /**
     * Create text file
     * Name of file is the current date
     * @return empty text file
     */
    public File createFile() {
        System.out.println(date);
        String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss'.txt'").format(new Date());
        File statText = new File("C:\\test\\" + out);
        return statText;
    }

    @Override
    public void execute() {

    }

}
