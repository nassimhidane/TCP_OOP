/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicazioneserver_tcp.ip_oop;

/**
 *
 * @author nassimhidane
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Server s = new Server(2000);
        s.attendi();
        //s.leggi();
        //s.chiudi();
        
    }
    
}
