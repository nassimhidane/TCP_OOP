/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicazioneserver_tcp.ip_oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nassimhidane
 */
public class Client {
    
    String nome;
    String colore;
    Socket connection;
    
    public Client(String nome, String colore){
        
        this.nome = nome;
        this.colore = colore;
    }
    
    public void connetti(String nomeServer, int portaServer){
        
        try {
            connection = new Socket(nomeServer, portaServer);
            
        }catch(ConnectException e){
            System.err.println("Server non disponibile!");
        }catch(UnknownHostException e1){
            System.err.println("Errore DNS!");
        }catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Errore scheda di rete");
             ex.printStackTrace();
        }
        
        System.out.println("Fuori Catch");
                
    }
    
    public void chiudi(){
        try {
            if (connection!=null)
                {
                    connection.close();
                    System.out.println("Connessione chiusa!");
                }
            }
            catch(IOException e){
                System.err.println("Errore nella chiusura della connessione!");
            }
        }
    
    public void scrivi(){
        
        String messaggio = null;
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in statica non ha new e inizia con S
            messaggio = br.readLine();
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            OutputStream os = connection.getOutputStream();
            os.write(messaggio.getBytes());
            os.flush();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void leggi(){
       
        
       
    }
    
}
