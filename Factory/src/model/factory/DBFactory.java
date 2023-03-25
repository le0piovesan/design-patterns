/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.factory;

import model.DB;

/**
 *
 * @author Leonardo
 */
public abstract class DBFactory {
    public DB createDBconnection(){
        DB db = null;
        
        db = createDB();
        
        db.create();
        db.connect();
        db.query();
        
        return db;
    }
    
    protected abstract DB createDB();
}
