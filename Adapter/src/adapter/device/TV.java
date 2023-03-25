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
public class TV implements HDMI {

    @Override
    public void setImage(String image) {
        System.out.println("This video " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("This sound" + sound);
    }
    
}
