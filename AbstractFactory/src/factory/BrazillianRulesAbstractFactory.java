/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import model.BrazillianCertificate;
import model.BrazillianPacking;
import model.Certificate;
import model.Packing;

/**
 *
 * @author Leonardo
 */
public class BrazillianRulesAbstractFactory implements CountryRulesAbstractFactory {

    @Override
    public Certificate getCertificates() {
        return new BrazillianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazillianPacking();
    }
    
}
