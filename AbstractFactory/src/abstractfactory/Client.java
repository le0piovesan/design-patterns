/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstractFactory;

import factory.BrazillianRulesAbstractFactory;
import factory.CountryRulesAbstractFactory;
import factory.USRulesAbstractFactory;

/**
 *
 * @author Leonardo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CountryRulesAbstractFactory BR = new BrazillianRulesAbstractFactory();
        CountryRulesAbstractFactory US = new USRulesAbstractFactory();
        
        System.out.println(BR.getCertificates().applyCertification());
        System.out.println(BR.getPacking().Pack());
        System.out.println(US.getCertificates().applyCertification());
        System.out.println(US.getPacking().Pack());
        
    }
    
}
