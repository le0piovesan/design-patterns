/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package add;

import adapter.inter.HDMI;
import adapter.inter.VGA;

/**
 *
 * @author Leonardo
 */
public class HDMITVAdapter implements HDMI {
    
    private VGA vga;

    public HDMITVAdapter(VGA vga) {
        System.out.println("Connecting");
        this.vga = vga;
    }
    
    
    
    @Override
    public void setImage(String image) {
        System.out.println("Converting");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry no sound");
    }
    
}
