/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.device;
import adapter.inter.HDMI;
/**
 *
 * @author Leonardo
 */
public class Computer {
    private HDMI port;
    
    public void connectPort(HDMI screen){
        System.out.println("Connecting on HDMI port...");
        this.port = screen;
    }
    
    public void sendImageAndSound(String image, String sound){
        if(port == null){
            System.out.println("Connect HDMI");
        }
        else{
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
