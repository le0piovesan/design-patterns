/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author Leonardo
 */
public class SingletonJanela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TesteSing ts = new TesteSing(); Nao consegue instanciar "normalmente"
        
        // Singleton instancia mesmo objeto
        
        TesteSing ts = TesteSing.getInstance();
        System.out.println(ts);
        
        TesteSing ts2 = TesteSing.getInstance();
        System.out.println(ts2);
        
        // Instancia normal gera objetos diferentes cada vez
        
        Teste t = new Teste();
        System.out.println(t);
        
        Teste t2 = new Teste();
        System.out.println(t2);
        
    }
    
}
