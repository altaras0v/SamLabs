package com.Tarasov.CurrencyConverter.Phone;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Class that create socket
 * And all streams for socket
 */
public class Phone implements Closeable {

    private final Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private ObjectInputStream objectReader;
    private ObjectOutputStream objectWriter;

    /**
     * Create socket fo client
     * @param ip - ip address
     * @param port - socket port
     */
    public Phone(String ip, int port) {
        try {
            this.socket = new Socket("127.0.0.1", port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.bufferedReader = createReader();
        this.bufferedWriter = createWriter();
        this.objectWriter = createObjectWriter();
        this.objectReader = createObjectReader();

    }

    /**
     * Create socket for server
     * @param serverSocket - Object of SeverSocket
     */
    public Phone(ServerSocket serverSocket) {
        try {
            this.socket = serverSocket.accept();
            this.bufferedReader = createReader();
            this.bufferedWriter = createWriter();
            this.objectWriter = createObjectWriter();
            this.objectReader = createObjectReader();


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Write string line
     * @param message - command
     */
    public void writeLine(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read string line
     * @return command that was sent
     */
    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Write object
     * @param object - any object
     */
    public void writeObject(Object object) {
        try {
            objectWriter.writeObject(object);
            objectWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Read object that returned
     * @return any object
     */
    public Object readObject() {
        try {
            return objectReader.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create ObjectInputStream
     * @return ObjectInputStream
     */
    private ObjectInputStream createObjectReader() {
        try {
            return new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Create ObjectOutputStream
     * @return ObjectOutputStream
     */
    private ObjectOutputStream createObjectWriter() {
        try {
            return new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Create BufferReader from InputStreamReader
     * @return BufferedReader
     */
    private BufferedReader createReader() {
        try {
            return new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Create BufferedWriter from OutputStreamWriter
     * @return BufferedWriter
     */
    private BufferedWriter createWriter() {
        try {
            return new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Close streams and socket
     */
    @Override
    public void close() throws IOException {
        bufferedReader.close();
        bufferedWriter.close();
        objectReader.close();
        objectWriter.close();
        socket.close();
    }
}
