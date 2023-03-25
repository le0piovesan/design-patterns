/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplefactory;

import simplefactory.model.Iphone;
import simplefactory.simplefactory.IphoneSimpleFactory;

/**
 *
 * @author Leonardo
 */
public class Client {   

    public static void main(String[] args) {
        System.out.println("Criar Iphone");
        
        Iphone iphone = IphoneSimpleFactory.orderIphone("Iphone13", "2");
        
        System.out.println(iphone);
    }   
}
