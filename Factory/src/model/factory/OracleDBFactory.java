/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.factory;

import model.DB;
import model.OracleDB;

/**
 *
 * @author Leonardo
 */
public class OracleDBFactory extends DBFactory {

    @Override
    protected DB createDB() {
        return new OracleDB();
    }
    
}
