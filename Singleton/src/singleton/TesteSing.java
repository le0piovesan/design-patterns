/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Leonardo
 */
public class TesteSing {
    private static TesteSing t = null;
    
    private TesteSing(){
        
    }
    
    public static TesteSing getInstance(){
        if(t == null) t = new TesteSing();
        return t;
    }
    
}
