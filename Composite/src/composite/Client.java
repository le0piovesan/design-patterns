/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

import composite.model.File;
import composite.model.Folder;

/**
 *
 * @author Leonardo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f1 = new File("teste file1");
        File f2 = new File("teste file2");
        File f3 = new File("teste file3");
        
        Folder fd = new Folder("teste folder");
        
        fd.add(f1);
        fd.add(f2);
        fd.add(f3);

        
        fd.print("");
    }
    
}
