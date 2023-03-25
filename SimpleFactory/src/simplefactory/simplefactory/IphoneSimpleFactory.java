/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.simplefactory;

import simplefactory.model.Iphone;
import simplefactory.model.Iphone13;
import simplefactory.model.Iphone13Pro;

/**
 *
 * @author Leonardo
 */
public class IphoneSimpleFactory {
    public static Iphone orderIphone(String generation, String level) {
        Iphone device = null;
        
        if(generation.equals(generation)){
            
            if(level.equals("1")){
                device = new Iphone13();
            } 
            else if(level.equals("2")) {
                device = new Iphone13Pro();
            }
        }
        
        if(device != null) {
            device.getHardware();
            device.assemble();
            device.certificate();
            device.pack();
        }

        
        return device;
    }
}