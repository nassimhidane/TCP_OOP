/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicazioneserver_tcp.ip_oop;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nassimhidane
 */
public class Server {
    
    ServerSocket ss;
    Socket s;
    int porta=2000;

    public Server(int porta) {
        this.porta = porta;
        //oggetto da usare per realizzare la connessione TCP
         
    }
    
    public Socket attendi(){
        try {
            //oggetto connection socket - serve si mette su asdcolto
            // istrzuiine che si poteva mettere sul costruttore
            ss = new ServerSocket(porta);
            //metodo bloccante fino a quando che il client fa richiesta
            s = ss.accept(); // s --> socket del client , ss --> socket del server
            //s è un daban socket ....> is, os
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
         
            return s;
        
    }
   

    public void scrivi(){
        
    }
    public void leggi(){
        
        String messaggioRicevuto; // inputStream
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            messaggioRicevuto = br.readLine();
            System.out.println(messaggioRicevuto);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
      
    
    public void chiudi(){
        
    }
    public void termina(){
        
    }
    
    
}
