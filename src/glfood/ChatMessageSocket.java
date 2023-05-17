/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package glfood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author ACER
 */
public class ChatMessageSocket {

   private Socket socket;
   private JTextPane txtMessageBoard;
   private PrintWriter out;
   private BufferedReader reader;

    public ChatMessageSocket(Socket socket, JTextPane txtMessageBoard) throws IOException {
        this.socket = socket;
        this.txtMessageBoard = txtMessageBoard;
        
        out = new PrintWriter(socket.getOutputStream());
        reader = new  BufferedReader(new InputStreamReader(socket.getInputStream()));
    
        //Tao ra qua trinh nhan du lieu tu phia socket
        receive();
    }
    private void receive(){
        Thread th = new Thread(){
            public void run(){
                while(true){
                    try {
                        String line = reader.readLine();
                        if(line !=null){
                            txtMessageBoard.setText(txtMessageBoard.getText() + "\nReply: " + line);
                        }        
                    } catch (Exception e) {
                    }
                }
            }
        };
        th.start();
    }
    public void send(String msg){
        String current = txtMessageBoard.getText();
        txtMessageBoard.setText(current + "\nSent: "+ msg);
        out.println(msg);
        out.flush();
    }
    public void close(){
        try {
            out.close();
            reader.close();
            socket.close();
        } catch (Exception e) {
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
