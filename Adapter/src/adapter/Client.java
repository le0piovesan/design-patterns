/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

import adapter.device.Computer;
import adapter.device.OldMonitor;
import adapter.device.TV;
import add.HDMIMonitorAdapter;
import add.HDMITVAdapter;

/**
 *
 * @author Leonardo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Computer pc = new Computer();
        // OldMonitor monit = new OldMonitor();
        TV tv = new TV();
        
        // pc.connectPort(monit);
        pc.connectPort(tv);
        
        System.out.println("Classe");
        
        
        HDMIMonitorAdapter monitor = new HDMIMonitorAdapter();
        //pc.connectPort(monitor);

        pc.connectPort(new HDMITVAdapter(monitor));

        pc.sendImageAndSound("Imagem ok", "Sound ok");
        
        
        
        
        
    }
    
}
