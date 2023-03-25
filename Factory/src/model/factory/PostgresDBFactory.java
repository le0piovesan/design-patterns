/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.factory;

import model.DB;
import model.PostgresDB;

/**
 *
 * @author Leonardo
 */
public class PostgresDBFactory extends DBFactory {

    @Override
    protected DB createDB() {
        return new PostgresDB();
    }
    
}
