/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import model.DB;
import model.factory.DBFactory;
import model.factory.OracleDBFactory;
import model.factory.PostgresDBFactory;

/**
 *
 * @author Leonardo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBFactory OracleDB = new OracleDBFactory();
        DBFactory PostgresDB = new PostgresDBFactory();

       DB oracle = OracleDB.createDBconnection();
       System.out.println(oracle);
       
       DB postgres = PostgresDB.createDBconnection();
       System.out.println(postgres);
    }
    
}
