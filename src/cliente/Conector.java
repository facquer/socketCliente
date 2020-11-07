/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Conector extends Thread {

    Socket socket;
    BufferedReader entrada, teclado;
    PrintStream salida;

    public void run() {
        int i = 1;
        try {
            socket = new Socket(main.main.getVista().getTextIp().getText().toString(), Integer.valueOf(main.main.getVista().getTextPuerto().getText().toString()));
            main.main.getVista().getTextServer().setText("Conectado con el servidor");
            while (!socket.isClosed()) {
                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String msg = entrada.readLine();
                main.main.getVista().getTextServer().setText(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviarMsg() {
        try {
            String msg = main.main.getVista().getTextEnviar().getText().toString();
            salida = new PrintStream(socket.getOutputStream());
            salida.println(msg);
            main.main.getVista().getTextEnviar().setText("");
        } catch (IOException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

}
