/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplefactory.model;

/**
 *
 * @author Leonardo
 */
public abstract class Iphone {
    public abstract void getHardware();
    
    public void assemble(){
        System.out.println("Assembling all the hardware");
    }
    
    public void certificate(){
        System.out.println("Testing");
    }
    
    public void pack(){
        System.out.println("Packing");
    }
    
}
