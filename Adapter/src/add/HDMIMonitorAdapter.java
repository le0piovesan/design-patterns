/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add;

import adapter.device.OldMonitor;
import adapter.inter.HDMI;

/**
 *
 * @author Leonardo
 */
public class HDMIMonitorAdapter extends OldMonitor implements HDMI {
    
    public HDMIMonitorAdapter() {
        super();
        System.out.println("Adapter Monitor");
    }
    
    @Override
    public void setImage(String image) {
        System.out.println("Image converting");
        super.setImage(image);
    }
    
    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, no sound");
    }
    
}
