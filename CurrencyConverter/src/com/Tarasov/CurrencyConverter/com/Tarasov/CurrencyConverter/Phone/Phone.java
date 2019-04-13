package com.Tarasov.CurrencyConverter.com.Tarasov.CurrencyConverter.Phone;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Phone implements Closeable {

    private final Socket socket;
    private final BufferedReader bufferedReader;
    private final BufferedWriter bufferedWriter;

    public Phone(String ip, int port) {
        try {
            this.socket = new Socket(ip, port);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
        this.bufferedReader = createReader();
        this.bufferedWriter = createWriter();
    }

    public Phone(ServerSocket serverSocket) {
        try {
            this.socket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.bufferedReader = createReader();
        this.bufferedWriter = createWriter();
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
        socket.close();
    }
}
