package com.Tarasov.CurrencyConverter.Phone;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Phone implements Closeable {

    private final Socket socket;
    private final BufferedReader bufferedReader;
    private final BufferedWriter bufferedWriter;
    private final ObjectInputStream objectReader;
    private final ObjectOutputStream objectWriter;


    public Phone(String ip, int port) {
        try {
            this.socket = new Socket("127.0.0.1", port);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
        this.bufferedReader = createReader();
        this.bufferedWriter = createWriter();
        this.objectWriter = createObjectWriter();
        this.objectReader = createObjectReader();

    }

    public Phone(ServerSocket serverSocket) {
        try {
            this.socket = serverSocket.accept();
            System.out.println( "client connected.....");

        this.bufferedReader = createReader();
        this.bufferedWriter = createWriter();
            System.out.println("constrr");
            this.objectWriter = createObjectWriter();
        this.objectReader = createObjectReader(); //new ObjectInputStream(socket.getInputStream());//createObjectReader();


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void writeLine(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
           throw  new RuntimeException(e);
        }
    }
   public void writeObject(Object object){
        try {
            objectWriter.writeObject(object);
            objectWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public Object readObject(){
        try {
            return  objectReader.readObject();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }

    private ObjectInputStream createObjectReader(){
        try{
            return new ObjectInputStream(socket.getInputStream());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private ObjectOutputStream createObjectWriter(){
        try{
            return new ObjectOutputStream(socket.getOutputStream());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BufferedReader createReader(){
        try {
            return new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private BufferedWriter createWriter(){
        try {
            return new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
        bufferedWriter.close();
        objectReader.close();
        objectWriter.close();
        socket.close();
    }
}
