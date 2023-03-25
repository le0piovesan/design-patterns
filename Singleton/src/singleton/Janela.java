/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Leonardo
 */
public class Janela extends JFrame {
    private static Janela j = null;
    
    private Janela(){
        setPreferredSize(new Dimension(500, 300));
    }
    
    public static Janela getInstance(){
        if(j == null) j = new Janela();
        
        return j;
        
    }
}
