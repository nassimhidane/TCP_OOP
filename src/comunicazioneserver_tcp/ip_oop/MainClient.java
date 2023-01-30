/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comunicazioneserver_tcp.ip_oop;

/**
 *
 * @author nassimhidane
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client c1 = new Client("Nassim","Verde");
        
        c1.connetti("localhost", 2000);
        c1.scrivi();
        c1.chiudi();
      
    }
    
}
