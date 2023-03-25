/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.device;

import adapter.inter.VGA;

/**
 *
 * @author Leonardo
 */
public class OldMonitor implements VGA {
    
    @Override
    public void setImage(String image){
        System.out.println("Send video " + image);
    }
}
