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
public class JanelaTestes extends JFrame {
    public static JanelaTestes j = null;
    
    public JanelaTestes(){
        setPreferredSize(new Dimension(500, 300));
    }
    

}
