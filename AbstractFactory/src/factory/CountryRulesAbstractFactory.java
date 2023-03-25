/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import model.Certificate;
import model.Packing;

/**
 *
 * @author Leonardo
 */
public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
